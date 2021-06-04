package com.example.tugas5.database.entitas;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    public int uid; /*userid*/

    @ColumnInfo (name = "name")
    public String fullName;

    public String email;
}
