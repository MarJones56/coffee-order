package edu.iu.habahram.coffeeorder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "coffee", name = "receipts")
public record Receipt(String description, float cost) {

    @Id
    static int id;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
