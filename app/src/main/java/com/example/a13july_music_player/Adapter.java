package com.example.a13july_music_player;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<MusicModel> musicList;
    private ItemCLickListener itemCLickListener;

    public Adapter(ArrayList<MusicModel> musicList, ItemCLickListener itemCLickListener) {
        this.musicList = musicList;
        this.itemCLickListener = itemCLickListener;
    }

    @NonNull
    @Override
    public AudioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case MusicModel.Audio_Type:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.audio_layout, parent, false);
                return new AudioViewHolder(view, itemCLickListener);
            case MusicModel.Image_Type:
                View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_layout, parent, false);
                return new AudioViewHolder(view1, itemCLickListener);
            case MusicModel.Text_Type:
                View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_layout, parent, false);
                return new AudioViewHolder(view2, itemCLickListener);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viewType = musicList.get(position).getViewType();
        MusicModel musicModel = musicList.get(position);

        switch (viewType) {
            case MusicModel.Audio_Type:
                if (holder instanceof AudioViewHolder) {
                    ((AudioViewHolder) holder).setData(musicModel);
                }
                break;
            case MusicModel.Image_Type:
                if (holder instanceof ImageVIewHolder) {
                    ((ImageVIewHolder) holder).setData(musicModel);
                }
                break;
            case MusicModel.Text_Type:
                if (holder instanceof TextViewHolder) {
                    ((TextViewHolder) holder).setData(musicModel);
                }
        }
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    @Override
    public int getItemViewType(int position) {
        int itemType = musicList.get(position).getViewType();
        switch (itemType) {
            case MusicModel.Audio_Type:
                return MusicModel.Audio_Type;
            case MusicModel.Image_Type:
                return MusicModel.Image_Type;
            case MusicModel.Text_Type:
                return MusicModel.Text_Type;
        }
        return -1;
    }
}
