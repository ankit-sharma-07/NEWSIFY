package com.example.android.news;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import jp.wasabeef.picasso.transformations.RoundedCornersTransformation;

public class newsAdapter extends ArrayAdapter<newsObject> {
    public newsAdapter(Context context,List<newsObject> newsObjectList) {
        super(context,0,newsObjectList);
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);
        }
        newsObject currentNews=getItem(position);
        ImageView imgView=(ImageView)listItemView.findViewById(R.id.img);
        TextView   descView=(TextView)listItemView.findViewById(R.id.desc);
        TextView   authorView=(TextView)listItemView.findViewById(R.id.author);
        TextView   titleView=(TextView)listItemView.findViewById(R.id.titles);
        titleView.setText(currentNews.getmTitle());
        authorView.setText("By - "+currentNews.getmAuthor());
        Picasso.get().load(currentNews.getImgUrl()).fit().centerCrop().into(imgView);
        descView.setText(currentNews.getmDesc());



        return listItemView;
    }
}


