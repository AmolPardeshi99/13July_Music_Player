package com.example.a13july_music_player;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class ImageVIewHolder extends RecyclerView.ViewHolder {

    private ItemCLickListener itemCLickListener;
    private ImageView mIvImage;
    private TextView mTvTitle;
    public ImageVIewHolder(@NonNull  View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvTitle = itemView.findViewById(R.id.tvImageTitle);
    }

    public void setData(MusicModel musicModel){
        mTvTitle.setText(musicModel.getContent());
        mIvImage.setImageResource(musicModel.getResId());
    }
}
