package com.example.meiisreallycool.goatthoughts.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "providers")
public class Provider {
    @PrimaryKey(autoGenerate = true) public long providerID;
    public String name;
    public String color;
    public String icon_name;


}
