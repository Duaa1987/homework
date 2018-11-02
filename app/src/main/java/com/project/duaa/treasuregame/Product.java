package com.project.duaa.treasuregame;



public class Product {

    private int id;
    private String title;
    private String level;
    private String rating;
    private int image;

    public Product(int id, String title, String level, String rating, int image) {
        this.id = id;
        this.title = title;
        this.level = level;
        this.rating = rating;
        this.image = image;

    }



    public static final Product[] products = {
            new Product(
                    1,"Toys Treasures, alot of beautiful toys you can enjoy", "cheap", "2.5", R.drawable.treasureone),
            new Product(
                    2, "golden treasure, which contain fabulous things, diamond)", "high", "4.3" , R.drawable.golden),
            new Product(
                    3, "this sliver treasure, it contain alot beatiful things", "mediam", "3.8",  R.drawable.sliver),
            new Product(
                    4, "this sand treasure, it contain alot beatiful things", "mediam", "2.8",  R.drawable.sand),
            new Product(
                    5, "this Pearl treasure, it contain alot beatiful things", "mediam", "4.7",  R.drawable.pearl),
            new Product(
                    6, "this empty treasure, it contain alot beatiful things", "low", "1.5",  R.drawable.empty),
            new Product(
                    7, "this X-large treasure, it contain alot beatiful things", "very high", "5.0",  R.drawable.sliver)
                   };



    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getlevel() {
        return level;
    }

    public String getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }
}
