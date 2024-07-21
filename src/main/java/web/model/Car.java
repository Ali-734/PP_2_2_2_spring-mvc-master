package web.model;

public class Car {
    private String model;
    private String region;
    private int series;

    public Car() {
    }

    public Car(String model, String region, int series) {
        this.model = model;
        this.region = region;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
