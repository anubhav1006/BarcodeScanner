package com.lenskart.barcodescanner;

public class BarcodeData {
    String barcode;
    String brand;
    String category;
    String productId;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BarcodeData(String barcode, String brand, String category, String productId) {
        this.barcode = barcode;
        this.brand = brand;
        this.category = category;
        this.productId = productId;
    }

    public BarcodeData() {
    }
}
