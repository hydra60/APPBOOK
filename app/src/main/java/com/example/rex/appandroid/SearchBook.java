package com.example.rex.appandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.rex.appandroid.Adapters.AdapterBook;
import com.example.rex.appandroid.Objects.Book;
import com.example.rex.appandroid.Objects.Market;

import java.util.ArrayList;
import java.util.Iterator;

public class SearchBook extends AppCompatActivity {
    private AdapterBook adapter;
    private Market lib;
    private ListView listview;
    private EditText find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_book);
        this.find =(EditText) findViewById(R.id.tv_search);
        this.listview = (ListView) findViewById(R.id.list_Book);
        this.lib = new Market();
    }
    public void find(View view) {
        String add = this.find.getText().toString();
        try {
            Iterator<Market.BookCategories> it = this.lib.getBk().iterator();
            int count =0;
            while (it.hasNext()) {
                Market.BookCategories tmp = (Market.BookCategories) it.next();
                if (tmp.getName().equalsIgnoreCase(add)) {
                    this.adapter = new AdapterBook(this, tmp.getItems());
                    count++;
                    break;
                }
            }
            if(count==0)Toast.makeText(this,"No se Encontro "+add,Toast.LENGTH_LONG).show();
            else this.listview.setAdapter(this.adapter);

        }catch (Exception e){
            Toast.makeText(this,e+"",Toast.LENGTH_SHORT).show();
        }
    }
}
