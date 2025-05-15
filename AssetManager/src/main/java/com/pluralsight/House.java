package com.pluralsight;

public class House extends Asset{

    private String address;
    private int condition;
    private int squareFootage;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFootage, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFootage = squareFootage;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double result;

        double pricePerSquareFoot = 0;
        switch (this.condition) {
            case 1:
                pricePerSquareFoot = 180;
                break;
            case 2:
                pricePerSquareFoot = 130;
                break;
            case 3:
                pricePerSquareFoot = 90;
                break;
            case 4:
                pricePerSquareFoot = 80;
                break;
        }
        result = (this.squareFootage * pricePerSquareFoot) + (this.lotSize * 0.20);
        return result;
    }
}
