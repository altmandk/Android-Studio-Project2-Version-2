package com.example.project_2_version_2;

public class Movies {
    private String mYear;
    private String mTitle;
    private int mImage;

    public Movies(String year, String title, int image) {
        mYear = year;
        mTitle = title;

        mImage = image;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String mYear) {
        this.mYear = mYear;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }
}
