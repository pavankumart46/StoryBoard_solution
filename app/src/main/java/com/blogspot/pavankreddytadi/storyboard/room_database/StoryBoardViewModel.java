package com.blogspot.pavankreddytadi.storyboard.room_database;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import java.util.*;
import android.arch.lifecycle.LiveData;
public class StoryBoardViewModel extends AndroidViewModel
{

    private StoryBoardRepository storyBoardRepository;
    private LiveData<List<StoryBoard>> mAllStories;
    public StoryBoardViewModel(@NonNull Application application)
    {
        super(application);
        storyBoardRepository = new StoryBoardRepository(application);
        mAllStories = storyBoardRepository.getAllStories();
    }

   public LiveData<List<StoryBoard>> getmAllStories(){return mAllStories;}

    public void insert(StoryBoard storyBoard){
        storyBoardRepository.insert(storyBoard);
    }

}
