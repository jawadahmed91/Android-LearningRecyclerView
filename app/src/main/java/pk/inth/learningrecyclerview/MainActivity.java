package pk.inth.learningrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import pk.inth.learningrecyclerview.Adapters.RecipeAdapter;
import pk.inth.learningrecyclerview.Models.RecipeModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        ArrayList<RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.chicago_pizza, "Chicago Pizza"));
        list.add(new RecipeModel(R.drawable.neapolitan_pizza, "Neapolitan Pizza"));
        list.add(new RecipeModel(R.drawable.sicilian_pizza, "Sicilian Pizza"));
        list.add(new RecipeModel(R.drawable.chicago_pizza, "Chicago Pizza"));
        list.add(new RecipeModel(R.drawable.neapolitan_pizza, "Neapolitan Pizza"));
        list.add(new RecipeModel(R.drawable.sicilian_pizza, "Sicilian Pizza"));
        list.add(new RecipeModel(R.drawable.chicago_pizza, "Chicago Pizza"));
        list.add(new RecipeModel(R.drawable.neapolitan_pizza, "Neapolitan Pizza"));
        list.add(new RecipeModel(R.drawable.sicilian_pizza, "Sicilian Pizza"));

        RecipeAdapter recipeAdapter = new RecipeAdapter(list, this);
        recyclerView.setAdapter(recipeAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recyclerView.setLayoutManager(linearLayoutManager);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
//        recyclerView.setLayoutManager(gridLayoutManager);

//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);


    }
}