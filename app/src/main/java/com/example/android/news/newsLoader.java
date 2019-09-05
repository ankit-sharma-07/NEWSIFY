package com.example.android.news;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.content.AsyncTaskLoader;
import android.widget.LinearLayout;

import java.util.List;

public class newsLoader extends AsyncTaskLoader<List<newsObject>> {
    private String mUrl;


    public newsLoader(@NonNull Context context,String url) {
        super(context);
        mUrl=url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }
    @Nullable
    @Override
    public List<newsObject> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        List<newsObject> newsList=QueryUtils.fetchData(mUrl);

        return newsList;

    }
}
