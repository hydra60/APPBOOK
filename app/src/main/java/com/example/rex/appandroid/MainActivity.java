package com.example.rex.appandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.rex.appandroid.Adapters.AdapterBook;
import com.example.rex.appandroid.Objects.Book;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void searchBook(View view) {
        Intent sig = new Intent(this,SearchBook.class);
        startActivity(sig);
    }
}
