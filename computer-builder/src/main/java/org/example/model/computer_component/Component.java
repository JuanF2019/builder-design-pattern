package org.example.model.computer_component;

public abstract class Component {

    private String name;

    private float price;

    public Component(String name, float price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return name + "-$" + price;
    }

    public String getName(){
        return name;
    }

    public float getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(float price){
        this.price = price;
    }


}
