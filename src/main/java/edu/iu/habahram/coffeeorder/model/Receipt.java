package edu.iu.habahram.coffeeorder.model;

public record Receipt(String description, float cost) {

    static int id;

    public void setId(int id){
        Receipt.id = id;
    }

    public int getId(){
        return id;
    }
}
