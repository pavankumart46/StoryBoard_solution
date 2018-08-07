package com.blogspot.pavankreddytadi.storyboard.room_database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.lifecycle.LiveData;
import java.util.List;
@Dao
public interface StoryBoardDao
{
    @Insert
    void insert(StoryBoard storyBoard);

    @Query("Select * from story_board")
    LiveData<List<StoryBoard>> getAllStories();

    @Query("Delete From story_board")
    void delete();
}
