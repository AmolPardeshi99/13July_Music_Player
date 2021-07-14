package com.example.a13july_music_player;

public class MusicModel {

    public static final int Text_Type = 0;
    public static final int Image_Type = 1;
    public static final int Audio_Type =2;

    private int viewType;
    private int resId;
    private String content;

    public int getViewType() {
        return viewType;
    }

    public int getResId() {
        return resId;
    }

    public String getContent() {
        return content;
    }

    public MusicModel(int viewType, int resId, String content) {
        this.viewType = viewType;
        this.resId = resId;
        this.content = content;
    }
}
