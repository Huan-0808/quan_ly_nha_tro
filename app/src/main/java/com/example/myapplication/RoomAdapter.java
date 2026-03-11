package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder>{

    List<Room> roomList;

    public RoomAdapter(List<Room> roomList){
        this.roomList = roomList;
    }

    @Override
    public RoomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_room,parent,false);

        return new RoomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RoomViewHolder holder, int position) {

        Room room = roomList.get(position);

        holder.tvName.setText(room.getName());
        holder.tvPrice.setText("Giá: " + room.getPrice());
        holder.tvStatus.setText(room.getStatus());

        if(room.getStatus().equals("Còn trống")){
            holder.tvStatus.setTextColor(Color.GREEN);
        }else{
            holder.tvStatus.setTextColor(Color.RED);
        }
        holder.itemView.setOnClickListener(v -> {

            Intent intent = new Intent(v.getContext(), EditRoomActivity.class);
            intent.putExtra("index", position);
            v.getContext().startActivity(intent);

        });
    }

    @Override
    public int getItemCount() {
        return roomList.size();
    }

    public class RoomViewHolder extends RecyclerView.ViewHolder{

        TextView tvName,tvPrice,tvStatus;

        public RoomViewHolder(View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvStatus = itemView.findViewById(R.id.tvStatus);
        }
    }

}
