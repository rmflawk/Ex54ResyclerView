package com.youngstudio.ex54resyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<String> datas = new ArrayList<>();

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //대량의 데이터
        datas.add("aaa");
        datas.add("bbb");
        datas.add("ccc");
        datas.add("ddd");
        datas.add("eee");
        datas.add("fff");
        datas.add("ggg");
        datas.add("aaa");
        datas.add("bbb");
        datas.add("ccc");
        datas.add("ddd");
        datas.add("eee");
        datas.add("fff");
        datas.add("ggg");

        recyclerView= findViewById(R.id.recyclerview);
        adapter= new MyAdapter(datas,this);
        recyclerView.setAdapter(adapter);

        //GridLaytoutManager 적용해 보기
//        GridLayoutManager layoutManager= new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(layoutManager);



    }

}












