package com.example.recyclerview;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mainRecyclerView;
    private final List<Movie> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecyclerView = findViewById(R.id.mainRecyclerView);
        createMovies();
        Adapter adapter = new Adapter(movieList);
        setupRecyclerView(adapter);
    }

    private void setupRecyclerView(Adapter adapter) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mainRecyclerView.setLayoutManager(layoutManager);
        mainRecyclerView.setHasFixedSize(true);
        mainRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        mainRecyclerView.setAdapter(adapter);
    }

    private void createMovies() {
        Movie movie = new Movie("2021", GenderMovie.ADVENTURE.getGender(), "Mulher Maravilha");
        movieList.add(movie);
        movie = new Movie("2021", GenderMovie.HORROR.getGender(), "mulher maravilha");
        movieList.add(movie);
        movie = new Movie("2021", "Comédia", "mulher maravilha");
        movieList.add(movie);
        movie = new Movie("2021", "Comédia", "mulher maravilha");
        movieList.add(movie);
        movie = new Movie("2021", "Comédia", "mulher maravilha");
        movieList.add(movie);
        movie = new Movie("2021", "Comédia", "mulher maravilha");
        movieList.add(movie);
        movie = new Movie("2021", "Comédia", "mulher maravilha");
        movieList.add(movie);
        movie = new Movie("2021", "Comédia", "mulher maravilha");
        movieList.add(movie);
        movie = new Movie("2021", "Comédia", "mulher maravilha");
        movieList.add(movie);
        movie = new Movie("2021", "Comédia", "mulher maravilha");
        movieList.add(movie);
    }
}