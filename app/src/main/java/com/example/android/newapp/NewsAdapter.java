package com.example.android.newapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        //Title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        String title = currentNews.getTitle();
        titleView.setText(title);

        //Section
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        String section = currentNews.getSection();
        sectionView.setText(section);

        //Date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        String date = currentNews.getDate();
        dateView.setText(date);

        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        ArrayList<String> authors = currentNews.getAuthor();
        String authorNames = "";
        for(int i = 0; i< authors.size(); i++){
            if(i==0){
                authorNames += authors.get(i);
            }
            else{
                authorNames += ", ";
                authorNames += authors.get(i);
            }
        }

        authorView.setText(authorNames);

        return listItemView;
    }
}
