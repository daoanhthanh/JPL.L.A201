package fa.training.services;

import fa.training.entities.Airplane;
import fa.training.entities.Airport;
import fa.training.entities.FixedWing;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AirplaneService {
    private static final String filePath = ".\\airplane.txt";
    public FixedWing createFixedWing(){
        return null;
    }


    public void save(Airplane airplane){
        try {

            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(airplane);
            objectOut.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public List<Airplane> getAll(String path) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(filePath);
        List<Airplane> objectsList = new ArrayList<>();
        boolean cont = true;
        while (cont) {
            try (ObjectInputStream input = new ObjectInputStream(fis)) {
                Airplane obj = (Airplane) input.readObject();
                if (obj != null) {
                    objectsList.add(obj);
                } else {
                    cont = false;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return objectsList;
    }
}
