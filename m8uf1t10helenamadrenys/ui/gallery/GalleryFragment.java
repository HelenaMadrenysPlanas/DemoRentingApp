package com.example.m8uf1t10helenamadrenys.ui.gallery;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.m8uf1t10helenamadrenys.MovieAdapter;
import com.example.m8uf1t10helenamadrenys.MovieClass;
import com.example.m8uf1t10helenamadrenys.databinding.FragmentGalleryBinding;

import com.example.m8uf1t10helenamadrenys.R;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;
    private ArrayList<MovieClass> movieList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //Creem la llista
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recyclerView);
        movieList = new ArrayList<>();
        rv.setLayoutManager(new LinearLayoutManager(getContext()));

        //Omplim la llista
        OmplirLlista();

        //Preparem adaptador
        MovieAdapter adapter = new MovieAdapter(movieList, getContext());
        rv.setAdapter(adapter);
        return view;
    }

    private void OmplirLlista() {
        movieList.add(new MovieClass(getString(R.string.title1), getString(R.string.tag_anime) +", "+ getString(R.string.tag_action), true, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title2), getString(R.string.tag_action), false, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title3), getString(R.string.tag_teen) + ", " + getString(R.string.tag_fun), false, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title4), getString(R.string.tag_horror), true, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title5), getString(R.string.tag_action), false, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title6), getString(R.string.tag_action), false, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title7), getString(R.string.tag_action), true, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title8), getString(R.string.tag_fun), true, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title9), getString(R.string.tag_teen) + ", " +getString(R.string.tag_fun), true, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title10), getString(R.string.tag_action) + ", " + getString(R.string.tag_drama), false, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title11), getString(R.string.tag_anime) + ", "+getString(R.string.tag_horror), false, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title12), getString(R.string.tag_drama), false, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title13), getString(R.string.tag_fun), true, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title14), getString(R.string.tag_drama), false, R.drawable.ic_claqueta_foreground));
        movieList.add(new MovieClass(getString(R.string.title15), getString(R.string.tag_fun), false, R.drawable.ic_claqueta_foreground));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}