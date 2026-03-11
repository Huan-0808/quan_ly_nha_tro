package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EditRoomActivity extends AppCompatActivity {

    EditText edtName, edtPrice, edtStatus;
    Button btnUpdate;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_room);

        edtName = findViewById(R.id.edtName);
        edtPrice = findViewById(R.id.edtPrice);
        edtStatus = findViewById(R.id.edtStatus);
        btnUpdate = findViewById(R.id.btnUpdate);

        index = getIntent().getIntExtra("index", 0);

        Room room = RoomRepository.roomList.get(index);

        edtName.setText(room.getName());
        edtPrice.setText(String.valueOf(room.getPrice()));
        edtStatus.setText(room.getStatus());

        btnUpdate.setOnClickListener(v -> {

            room.setName(edtName.getText().toString());
            room.setPrice(Double.parseDouble(edtPrice.getText().toString()));
            room.setStatus(edtStatus.getText().toString());

            finish();

        });

    }
}