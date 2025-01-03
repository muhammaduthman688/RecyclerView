package com.example.learnrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import com.example.learnrecycler.adapters.RecipeAdapter;
import com.example.learnrecycler.model.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        ArrayList<RecipeModel> list = new ArrayList<>();


        list.add(new RecipeModel(R.drawable.food12,"food"));
        list.add(new RecipeModel(R.drawable.food12,"food2"));
        list.add(new RecipeModel(R.drawable.food12,"food3"));
        list.add(new RecipeModel(R.drawable.food12,"food2"));
        list.add(new RecipeModel(R.drawable.food12,"food3"));


        RecipeAdapter adapter = new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
//       recyclerView.setLayoutManager(layoutManager);
       LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
//        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,3);
//        recyclerView.setLayoutManager(gridLayoutManager);
//        StaggeredGridLayoutManager staggered=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(staggered);
    }

}