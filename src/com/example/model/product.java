package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productInfo")
public class product {

    @Id
    @Column(name="barcode")
    private String barcode;

    @Column(name="name")
    private String name;

    @Column(name="colour")
    private String colour;

    @Column(name="description")
    private String description;

    @Column(name="result")
    private int result;
    
    // Setters
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    public void setResult(int result) {
        this.result = result;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // Getters
    public String getBarcode() {
        return barcode;
    }
    public int getResult() {
        return result;
    }
    public String getName() {
        return name;
    }
    public String getColour() {
        return colour;
    }
    public String getDescription() {
        return description;
    }
}