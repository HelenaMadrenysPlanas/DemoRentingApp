package com.example.m8uf1t10helenamadrenys;

import android.app.AlertDialog;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    ArrayList<MovieClass> movieList;
    Context context;

    public MovieAdapter(ArrayList<MovieClass> movieList, Context context){
        this.movieList = movieList;
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rview, null, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder (MovieViewHolder holder, int position){
        String title = movieList.get(position).getTitle();
        String tags = movieList.get(position).getTags();
        Boolean reserved = movieList.get(position).getTReserved();
        int img = movieList.get(position).getImageId();

        holder.movieTitle.setText(title);
        holder.movieTags.setText(tags);

        if (reserved)
        {
            holder.movieReserved.setText(R.string.movie_reserved);
            holder.movieReserved.setTextColor(context.getColor(R.color.red));
        }else{
            holder.movieReserved.setText(R.string.movie_free);
            holder.movieReserved.setTextColor(context.getColor(R.color.green));
        }
        holder.movieImage.setImageResource(img);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creem alert dialog
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
                View dialogView = View.inflate(context ,R.layout.item_rview, null);
                dialogBuilder.setView(dialogView);

                //Li passem les dades
                TextView txtTitle = dialogView.findViewById(R.id.movieName);
                txtTitle.setText(title);
                TextView txtTags = dialogView.findViewById(R.id.movieTag);
                txtTags.setText(tags);
                TextView txtReserved = dialogView.findViewById(R.id.movieReserved);
                if (reserved)
                {
                    txtReserved.setText(R.string.movie_reserved);
                    txtReserved.setTextColor(context.getColor(R.color.red));
                }else{
                    txtReserved.setText(R.string.movie_free);
                    txtReserved.setTextColor(context.getColor(R.color.green));
                }
                ImageView imageView = dialogView.findViewById(R.id.movieImg);
                imageView.setImageResource(img);

                //El mostrem
                AlertDialog alertDialog = dialogBuilder.create();
                alertDialog.show();
            }
        });
    }

    @Override
    public int getItemCount() { return movieList.size(); }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        TextView movieTitle, movieTags, movieReserved;
        ImageView movieImage;

        public MovieViewHolder(View itemView){
            super(itemView);
            movieTitle = (TextView) itemView.findViewById(R.id.movieName);
            movieTags = (TextView) itemView.findViewById(R.id.movieTag);
            movieReserved = (TextView) itemView.findViewById(R.id.movieReserved);
            movieImage = (ImageView) itemView.findViewById(R.id.movieImg);
        }
    }
}
