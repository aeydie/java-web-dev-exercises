package Technology;

public class Laptop extends Computer {

    private String brand;

    public Laptop(int ram, boolean hasKeyboard, boolean hasCamera, String brand) {
        super(ram, hasKeyboard, hasCamera);
        this.brand = brand;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String checkBrand() {
        if (brand == "Samsung") {
            return "You might want to return the computer and get another brand.";
        } else {
            return "Most brands besides Samsung are ok, so you are good to go!";
        }
    }
}
