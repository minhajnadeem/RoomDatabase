package com.example.minhaj.roomdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MyDatabase myDatabase;
    private UsersTableDao usersTableDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDatabase = MyDatabaseSingleton.getInstance(this);
        usersTableDao = myDatabase.usersTableDao();
        new Thread(new Runnable() {
            @Override
            public void run() {
                UsersTable user1 = new UsersTable();
                user1.setFirstName("minhaj");
                user1.setLastName("nadeem");

                usersTableDao.insertUsers(user1);
            }
        }).start();
    }
}
