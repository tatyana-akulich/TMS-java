package by.teachmeskills.homework9.exceptions.obligatorytask.entities;

import java.util.Date;

public class ContractForGoodsSupply extends Document {
    private String typeOfGoods;
    private int amountOfGoods;

    public ContractForGoodsSupply(Date dateOfDocument, String numberOfDocument, String typeOfGoods, int amountOfGoods) {
        super(dateOfDocument, numberOfDocument);
        this.typeOfGoods = typeOfGoods;
        this.amountOfGoods = amountOfGoods;
    }

    public ContractForGoodsSupply() {
        super();
    }

    public String getTypeOfGoods() {
        return typeOfGoods;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type of goods is " + typeOfGoods);
        System.out.println("Amount of goods is " + amountOfGoods);
    }
}
