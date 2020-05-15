package com.example.meiisreallycool.goatthoughts.database;

import java.util.Date;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Session {
    @PrimaryKey(autoGenerate = true) public long sessionID;
    public Date date;
    public long providerSessionID;
}
