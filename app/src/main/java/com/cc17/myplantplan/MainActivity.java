package com.cc17.myplantplan;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myplantplan.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model> modelList;
    RecyclerView recyclerView;
    OrderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating an arraylist

        modelList = new ArrayList<>();
        modelList.add(new Model("Carrot", getString(R.string.Carrrots), R.drawable.carrot ));
        modelList.add(new Model("Raddish", getString(R.string.latte), R.drawable.rad));
        modelList.add(new Model("Tomato", getString(R.string.orangesmoothie), R.drawable.carrot));
        modelList.add(new Model("Squash", getString(R.string.orangevanilla), R.drawable.carrot));
        modelList.add(new Model("Eggplant", getString(R.string.cappcuni), R.drawable.carrot));
        modelList.add(new Model("Stringbeans", getString(R.string.thaitea), R.drawable.carrot));
        modelList.add(new Model("Onion", getString(R.string.tea), R.drawable.carrot));
        modelList.add(new Model("Garlic", getString(R.string.bubbletea), R.drawable.rad));
        modelList.add(new Model("Pepper", getString(R.string.match), R.drawable.rad));

        // recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));
        // adapter
        mAdapter = new OrderAdapter(this, modelList);
        recyclerView.setAdapter(mAdapter);




    }
}