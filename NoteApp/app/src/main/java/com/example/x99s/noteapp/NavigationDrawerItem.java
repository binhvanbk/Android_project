package com.example.x99s.noteapp;

/**
 * Created by X99S on 12/31/2015.
 */
public class NavigationDrawerItem {
    private  int iconId;
    private String title;

    public NavigationDrawerItem(int iconId, String title) {
        this.iconId = iconId;
        this.title = title;
    }

    public int getIconId() {
        return iconId;
    }

    public String getTitle() {
        return title;
    }
}
