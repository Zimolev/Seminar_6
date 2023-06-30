package org.example.HomeWork;

public class NoteBook {
    private String manufacturer;
    private String model;
    private Integer screenSize;
    private Integer screenResolution;
    private String color;
    private Integer RAM;
    private String os;
    private Integer HDD;
    private Double price;

    public NoteBook() {
    }

    public NoteBook(String manufacturer, String model, Integer screenSize, Integer screenResolution,
                    String color, Integer RAM, String os, Integer HDD, Double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenSize = screenSize;
        this.screenResolution = screenResolution;
        this.color = color;
        this.RAM = RAM;
        this.os = os;
        this.HDD = HDD;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(Integer screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getHDD() {
        return HDD;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }


    @Override
    public String toString() {
        return "NoteBook{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", screenResolution=" + screenResolution +
                ", color='" + color + '\'' +
                ", RAM=" + RAM +
                ", os='" + os + '\'' +
                ", HDD=" + HDD +
                ", price=" + price +
                '}';
    }
}
