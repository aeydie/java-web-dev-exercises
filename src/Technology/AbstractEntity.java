package Technology;

import java.util.ArrayList;
import java.util.UUID;

public class AbstractEntity {

    private static String idNumber;
    private static ArrayList<String> idnumbers = new ArrayList<>();

    public String getIdNumber() { return idNumber;}

    public static String createIdNumber() {
        idNumber = "";
        while (idNumber == "") {
            idNumber = UUID.randomUUID().toString();

            if (!idnumbers.contains(idNumber)) {
                idnumbers.add(idNumber);
                break;
            } else
                idNumber = "";
        }
        return idNumber;
    }


}

