package com.blogspot.pavankreddytadi.storyboard.room_database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "story_board")
public class StoryBoard
{

    @PrimaryKey(autoGenerate = true)
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    private String story;
    private String author;

    public StoryBoard(String story, String author)
    {
        this.story = story;
        this.author = author;
    }

    public int getId()
    {
        return id;
    }

    public String getStory()
    {
        return story;
    }

    public String getAuthor()
    {
        return author;
    }
}
