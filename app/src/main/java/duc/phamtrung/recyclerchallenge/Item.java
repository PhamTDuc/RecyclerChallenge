package duc.phamtrung.recyclerchallenge;

public class Item {
    private String name;
    private String model;
    private String brand;

    public Item(String name, String model, String brand) {
        this.name = name;
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
