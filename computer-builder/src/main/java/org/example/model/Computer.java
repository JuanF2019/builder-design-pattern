package org.example.model;


import org.example.model.computer_component.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Computer {

    private List<Component> components = new ArrayList<>();

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public float price(){

        float price = 0f;

        for (Component component:components){
            price += component.getPrice();
        }

        return price;
    }

    public Computer addComponent(Component component){
        components.add(component);
        return this;
    }

    public String toString(){
        StringBuilder comps = new StringBuilder();

        for (Component component:components){
            comps.append(component.toString()).append("\n");
        }

        comps.append("Price: $").append(price());

        return comps.toString();
    }



}
