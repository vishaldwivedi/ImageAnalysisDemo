package com.vishaldwivedi.intelliJournal.Models;

import java.util.Date;

/**
 * Created by Vishal Dwivedi on 11/04/17.
 * This interface will act as a base for the journal types we will support in the system
 */

public interface JournalBase {
    public Date getDate();
    public String getTitle();
    public String getMood();
    public boolean isLoved();
}

