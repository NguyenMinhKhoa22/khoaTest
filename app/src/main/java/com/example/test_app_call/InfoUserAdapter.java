package com.example.test_app_call;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class InfoUserAdapter extends RecyclerView.Adapter<InfoUserAdapter.ViewHolder>{
    Context context;
    ArrayList<InfoUser> infoUsers;


    public InfoUserAdapter(ArrayList<InfoUser> infoUsers, Context context) {
        this.infoUsers = infoUsers;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.Name_row.setText(infoUsers.get(position).getRowName());
        holder.Name_row.setSelected(true);
        holder.Phone_row.setText(infoUsers.get(position).getRowPhone());
        holder.Phone_row.setSelected(true);
        holder.Img_row.setImageResource(infoUsers.get(position).getRowImg());

        holder.Img_row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dialogview = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.dialog_detail_user, null);

                dialogview.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                de.hdodenhof.circleimageview.CircleImageView dialog_img;
                TextView dialog_name;
                TextView dialog_dsc;
                TextView dialog_phone;

                dialog_img   = dialogview.findViewById(R.id.img_row_dialog);
                dialog_name  = dialogview.findViewById(R.id.tv_name_dialog);
                dialog_name.setSelected(true);
                dialog_dsc   = dialogview.findViewById(R.id.tv_dsc_dialog);
                dialog_phone = dialogview.findViewById(R.id.tv_phone_dialog);

                dialog_img.setImageResource(infoUsers.get(position).getRowImg());
                dialog_name.setText(infoUsers.get(position).getRowName());
                dialog_dsc.setText(infoUsers.get(position).getRowDsc());
                dialog_phone.setText(infoUsers.get(position).getRowPhone());
                builder.setView(dialogview);

                builder.setCancelable(true);
                builder.show();


            }
        });


    }

    @Override
    public int getItemCount() {
        return infoUsers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Name_row;
        TextView Phone_row;
        CircleImageView Img_row;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Name_row =itemView.findViewById(R.id.tv_NAME_row);
            Phone_row =itemView.findViewById(R.id.tv_PHONE_row);
            Img_row =itemView.findViewById(R.id.img_row);


        }
    }
}
