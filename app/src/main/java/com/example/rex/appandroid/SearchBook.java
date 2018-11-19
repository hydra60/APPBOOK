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

        this.list = new ArrayList<Book>();
        this.listview = (ListView) findViewById(R.id.list_Book);
        cargaDatos();
        this.adapter = new AdapterBook(this,this.list);

        //this.listview.setAdapter(this.adapter);

    }

    public void cargaDatos(){
        this.list.add(new Book("Caballero de la armadura Oxidada", "Antonio Diaz Villamil", "Atenea",1998, "Fantasia", 25));
        this.list.add(new Book("Caballero de la armadura Oxidada", "Antonio Diaz Villamil", "Atenea",1998, "Fantasia", 25));
        this.list.add(new Book("Burning Cruzzade", "Blizzar", "Blizzar",2010, "Ficcion", 125));
        this.list.add(new Book("Burning Cruzzade", "Blizzar", "Blizzar",2010, "Ficcion", 125));
        this.list.add(new Book("Legion", "Blizzar", "Blizzar",2017, "Ficcion", 100));
        this.list.add(new Book("Legion", "Blizzar", "Blizzar",2017, "Ficcion", 100));
        this.list.add(new Book("Bajo la Misma Estrella", "Anonimo", "YYYYYY",2010, "Novela", 25.2));
        this.list.add(new Book("Bajo la Misma Estrella", "Anonimo", "YYYYYY",2010, "Novela", 25.2));
        this.list.add(new Book("Bajo la Misma Estrella", "Anonimo", "YYYYYY",2010, "Novela", 25.2));
        this.list.add(new Book("ciencias De la computacion", "YYYYYYYYYYYY", "edition",1998, "Educacion", 500));
        this.list.add(new Book("titulo5", "author", "edition",1998, "Accion", 100));
        this.list.add(new Book("titulo5", "author", "edition",1998, "Accion", 100));
        this.list.add(new Book("titulo5", "author", "edition",1998, "Accion", 100));
        this.list.add(new Book("titulo7", "author", "edition",1998, "Terror", 100));
        this.list.add(new Book("titulo7", "author", "edition",1998, "Terror", 100));
        this.list.add(new Book("titulo7", "author", "edition",1998, "Terror", 100));
        this.list.add(new Book("titulo8", "author", "edition",1998, "Drama", 200));
        this.list.add(new Book("titulo8", "author", "edition",1998, "Drama", 200));
        this.list.add(new Book("titulo8", "author", "edition",1998, "Drama", 200));
        this.list.add(new Book("titulo9", "author", "edition",1998, "infantil", 33));
        this.list.add(new Book("titulo9", "author", "edition",1998, "infantil", 33));
        this.list.add(new Book("titulo9", "author", "edition",1998, "infantil", 33));
        this.list.add(new Book("titulo11", "author", "edition",1998, "Misterio", 25));
        this.list.add(new Book("titulo11", "author", "edition",1998, "Misterio", 25));
        this.list.add(new Book("titulo11", "author", "edition",1998, "Misterio", 25));
        this.list.add(new Book("titulo12", "author", "edition",1998, "categoria", 125));
        this.list.add(new Book("titulo13", "author", "edition",1998, "categoria", 25));
        this.list.add(new Book("titulo14", "author", "edition",1998, "categoria", 100));
        this.list.add(new Book("titulo15", "author", "edition",1998, "categoria", 900));
        this.list.add(new Book("titulo16", "author", "edition",1998, "categoria", 100));

    }

    public void find(View view) {
        this.listview.setAdapter(this.adapter);
    }

    //public void searchBook(View view) {
        //cargaDatos();
      //  this.listview.setAdapter(this.adapter);
    //}
}
