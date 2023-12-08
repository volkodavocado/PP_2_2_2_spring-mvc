package web.model;

public class Car {
    private int price;
    private int series;
    private String model;

    public Car(int price, int series, String model) {
        this.price = price;
        this.series = series;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public int getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }
}
