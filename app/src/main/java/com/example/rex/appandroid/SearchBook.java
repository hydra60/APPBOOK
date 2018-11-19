package com.example.rex.appandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.rex.appandroid.Adapters.AdapterBook;
import com.example.rex.appandroid.Objects.Book;

import java.util.ArrayList;

public class SearchBook extends AppCompatActivity {
    private AdapterBook adapter;
    private ArrayList<Book> list;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_book);

        cargaDatos();
        this.adapter = new AdapterBook(this,this.list);
        this.list = new ArrayList<>();
        this.listview = (ListView) findViewById(R.id.list_Book);

        this.listview.setAdapter(this.adapter);

    }

    public void cargaDatos(){
        this.list.add(new Book("titulo", "author", "edition",1998, "categoria", 25));
        this.list.add(new Book("titulo1", "author", "edition",1998, "categoria", 25));
        this.list.add(new Book("titulo2", "author", "edition",1998, "categoria", 25));
        this.list.add(new Book("titulo3", "author", "edition",1998, "categoria", 25));
        this.list.add(new Book("titulo4", "author", "edition",1998, "categoria", 25));
        this.list.add(new Book("titulo5", "author", "edition",1998, "categoria", 25));
        this.list.add(new Book("titulo6", "author", "edition",1998, "categoria", 25));
        this.list.add(new Book());
    }

    public void searchBook(View view) {
        //cargaDatos();
        this.listview.setAdapter(this.adapter);
    }
}
