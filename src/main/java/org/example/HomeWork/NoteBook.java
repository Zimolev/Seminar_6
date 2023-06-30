package org.example.HomeWork;

public class NoteBook {
    private String manufacturer;
    private String model;
    private Integer screenSize;
    private Integer screenResolution;
    private String color;
    private Integer ram;
    private String os;
    private Integer hdd;
    private Double price;

    public NoteBook() {
    }

    public NoteBook(String manufacturer, String model, Integer screenSize, Integer screenResolution,
                    String color, Integer ram, String os, Integer hdd, Double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenSize = screenSize;
        this.screenResolution = screenResolution;
        this.color = color;
        this.ram = ram;
        this.os = os;
        this.hdd = hdd;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public Integer getScreenResolution() {
        return screenResolution;
    }

    public String getColor() {
        return color;
    }

    public Integer getRam() {
        return ram;
    }

    public String getOs() {
        return os;
    }

    public Integer getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", screenResolution=" + screenResolution +
                ", color='" + color + '\'' +
                ", RAM=" + ram +
                ", os='" + os + '\'' +
                ", HDD=" + hdd +
                ", price=" + price +
                '}';
    }
}
