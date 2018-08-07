package com.blogspot.pavankreddytadi.storyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.arch.lifecycle.ViewModelProviders;
import android.widget.Toast;

import com.blogspot.pavankreddytadi.storyboard.room_database.StoryBoard;
import com.blogspot.pavankreddytadi.storyboard.room_database.StoryBoardViewModel;

public class AddStories extends AppCompatActivity {
    EditText story,author;
    StoryBoardViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_stories);
        story = findViewById(R.id.editText);
        author = findViewById(R.id.editText2);
        viewModel = ViewModelProviders.of(this).get(StoryBoardViewModel.class);
    }

    public void addToStories(View view)
    {
        String et_story = story.getText().toString();
        String et_author = author.getText().toString();
        viewModel.insert(new StoryBoard(et_story,et_author));
        Toast.makeText(this, "DATA INSERTED", Toast.LENGTH_SHORT).show();
    }
}
