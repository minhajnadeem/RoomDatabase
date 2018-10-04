package com.example.minhaj.roomdatabase;

import android.arch.persistence.room.Room;
import android.content.Context;

/**
 * Created by Minhaj on 04/10/2018.
 */
public class MyDatabaseSingleton {

    private static MyDatabase myDatabase = null;

    //to prevent initialization
    private MyDatabaseSingleton(){}

    public static MyDatabase getInstance(Context context){
        if (myDatabase == null){
            myDatabase = Room.inMemoryDatabaseBuilder(context,MyDatabase.class).build();
        }
        return myDatabase;
    }
}
