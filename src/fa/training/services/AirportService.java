package fa.training.services;

import fa.training.entities.Airport;
import fa.training.utils.ID;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportService {

    private static final String filePath = ".\\airport.txt";


    private final Scanner scanner = new Scanner(System.in);

    /**
     *
     * @return
     */
    public Airport create() {
        Airport response = new Airport(ID.getAirportID());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter runway size: ");
        short runwaySize = scanner.nextShort();
        System.out.println("Enter max fixed wing parking places");
        byte maxFixedWingParkingPlaces = scanner.nextByte();

        List<String> fixedWingIDs = new ArrayList<>();
        String ans;
        List<String> helicopterIDs = new ArrayList<>();
        String ans1;
        for (byte i = 0; i < maxFixedWingParkingPlaces; i++) {
            System.out.print("Enter fixed wing plane ID: ");
            String fixedWingID = scanner.nextLine();
            if (fixedWingID == null)
                break;
            byte j = --maxFixedWingParkingPlaces;
            System.out.println("There are " + j + " slot(s) left, want to add more?y/n");
            ans = scanner.nextLine();
            if (ans.trim().equalsIgnoreCase("n"))
                break;
            fixedWingIDs.add(fixedWingID);
        }

        System.out.println("Enter max helicopter parking places: ");
        byte maxHelicopterParkingPlaces = scanner.nextByte();


        for (byte i = 0; i < maxHelicopterParkingPlaces; i++) {
            System.out.print("Enter fixed helicopter ID: ");
            String helicopterID = scanner.nextLine();
            if (helicopterID == null)
                break;
            byte j = --maxHelicopterParkingPlaces;
            System.out.println("There are " + j + " slot(s) left, want to add more?y/n");
            ans1 = scanner.nextLine();
            if (ans1.trim().equalsIgnoreCase("n"))
                break;
            helicopterIDs.add(helicopterID);

        }
        response.setName(name);
        response.setRunwaySize(runwaySize);
        response.setMaxFixedWingParkingPlaces(maxFixedWingParkingPlaces);
        response.setFixedWingIDs(fixedWingIDs);
        response.setMaxHelicopterParkingPlaces(maxHelicopterParkingPlaces);
        response.setHelicopterIDs(helicopterIDs);
        save(response);
        return response;
    }

    /**
     *
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public List<Airport> getAll(String path) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(filePath);
        List<Airport> objectsList = new ArrayList<>();
        boolean cont = true;
        while (cont) {
            try (ObjectInputStream input = new ObjectInputStream(fis)) {
                Airport obj = (Airport) input.readObject();
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

    /**
     *
     * @param airport
     */
    private void save(Airport airport) {
        try {

            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(airport);
            objectOut.close();
            System.out.println("The Airport was successfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
