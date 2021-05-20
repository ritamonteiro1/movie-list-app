package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private final List<Movie> movieList;

    public Adapter(List<Movie> movie) {
        this.movieList = movie;
    }

    @NonNull
    @NotNull
    @Override

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movies = movieList.get(position);
        holder.title.setText(movies.getTitle());
        holder.year.setText(movies.getYear());
        holder.gender.setText(movies.getGender());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView year;
        TextView gender;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleTextView);
            year = itemView.findViewById(R.id.yearTextView);
            gender = itemView.findViewById(R.id.genderTextView);
        }
    }
}
