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
    private ArrayList<String> listItem ;
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
        convertView = LayoutInflater.from(context).inflate(R.layout.item_book
                ,null);
        // aqui damos el diseño de la vista
        ImageView img = (ImageView) convertView.findViewById(R.id.inflater_img);
        TextView titulo = (TextView) convertView.findViewById(R.id.inflater_titulo);
        TextView textDt = (TextView)convertView.findViewById(R.id.inflater_Book);

        //llenado seteado
        //img.setImageResource(2);//aqui se setea los view con los datos del objeto
        titulo.setText(libro.getTitulo());
        textDt.setText(libro.toString());
        return convertView;
    }
}
