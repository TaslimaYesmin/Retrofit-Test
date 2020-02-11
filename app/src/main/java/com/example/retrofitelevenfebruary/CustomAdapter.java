package com.example.retrofitelevenfebruary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private List<Post>postList;
    private Context context;

    public CustomAdapter(List<Post> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     holder.userIdTv.setText(postList.get(position).getUserId());
     holder.idTv.setText(postList.get(position).getId());
     holder.titleTv.setText(postList.get(position).getTitle());
     holder.bodyTv.setText(postList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView userIdTv,idTv,titleTv,bodyTv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userIdTv=itemView.findViewById(R.id.userId);
            idTv=itemView.findViewById(R.id.id_Id);
            titleTv=itemView.findViewById(R.id.titleId);
            bodyTv=itemView.findViewById(R.id.bodyId);
        }
    }
}
