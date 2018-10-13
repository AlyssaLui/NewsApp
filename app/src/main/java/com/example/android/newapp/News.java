package com.example.android.newapp;


import java.util.ArrayList;
import java.util.List;

public class News {
    private String title;
    private String section;
    private String date;
    private String url;
    private ArrayList<String> authors;

    public News(String nTitle, String nSection, String nDate, ArrayList<String> nAuthors, String nUrl){
        title = nTitle;
        section = nSection;
        date = nDate;
        authors = nAuthors;
        url = nUrl;
    }

    public String getTitle(){
        return title;
    }

    public String getSection(){
        return section;
    }

    public String getDate(){
        return date;
    }

    public ArrayList<String> getAuthor(){
        return authors;
    }

    public String getUrl(){
        return url;
    }
}
