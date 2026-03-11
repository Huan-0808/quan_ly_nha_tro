package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RoomAdapter adapter;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerRoom);
        btnAdd = findViewById(R.id.btnAdd);

        // dữ liệu test
        RoomRepository.roomList.add(new Room("1","Phòng A1",2000000,"Còn trống","",""));
        RoomRepository.roomList.add(new Room("2","Phòng A2",2500000,"Đã thuê","Nam","0123"));

        adapter = new RoomAdapter(RoomRepository.roomList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // mở màn hình thêm phòng
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AddRoomActivity.class);
                startActivity(intent);

            }
        });
    }
}