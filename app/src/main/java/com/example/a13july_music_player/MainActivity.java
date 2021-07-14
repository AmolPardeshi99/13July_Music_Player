package com.example.a13july_music_player;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemCLickListener{

    private RecyclerView recyclerView;
    private ArrayList<MusicModel> musicList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVIews();
        buildData();
        setRecyclerView();
    }

    private void initVIews() {
        recyclerView = findViewById(R.id.recyclerview);

    }

    private void buildData() {
        for (int i=0; i<5;i++){
        musicList.add(new MusicModel(MusicModel.Audio_Type,R.raw.shape_of_you,"Shape of You"));
        musicList.add(new MusicModel(MusicModel.Image_Type,R.drawable.shape_of_you,"Shape of You"));
        musicList.add(new MusicModel(MusicModel.Text_Type,0,"Shape of You"));
    }}

    private void setRecyclerView() {
        Adapter adapter = new Adapter(musicList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onItemClicked(MusicModel musicModel) {


    }
}