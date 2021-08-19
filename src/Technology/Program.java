package Technology;

public class Program {

    public static void main(String[] args) {
        Computer cellphone = new SmartPhone(0, true, true, "black");

        System.out.println(((SmartPhone) cellphone).colorChoice());

        String uniqueID = AbstractEntity.createIdNumber();

        System.out.println(uniqueID);
    }
}
