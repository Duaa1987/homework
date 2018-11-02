package com.project.duaa.treasuregame;

public class Treasure {


    private String name;
    private int imageResourceId;
    private String health;
    private String level;


  private  Product[] productArray=new Product[3];
     static Product[]productArray1={Product.products[0],Product.products[1],Product.products[2]};
    static Product[] productArray2={Product.products[1],Product.products[2],Product.products[3]};
    static Product[] productArray3={Product.products[2],Product.products[3],Product.products[4]};


    public Product[] getProductArray() {
        return productArray;
    }

    public void setProductArray1(Product[] productArray) {
         this.productArray = productArray;
    }

    public static final Treasure[] treasures = {
            new Treasure("David", R.drawable.daivd, "100", "simple",productArray1),
            new Treasure("Grege", R.drawable.greg,"200","master",productArray2),
            new Treasure("Phil", R.drawable.phil,"90","super-master",productArray3)
    };

    private Treasure(String name, int imageResourceId, String health,String level,Product[] productArray) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.health=health;
        this.level=level;
        this.productArray=productArray;
    }
    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getLevel() {
        return level;
    }

    public String getHealth() {
        return health;
    }
}
