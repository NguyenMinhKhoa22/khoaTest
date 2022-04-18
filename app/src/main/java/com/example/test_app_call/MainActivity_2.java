package com.example.test_app_call;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        callList_2();
    }
    public void callList_2() {
        RecyclerView recyclerView = findViewById(R.id.recycler_2);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(10, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<Test> testArrayList = new ArrayList<>();

        testArrayList.add(new Test("Khoa 1", R.drawable.meme_0));
        testArrayList.add(new Test("Khoa 2", R.drawable.meme_1));
        testArrayList.add(new Test("Khoa 3", R.drawable.meme2));
        testArrayList.add(new Test("Khoa 4", R.drawable.meme7));
        testArrayList.add(new Test("Khoa 5", R.drawable.meme8));

        TestAdapter testAdapter = new TestAdapter(getApplicationContext(), testArrayList);
        recyclerView.setAdapter(testAdapter);

    }
}