package com.example.saultarea.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.saultarea.Nota;

/**
 *
 * @author Carlos Saul Rodriguez Zavala
 * @version 2020
 */
@Database(entities = {Nota.class}, version = 1)
public abstract class NotaDatabase extends RoomDatabase {
    public abstract NotaDao getNotaDao();
}
