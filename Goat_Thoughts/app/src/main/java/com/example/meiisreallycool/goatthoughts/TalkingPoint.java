package com.example.meiisreallycool.goatthoughts;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TalkingPoint {
    @PrimaryKey(autoGenerate = true) public long talkingPointID;
    public String title;
    public String description;
    public long sessionTpID;
}
