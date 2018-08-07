package com.blogspot.pavankreddytadi.storyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddStories extends AppCompatActivity {
    EditText story,author;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_stories);
        story = findViewById(R.id.editText);
        author = findViewById(R.id.editText2);
    }

    public void addToStories(View view)
    {
        String et_story = story.getText().toString();
        String et_author = author.getText().toString();
    }
}
