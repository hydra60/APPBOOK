package com.example.rex.appandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.rex.appandroid.Adapters.AdapterBook;
import com.example.rex.appandroid.Objects.Book;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton btnActive;
    private FloatingActionButton btnSearch;
    private FloatingActionButton btnFavorites;
    private boolean sw = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnActive = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        this.btnSearch = (FloatingActionButton) findViewById(R.id.floatingActionButtonSearch);
        this.btnFavorites = (FloatingActionButton) findViewById(R.id.floatingActionButtonFavorites);


    }
    @SuppressLint("RestrictedApi")
    public void active(View v){
        this.btnSearch.setVisibility(Integer.parseInt("Visible"));
        this.btnFavorites.setVisibility(Integer.parseInt("Visible"));
    }

    public void searchBook(View view) {

        Intent sig = new Intent(this,SearchBook.class);
        startActivity(sig);
    }
}
