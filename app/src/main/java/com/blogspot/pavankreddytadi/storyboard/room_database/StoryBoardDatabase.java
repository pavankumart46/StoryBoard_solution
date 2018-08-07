package com.blogspot.pavankreddytadi.storyboard.room_database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Room;
import android.content.Context;


@Database(entities = {StoryBoard.class},version = 1,exportSchema = false)
public abstract class StoryBoardDatabase extends RoomDatabase
{
   abstract StoryBoardDao storyBoardDao();

   //to Only let Database have one instance at a time
    private static StoryBoardDatabase INSTANCE;
    static StoryBoardDatabase getDatabase(final Context context)
    {
        if(INSTANCE==null)
        {
            synchronized  (StoryBoardDatabase.class){
                if(INSTANCE==null)
                {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            StoryBoardDatabase.class,"story_board")
                            .build();
                }
            }
        }

        return INSTANCE;
    }
}
