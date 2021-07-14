package com.example.a13july_music_player;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TextViewHolder extends RecyclerView.ViewHolder {

    private ItemCLickListener itemCLickListener;
    private TextView mTvTitle;
    public TextViewHolder(@NonNull  View itemView,ItemCLickListener itemCLickListener) {
        super(itemView);
        this.itemCLickListener = itemCLickListener;
        mTvTitle = itemView.findViewById(R.id.tvTitle);
    }
    public void setData(MusicModel musicModel){
        mTvTitle.setText(musicModel.getContent());
    }
}
