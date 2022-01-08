package com.example.lesson_6_beksultan;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

interface OnFragmentSendDataListener {
    void onSendData(String selectedItem);
}

public class FragmentLast extends Fragment implements OnClickItem {
    private ArrayList<SongModel> dataSong = new ArrayList<>();
    private RecyclerView recyclerView;
    private OnFragmentSendDataListener fragmentSendDataListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.listSong);
        load();
        initRecycleView();
    }


    private void initRecycleView() {
        SongAdapter adapter = new SongAdapter(dataSong, this);
        recyclerView.setAdapter(adapter);
    }

    private void load() {
        dataSong.add(new SongModel("Black Pig", "Pinger", "1", "3:45"));
        dataSong.add(new SongModel("Yoro", "Shikago", "2", "2:45"));
        dataSong.add(new SongModel("Nier", "Likbez Chikago", "3", "3:45"));
        dataSong.add(new SongModel("Fate", "Arthur Pendragon", "4", "2:45"));
        dataSong.add(new SongModel("Soccer", "Pirogov Atmyan", "5", "3:45"));
        dataSong.add(new SongModel("CHM14", "Nemoy Nemez", "6", "2:45"));
        dataSong.add(new SongModel("Nike", "Sportov Isa", "7", "3:45"));
        dataSong.add(new SongModel("Abibas", "Sergan", "8", "1:45"));
        dataSong.add(new SongModel("Saturn", "Space Lord", "9", "2:45"));
        dataSong.add(new SongModel("Laika", "Laika dog", "10", "3:45"));
    }

    @Override
    public void onClick(int pos) {
        startActivity(new Intent(getActivity(), SecondActivity.class));
        Intent pel = new Intent(getActivity(), SecondActivity.class);
        pel.putExtra("Africa14", pos);
        pel.putExtra("name", pos);
        Toast.makeText(getActivity(),"Click " + pos, Toast.LENGTH_LONG).show();
    }
}