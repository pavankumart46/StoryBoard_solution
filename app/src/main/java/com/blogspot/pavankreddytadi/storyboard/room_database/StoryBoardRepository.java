package com.blogspot.pavankreddytadi.storyboard.room_database;

import android.arch.lifecycle.LiveData;
import java.util.*;
import android.content.Context;
import android.os.AsyncTask;
public class StoryBoardRepository
{
    private StoryBoardDao storyBoardDao;
    private LiveData<List<StoryBoard>> mListStoryBoard;
    public StoryBoardRepository(Context context)
    {
        StoryBoardDatabase storyBoardDatabase = StoryBoardDatabase.getDatabase(context);
        storyBoardDao = storyBoardDatabase.storyBoardDao();
        mListStoryBoard = storyBoardDao.getAllStories();
    }

    LiveData<List<StoryBoard>> getAllStories()
    {
        return mListStoryBoard;
    }

    public void insert(StoryBoard storyBoard){
        new InsertAsyncTask().execute(storyBoard);
    }

    private class InsertAsyncTask extends AsyncTask<StoryBoard,Void,Void> {
        @Override
        protected Void doInBackground(StoryBoard... storyBoards) {
            StoryBoard storyBoard = storyBoards[0];
            storyBoardDao.insert(storyBoard);
            return null;
        }
    }
}

