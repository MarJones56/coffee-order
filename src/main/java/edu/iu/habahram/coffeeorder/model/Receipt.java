package edu.iu.habahram.coffeeorder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "coffee", name = "receipts")
public final class Receipt {

    @Id
    private int id;

    private float price;
    private String description;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Receipt() {

    }

    public Receipt(String description, float price){
        this.description = description;
        this.price = price;
    }
}
