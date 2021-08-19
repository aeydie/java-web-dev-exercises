package Technology;

public class Computer extends AbstractEntity{

    private int ram;
    private boolean hasKeyboard;
    private boolean hasCamera;

    public Computer(int ram, boolean hasKeyboard, boolean hasCamera) {
        super();
        this.ram = ram;
        this.hasKeyboard = hasKeyboard;
        this.hasCamera = hasCamera;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }



    public double addRam(int n) {
        this.ram = this.ram + n;
        return ram;
    }

    public String keyboardTrue() {
        if (hasKeyboard) {
            return "Thank goodness you have a keyboard!";
        } else {
            return "Are you sure you just want a touchscreen?";
        }
  }

    public String cameraTrue() {
        if (hasCamera) {
            return "You can do all of the live meetings you want!";
        } else {
            return "You should make sure that you don't need a camera because this computer doesn't have one!";
        }
    }

}
