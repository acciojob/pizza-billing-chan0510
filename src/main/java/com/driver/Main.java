package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(false);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
//    dp.addExtraCheese();
//    dp.addExtraCheese();
//    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    DeluxePizza p = new DeluxePizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    //p.addTakeaway();
    System.out.println(p.getBill());
  }
}