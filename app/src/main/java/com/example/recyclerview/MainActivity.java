package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView()
    {
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<Hero> arrayList=new ArrayList<>();
        arrayList.add(new Hero(R.drawable.iron,"Iron Man"));
        arrayList.add(new Hero(R.drawable.captain,"Captain American"));
        arrayList.add(new Hero(R.drawable.thor,"Thor"));
        arrayList.add(new Hero(R.drawable.hulk,"Hulk"));
        arrayList.add(new Hero(R.drawable.black,"Black Widow"));
        arrayList.add(new Hero(R.drawable.pather,"Black Pather"));
        HeroAdapter heroAdapter=new HeroAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(heroAdapter);
    }
}
