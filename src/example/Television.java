package example;

public class Television {
    private String brand;
    private float diagonal;

    private int yearManufacture;
    private float price;

    Television()
    {
        brand = "Samsung";
        diagonal = 29.00F;
        yearManufacture = 2023;
        price = 30000.55F;
    }

    Television(String brand, float diagonal, int yearManufacture, float price) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.yearManufacture = yearManufacture;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
