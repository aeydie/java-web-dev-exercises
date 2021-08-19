package Technology;

public class SmartPhone extends Computer {

    public String color;


    public SmartPhone(int ram, boolean hasKeyboard, boolean hasCamera, String color) {
        super(ram, hasKeyboard, hasCamera);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    ;

    public String colorChoice() {
        if (this.color == "black") {
            return "Your phone is going to be on back order for a while!";
        } else {
            return "Your phone will be deliver within 5-7 days!";
        }
    }
}
