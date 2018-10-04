package com.example.android.newapp;


public class News {
    private String title;
    private String section;
    private String author;
    private String date;

    public News(String nTitle, String nSection, String nAuthor, String nDate){
        title = nTitle;
        section = nSection;
        author = nAuthor;
        date = nDate;
    }

    public String getTitle(){
        return title;
    }

    public String getSection(){
        return section;
    }

    public String getAuthor(){
        return author;
    }

    public String getDate(){
        return date;
    }
}
