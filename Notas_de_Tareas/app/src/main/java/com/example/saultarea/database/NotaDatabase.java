package com.example.saultarea.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.saultarea.Nota;

/**
 * Esta clase devuelve una instancia de la interfaz NotaDao.
 *
 * @author Jesus Alejandro Hernandez Salas
 * @version 2020
 */
@Database(entities = {Nota.class}, version = 1)
public abstract class NotaDatabase extends RoomDatabase {
    public abstract NotaDao getNotaDao();
}
