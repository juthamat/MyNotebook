package com.example.user.mynotebook.model;

/**
 * Created by user on 21/3/2561.
 */

public class NoteItem {
    public final String title;
    public final String details;

    public NoteItem(String title, String details) {
        this.title = title;
        this.details = details;
    }
    @Override
    public String toString() {
        //การให้mothodไปดชเรียกค่าstringในarray
        return title;
    }
}
