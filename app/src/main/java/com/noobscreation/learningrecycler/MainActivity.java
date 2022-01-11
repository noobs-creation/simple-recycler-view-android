package com.noobscreation.learningrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    List<UserModel> userModelList;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();
    }


    public void initRecyclerView(){
        recyclerView = findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerAdapter = new RecyclerAdapter(userModelList);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerAdapter.notifyDataSetChanged();

    }

    public void initData(){
        userModelList = new ArrayList<>();
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
        userModelList.add(new UserModel("sid", "das"));
        userModelList.add(new UserModel("priyangi", "dutta"));
    }
}