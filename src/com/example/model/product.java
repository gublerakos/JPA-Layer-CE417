package com.example.model;

public class product {
    private String barcode;
    private String name;
    private String colour;
    private String description;
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