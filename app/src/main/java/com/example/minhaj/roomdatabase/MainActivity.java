package com.example.minhaj.roomdatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MyDatabase myDatabase;
    private UsersTableDao usersTableDao;

    private Button btnAddUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAddUser = findViewById(R.id.btnAddUser);
        btnAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity("add");
            }
        });
    }

    private void startActivity(String type) {
        Intent intent = new Intent(this,DatabaseOpActivity.class);
        intent.putExtra("type",type);
        startActivity(intent);
    }
}
