package fa.training.main;

import fa.training.services.AirplaneService;
import fa.training.services.AirportService;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        AirplaneService airplaneService = new AirplaneService();
        AirportService airportService = new AirportService();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 >> Create new airport");
        System.out.println("2 >> Add airplane to airport");
        System.out.println("3 >> Remove airplane");
        System.out.println("4 >> Update airport");
        int ans = sc .nextInt();
        switch (ans){
            case 1:
                break;
            case 2:
                break;
        }
    }
}
