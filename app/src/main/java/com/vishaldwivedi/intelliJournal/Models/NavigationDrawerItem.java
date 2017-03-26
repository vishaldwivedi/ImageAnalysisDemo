package com.vishaldwivedi.intelliJournal.Models;

import com.vishaldwivedi.intelliJournal.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vishal Dwivedi on 25/03/17.
 */

public class NavigationDrawerItem {

    private String title;
    private int imageID;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static List<NavigationDrawerItem> getData() {
        List<NavigationDrawerItem> data = new ArrayList<>();

        int[] imageIDs = getImages();
        String[] imageTitles = getTitles();

        for (int i = 0; i < imageTitles.length; i++) {
            NavigationDrawerItem dataItem = new NavigationDrawerItem();
            dataItem.setImageID(imageIDs[i]);
            dataItem.setTitle(imageTitles[i]);
            data.add(dataItem);
        }
        return data;
    }

    private static int[] getImages() {
        return new int[]{
                R.drawable.ic_birds, R.drawable.ic_animal,
                R.drawable.ic_forest, R.drawable.ic_ocean,
                R.drawable.ic_planet, R.drawable.ic_landscape
        };
    }

    private static String[] getTitles() {
        return new String[] {
                "Birds","Animal","Forest","Ocean","Planet","landscape"
        };
    }
}
