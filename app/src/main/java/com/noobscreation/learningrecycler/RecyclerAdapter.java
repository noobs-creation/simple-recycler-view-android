package com.noobscreation.learningrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    List<UserModel> userModelList;

    public RecyclerAdapter(List<UserModel> userModelList){
        this.userModelList = userModelList;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView fnametv, lnametv;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            fnametv = itemView.findViewById(R.id.tv_fname);
            lnametv = itemView.findViewById(R.id.tv_lname);
        }

        public void setData(String fname, String lname){
            fnametv.setText(fname);
            lnametv.setText(lname);
        }
    }


    @NonNull
    @Override
    public RecyclerAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_row, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecyclerViewHolder holder, int position) {
        String first = userModelList.get(position).getFname();
        String last = userModelList.get(position).getLname();

        holder.setData(first, last);
    }

    @Override
    public int getItemCount() {
        return userModelList.size();
    }
}
