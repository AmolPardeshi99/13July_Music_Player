package com.example.a13july_music_player;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AudioViewHolder extends RecyclerView.ViewHolder {

    private ItemCLickListener itemCLickListener;
    private TextView mTvTitle;
    private Button mBtnPlay;
    private Button mBtnPause;
    private TextView mTvDuration;

    public AudioViewHolder(@NonNull View itemView, ItemCLickListener itemCLickListener) {
        super(itemView);
        this.itemCLickListener = itemCLickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        mTvTitle = itemView.findViewById(R.id.tvSongTitle);
        mBtnPause = itemView.findViewById(R.id.btnPause);
        mBtnPlay = itemView.findViewById(R.id.btnPlay);
        mTvDuration = itemView.findViewById(R.id.tvDuration);
    }

    public void setData(MusicModel musicModel){
        mTvTitle.setText(musicModel.getContent());
        final MediaPlayer mediaPlayer = MediaPlayer.create(mTvTitle.getContext(),musicModel.getResId());

        mBtnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mediaPlayer.isPlaying())  mediaPlayer.start();
            }
        });

        mBtnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying())  mediaPlayer.pause();
            }
        });
    }
}
