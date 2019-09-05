package com.example.android.news;

public class newsObject {
    private String mAuthor;
    private String mDesc;
    private String mTitle;
    private String mUrl;
    private String imgUrl;
    private String mTimeInMilliseconds;

    public newsObject(String mAuthor, String mDesc, String mUrl, String imgUrl, String mTimeInMilliseconds,String title) {
        this.mAuthor = mAuthor;
        this.mDesc = mDesc;
        this.mTitle=title;
        this.mUrl = mUrl;
        this.imgUrl = imgUrl;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public String getmAuthor() {
        return mAuthor;
    }
    public String getmTitle(){return mTitle;}

    public String getmDesc() {
        return mDesc;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}
