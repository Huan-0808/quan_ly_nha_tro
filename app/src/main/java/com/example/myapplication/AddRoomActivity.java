package com.example.myapplication;
/*import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;*/
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddRoomActivity extends AppCompatActivity {

    EditText edtName, edtPrice, edtStatus;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);

        edtName = findViewById(R.id.edtName);
        edtPrice = findViewById(R.id.edtPrice);
        edtStatus = findViewById(R.id.edtStatus);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edtName.getText().toString();
                double price = Double.parseDouble(edtPrice.getText().toString());
                String status = edtStatus.getText().toString();

                Room room = new Room("id",name,price,status,"","");

                RoomRepository.roomList.add(room);

                finish();
            }
        });

    }

}
