package com.chef.products;

public abstract class Product {

    private int calorie;
    private int weight;
    private String name;

    public Product(String name, int calorie, int weight){
        this.name=name;
        this.calorie=calorie;
        this.weight=weight;
    }
    public int countCalories(int weight, int calorie){
        return weight*calorie;
    }

    public int getWeight(){
        return weight;
    }
    public int getCalorie(){
        return calorie;
    }
    public String getName(){
        return name;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public void setCalorie(int calorie){
        this.calorie=calorie;
    }
    public void setName(String name){
        this.name=name;
    }
}
