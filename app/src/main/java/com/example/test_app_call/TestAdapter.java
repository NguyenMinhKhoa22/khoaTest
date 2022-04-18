package com.example.test_app_call;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder>{

    Context context;
    ArrayList<Test> tests;

    public TestAdapter(Context context, ArrayList<Test> tests) {
        this.context = context;
        this.tests = tests;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_row_2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tv_title_2.setText(tests.get(position).getTitle_2());
        holder.iv_image_2.setImageResource(tests.get(position).getImage_2());

    }

    @Override
    public int getItemCount() {
        return tests.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title_2;
        ImageView iv_image_2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title_2 = itemView.findViewById(R.id.textView_title_row_2);
            iv_image_2 = itemView.findViewById(R.id.imageView_Img_row_2);
        }
    }
}
