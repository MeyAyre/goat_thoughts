package com.example.meiisreallycool.goatthoughts;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "talking_points")
public class TalkingPoint {
    @PrimaryKey(autoGenerate = true) public long talkingPointID;
    public String title;
    public long sessionTpID;
}
