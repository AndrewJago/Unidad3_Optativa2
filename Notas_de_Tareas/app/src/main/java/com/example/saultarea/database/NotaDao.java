package com.example.saultarea.database;

import com.example.saultarea.Nota;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;



@Dao
public interface NotaDao {

    @Query("SELECT * FROM nota")
    List<Nota> getNotas();

    @Query("SELECT * FROM nota WHERE mId LIKE :uuid")
    Nota getNota(String uuid);

    @Insert
    void addNota(Nota book);

    @Delete
    void deleteNota(Nota book);

    @Update
    void updateNota(Nota book);
}