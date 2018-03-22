package com.example.user.mynotebook;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.user.mynotebook.model.NoteItem;
import static com.example.user.mynotebook.NoteListActivity.mNoteList;

public class NoteDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);

        Intent i = getIntent();
        int notePosition = i.getIntExtra("note_position",-1);

        //เข้าถึงออบเจ็คnoteItem ใน ArrayList
        NoteItem noteItem = mNoteList.get(notePosition);

        //กำหนดtitleของnoteบนappber
        ActionBar ab = getSupportActionBar();
        ab.setTitle(noteItem.title);
        //กำหนด details ของ note ใน textview
        TextView noteDetailsTextView = findViewById(R.id.note_details_text_view);
        noteDetailsTextView.setText(noteItem.details);
    }


}
