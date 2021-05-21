package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;


public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieListViewHolder> {
    private final List<Movie> movieList;

    public MovieListAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @NotNull
    @Override
    public MovieListAdapter.MovieListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie,
                parent, false);
        return new MovieListViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(MovieListViewHolder holder, int position) {
        holder.bind(movieList.get(position));
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public static class MovieListViewHolder extends RecyclerView.ViewHolder {
        TextView itemMovieTitleTextView;
        TextView itemMovieYearTextView;
        TextView itemMovieGenderTextView;
        Context context;

        public MovieListViewHolder(View itemView) {
            super(itemView);
            itemMovieTitleTextView = itemView.findViewById(R.id.itemMovieTitleTextView);
            itemMovieYearTextView = itemView.findViewById(R.id.itemMovieYearTextView);
            itemMovieGenderTextView = itemView.findViewById(R.id.itemMovieGenderTextView);
            context = itemView.getContext();
        }

        public void bind(Movie movie) {
            itemMovieTitleTextView.setText(movie.getTitle());
            itemMovieYearTextView.setText(movie.getYear());
            itemMovieGenderTextView.setText(movie.getGender().getValue());

            itemView.setOnClickListener(v ->
                    Toast.makeText(context, context.getString(R.string.item_click_message,
                            movie.getTitle(), movie.getYear(), movie.getGender().getValue()),
                            Toast.LENGTH_SHORT).show());
        }
    }
}
