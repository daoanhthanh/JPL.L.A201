package fa.training.utils;

import fa.training.entities.Airport;
import fa.training.entities.FixedWing;
import fa.training.entities.bo.A201Exception;

public enum AirportValidator {
    ;


    /**
     * The model size is maximum 40 characters.
     *
     * @param object {@link Airport}
     */
    public static void validateObjectSize(Airport object) {
        int size = object.toChar().replaceAll(",", "").length();
        if(size > 40)
            throw new A201Exception("The model size is maximum 40 characters.");
    }

    /**
     * If a fixed wing airplane is parked in an airport, its min runway size does not excess the airport runway
     * size.
     *
     * @param plane   {@link FixedWing}
     * @param airport {@link Airport}
     */
    public static void whetherAirplaneCanPark(FixedWing plane, Airport airport) {
        if( plane.getMinNeededRunway() > airport.getRunwaySize())
            throw new A201Exception("If a fixed wing airplane is parked in an airport, " +
                    "its min runway size does not excess the airport runway size.");
    }

    //
    public static void validateAirport(Airport object){
         validateName(object.getName());
         // more...
    }

    //
    private static void validateName(String name){
        if(!isNullOrEmpty(name))
            throw new A201Exception("Invalid name");
    }

    private static boolean isNullOrEmpty(String txt) {
        return txt == null || txt.trim().isEmpty();
    }

}
