package com.blogspot.pavankreddytadi.storyboard;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import java.util.*;
import android.widget.TextView;
import com.blogspot.pavankreddytadi.storyboard.room_database.StoryBoard;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewInfo>{
    Context context;
    List<StoryBoard> storyBoardList;

    public RecyclerAdapter(Context context, List<StoryBoard> storyBoardList)
    {
        this.context = context;
        this.storyBoardList = storyBoardList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewInfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewInfo(LayoutInflater.from(context).inflate(R.layout.one_row_in_recyclerview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewInfo holder, int position) {
         holder.story.setText(storyBoardList.get(position).getStory());
        holder.author.setText(storyBoardList.get(position).getAuthor());
    }

    @Override
    public int getItemCount() {
        return storyBoardList.size();
    }

    public class ViewInfo extends RecyclerView.ViewHolder {
        TextView story,author;
        public ViewInfo(View itemView) {
            super(itemView);
            story = itemView.findViewById(R.id.story);
            author = itemView.findViewById(R.id.author);
        }
    }
}
