package com.example.minhaj.roomdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DatabaseOpActivity extends AppCompatActivity {

    private String type;

    private TextView tvTitle;
    private EditText etRollNo,etFirstName,etLastName;
    private Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_op);

        type = getIntent().getStringExtra("type");

        tvTitle = findViewById(R.id.tvTitle);
        etRollNo = findViewById(R.id.etRollNo);
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        btnDone = findViewById(R.id.btnDone);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (type){
                    case "add":
                        UsersTable usersTable = new UsersTable();
                        usersTable.setId(Integer.parseInt(etRollNo.getText().toString()));
                        usersTable.setFirstName(etFirstName.getText().toString());
                        usersTable.setLastName(etLastName.getText().toString());

                        break;
                }
            }
        });

        setupUi();
    }

    private void setupUi() {

        switch (type){
            case "add":
                tvTitle.setText("add user");
                etFirstName.setVisibility(View.VISIBLE);
                etLastName.setVisibility(View.VISIBLE);
                etRollNo.setVisibility(View.VISIBLE);
                btnDone.setText("add");
                break;
        }
    }
}
