package com.dorota.inventorymanagementsystem.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor

public class Product {

    private String id;

    private String EAN;

    private String name;

    private String producer;

    private String category;

    private int VAT;

    private BigDecimal purchasePriceNetto;

    private BigDecimal purchasePriceBrutto;

    private BigDecimal sellPriceRetail;

    private BigDecimal sellPriceWholesale;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getVAT() {
        return VAT;
    }

    public void setVAT(int VAT) {
        this.VAT = VAT;
    }

    public BigDecimal getPurchasePriceNetto() {
        return purchasePriceNetto;
    }

    public void setPurchasePriceNetto(BigDecimal purchasePriceNetto) {
        this.purchasePriceNetto = purchasePriceNetto;
    }

    public BigDecimal getPurchasePriceBrutto() {
        return purchasePriceBrutto;
    }

    public void setPurchasePriceBrutto(BigDecimal purchasePriceBrutto) {
        this.purchasePriceBrutto = purchasePriceBrutto;
    }

    public BigDecimal getSellPriceRetail() {
        return sellPriceRetail;
    }

    public void setSellPriceRetail(BigDecimal sellPriceRetail) {
        this.sellPriceRetail = sellPriceRetail;
    }

    public BigDecimal getSellPriceWholesale() {
        return sellPriceWholesale;
    }

    public void setSellPriceWholesale(BigDecimal sellPriceWholesale) {
        this.sellPriceWholesale = sellPriceWholesale;
    }
}
