package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

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

        mainRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(),
                mainRecyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Movie movie = movieList.get(position);
                Toast.makeText(getApplicationContext(), getString(R.string.pressed_item) + movie.getTitle(),
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Movie movie = movieList.get(position);
                Toast.makeText(getApplicationContext(), getString(R.string.long_click) + movie.getTitle(),
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        }));
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