package com.example.rex.appandroid.Objects;

import java.util.ArrayList;
import java.util.Iterator;


public class Market {
    public class BookCategories{

        private String name;
        private ArrayList<Book> items;
        BookCategories(String name,ArrayList<Book> itm){
            this.name = name;
            this.items = itm;
        }

        BookCategories(String name,Book itm){
            this.name = name;
            this.items = new ArrayList<>();
            this.items.add(itm);
        }

        BookCategories(String name){
            this.name = name;
            this.items = new ArrayList<>();

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Book> getItems() {
            return items;
        }

        public void setItems(ArrayList<Book> items) {
            this.items = items;
        }
    }


    private ArrayList<BookCategories> bk;

    public Market(){
        bk = new ArrayList<>();
        this.load_dates();
    }

    public void add (String tipo,Book Elemts){
        if(this.bk.size()!=0 && exist(tipo)){
            Iterator<BookCategories> it= this.bk.iterator();
            while(it.hasNext()){
                BookCategories tmp = (BookCategories) it.next();
                if(tmp.getName().equalsIgnoreCase(tipo)){
                     tmp.getItems().add(Elemts);
                 }
            }
        }else{
            if(tipo.equalsIgnoreCase("drama") || tipo.equalsIgnoreCase("novela")
                    || tipo.equalsIgnoreCase("accion")|| tipo.equalsIgnoreCase("ficcion")
                    || tipo.equalsIgnoreCase("terror")
                    || tipo.equalsIgnoreCase("infantil")|| tipo.equalsIgnoreCase("educativo")|| tipo.equalsIgnoreCase("fantasia")){
                this.bk.add(new BookCategories(tipo,Elemts));
            }
        }
    }
    public boolean exist(String tipo){

        Iterator<BookCategories> it= this.bk.iterator();
        while(it.hasNext()){
            BookCategories tmp = (BookCategories) it.next();
            if(tmp.getName().equals(tipo)){
                return true;
            }
        }
        return false;
    }
    public void load_dates(){
        add("infantil",new Book("barni", "Anonimo", "YYYYYY",2010, "Novela", 25.2));
        add("fantasia",new Book("Caballero de la armadura Oxidada", "Antonio Diaz Villamil", "Atenea",1998, "Fantasia", 25));
        add("fantasia",new Book("Caballero de la armadura Oxidada", "Antonio Diaz Villamil", "Atenea",1998, "Fantasia", 25));
        add("Ficcion",new Book("Burning Cruzzade", "Blizzar", "Blizzar",2010, "Ficcion", 125));
        add("Ficcion",new Book("Burning Cruzzade", "Blizzar", "Blizzar",2010, "Ficcion", 125));
        add("Ficcion",new Book("Legion", "Blizzar", "Blizzar",2017, "Ficcion", 100));
        add("Ficcion",new Book("Legion", "Blizzar", "Blizzar",2017, "Ficcion", 100));
        add("Novela",new Book("Bajo la Misma Estrella", "Anonimo", "YYYYYY",2010, "Novela", 25.2));
        add("Novela",new Book("Bajo la Misma Estrella", "Anonimo", "YYYYYY",2010, "Novela", 25.2));
        add("Novela",new Book("Bajo la Misma Estrella", "Anonimo", "YYYYYY",2010, "Novela", 25.2));
        add("Educativo",new Book("ciencias De la computacion", "YYYYYYYYYYYY", "edition",1998, "Educacion", 500));
        add("Educativo",new Book("titulo5", "author", "edition",1998, "Accion", 100));
        add("Educativo",new Book("titulo5", "author", "edition",1998, "Accion", 100));
        add("terror",new Book("It", "Steven", "edition",1998, "Accion", 100));
        add("terror",new Book("titulo7", "author", "edition",1998, "Terror", 100));
        add("Draama",new Book("titulo7", "author", "edition",1998, "Terror", 100));
        add("Draama",new Book("titulo7", "author", "edition",1998, "Terror", 100));
        add("Draama",new Book("titulo8", "author", "edition",1998, "Drama", 200));
        add("accion",new Book("titulo8", "author", "edition",1998, "Drama", 200));
        add("Educativo",new Book("titulo8", "author", "edition",1998, "Drama", 200));
        add("Educativo",new Book("titulo9", "author", "edition",1998, "infantil", 33));
        add("Educativo",new Book("titulo9", "author", "edition",1998, "infantil", 33));
        add("Educativo",new Book("titulo9", "author", "edition",1998, "infantil", 33));
        add("Educativo",new Book("titulo11", "author", "edition",1998, "Misterio", 25));
        add("novela",new Book("titulo11", "author", "edition",1998, "Misterio", 25));
        add("infantil",new Book("titulo11", "author", "edition",1998, "Misterio", 25));
        add("infantil",new Book("titulo12", "author", "edition",1998, "categoria", 125));
        add("Educativo",new Book("titulo13", "author", "edition",1998, "categoria", 25));
        add("ficcion",new Book("titulo14", "author", "edition",1998, "categoria", 100));
        add("accion",new Book("titulo15", "author", "edition",1998, "categoria", 900));
        add("fantasia",new Book("titulo16", "author", "edition",1998, "categoria", 100));

    }
    public ArrayList<BookCategories> getBk() {
        return bk;
    }

    public void setBk(ArrayList<BookCategories> bk) {
        this.bk = bk;
    }
}
