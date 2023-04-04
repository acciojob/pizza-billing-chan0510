package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isBillGenerated;
    private  int extraCheese;
    private boolean isExtraCheeseAdded;
    private int extraTopping;
    private boolean isExtraToppingAdded;
    private int costOfPaperBag;
    private boolean isCostOfPaperBagAdded;
    private int totalPizzaBill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true){
            price=300;
            extraTopping=70;
            bill="Veg pizza base price: "+price+"\n" ;
        }
        else {
            price=400;
            extraTopping=120;
            bill="Non-veg pizza base price: "+price+"\n" ;
        }
        costOfPaperBag=20;
        extraCheese=80;
        totalPizzaBill+=price;
        isCostOfPaperBagAdded=false;
        isExtraCheeseAdded=false;
        isExtraToppingAdded=false;
        isBillGenerated=false;
        // your code goes here

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheeseAdded==false){
            totalPizzaBill+=extraCheese;
            isExtraCheeseAdded=true;
            bill+="Extra Cheese Added: "+extraCheese+"\n";
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingAdded==false){
            totalPizzaBill+=extraTopping;
            isExtraToppingAdded=true;
            bill+="Extra Toppings Added: "+extraTopping+"\n";
        }

    }

    public void addTakeaway(){
        if(isCostOfPaperBagAdded==false){
            isCostOfPaperBagAdded=true;
            totalPizzaBill+=costOfPaperBag;
            bill+="Paperbag Added: "+costOfPaperBag+"\n";
        }
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){
            isBillGenerated=true;
            bill+="Total Price: "+totalPizzaBill+"\n";
        }
        return this.bill;
    }
}
