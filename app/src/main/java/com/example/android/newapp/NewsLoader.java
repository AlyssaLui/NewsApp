package com.example.android.newapp;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.net.URL;
import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>>{

    private String url;

    public NewsLoader(Context context, String nUrl) {
        super(context);
        url = nUrl;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if(url == null){
            return null;
        }
        List<News> news = QueryUtils.fetchNewsData(url);

        return news;
    }

}
