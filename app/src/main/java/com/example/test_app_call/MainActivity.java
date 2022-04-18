package com.example.test_app_call;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callList();
    }

    public void callList() {
        RecyclerView recyclerView = findViewById(R.id.main_rec);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(10, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<InfoUser> InfoArrayList = new ArrayList<>();
        InfoArrayList.add(new InfoUser("NGUYEN MINH KHOA", "having or displaying warmth or fondness","09123456789",R.drawable.meme1));
        InfoArrayList.add(new InfoUser("NGUYEN MINH TAN", "willing to undertake new and daring enterprises","39123456789",R.drawable.meme2));
        InfoArrayList.add(new InfoUser("TONG MINH HOA", "expressing compassion or friendly fellow feelings","69123456789",R.drawable.meme3));
        InfoArrayList.add(new InfoUser("NGUYEN MINH TUAN", "marked by independence and creativity in thought or action","29123456789",R.drawable.meme4));
        InfoArrayList.add(new InfoUser("LE MINH KHOI", "guided by experience and observation rather than theory","99123456789",R.drawable.meme5));
        InfoArrayList.add(new InfoUser("ASUO ABC", "temperamentally seeking and enjoying the company of others","88123456789",R.drawable.meme6));
        InfoArrayList.add(new InfoUser("NGUYEN ANH HÂN", "demonstrating striking cleverness and humor","79123456789",R.drawable.meme7));
        InfoArrayList.add(new InfoUser("TRAN MINH KHOA", "free from undue bias or preconceived opinions","7773456789",R.drawable.meme8));
        InfoArrayList.add(new InfoUser("NGUYEN VĂN A", "having or displaying warmth or fondness","11123456789",R.drawable.meme9));
        InfoArrayList.add(new InfoUser("HÀ MINH HE", "having a strong desire for success or achievement","669123456789",R.drawable.meme10));

        InfoUserAdapter infoUserAdapter = new InfoUserAdapter(InfoArrayList, getApplicationContext());
        recyclerView.setAdapter(infoUserAdapter);


    }
}