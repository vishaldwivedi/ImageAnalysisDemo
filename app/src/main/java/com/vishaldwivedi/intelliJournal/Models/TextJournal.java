package com.vishaldwivedi.intelliJournal.Models;

import java.util.Date;

/**
 * Created by Vishal Dwivedi on 11/04/17.
 */

public class TextJournal implements JournalBase {

    private String description;
    private String title;
    private Date dateSubmitted;
    private String mood;

    public TextJournal(String description, String title, Date dateSubmitted, String mood) {
        this.description = description;
        this.title = title;
        this.dateSubmitted = dateSubmitted;
        this.mood = mood;
    }

    @Override
    public Date getDate() {
        return this.dateSubmitted;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getMood() {
        return this.mood;
    }

    @Override
    public boolean isLoved() {
        return false;
    }
}
