package com.example.minhaj.roomdatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Minhaj on 01/10/2018.
 */

@Database(entities = {UsersTable.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract UsersTableDao usersTableDao();
}
