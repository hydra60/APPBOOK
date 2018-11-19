package com.example.rex.appandroid.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rex.appandroid.Objects.Book;
import com.example.rex.appandroid.R;

import java.util.ArrayList;

public class AdapterBook extends BaseAdapter{
    private Context context;
    private ArrayList<Book> listItem ;
    public AdapterBook(Context context,ArrayList<Book> book){
        this.context = context;
        this.listItem = book;
    }
    @Override
    public int getCount() {
        return this.listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Book libro = (Book) getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.item_book,null);
        // aqui damos el diseño de la vista

        //ImageView img = (ImageView) convertView.findViewById(R.id.inflater_image);
        TextView titulo = (TextView) convertView.findViewById(R.id.inflater_title);
        TextView author = (TextView)convertView.findViewById(R.id.inflater_author);
        TextView edition = (TextView)convertView.findViewById(R.id.inflater_edition);
        TextView anio = (TextView)convertView.findViewById(R.id.inflater_anio);
        TextView categoria = (TextView)convertView.findViewById(R.id.inflater_categoria);

        //llenado seteado
        //img.setImageResource(2);//aqui se setea los view con los datos del objeto
        titulo.setText(libro.getTitulo());
        author.setText(libro.getAuthor());
        edition.setText(libro.getEdition());
        anio.setText(libro.getAnio());
        categoria.setText(libro.getAuthor());
        return convertView;
    }
}
