package fa.training.utils;

import fa.training.entities.Airplane;
import fa.training.entities.Helicopter;
import fa.training.entities.bo.A201Exception;

public enum AirplaneValidator {
    ;

    /**
     * The model size is maximum 40 characters.
     *
     * @param object {@link Airplane}
     */
    public static void validateObjectSize(Airplane object) {
        int size = object.toChar().replaceAll(",", "").length();
        if(size > 40)
            throw new A201Exception("The model size is maximum 40 characters.");
    }

    /**
     * The max takeoff weight of helicopter does not excess 1.5 times of its empty weight.
     *
     * @param helicopter object to validate
     */
    public static void validateHelicopterCargo(Helicopter helicopter) {
        if(helicopter.getMaxTakeOffWeight() > helicopter.getEmptyWeight() * 1.5)
            throw new A201Exception("The max takeoff weight of helicopter " +
                    "does not excess 1.5 times of its empty weight.");
    }

    private boolean isNullOrEmpty(String txt){
        return txt == null || txt.trim().isEmpty();
    }
}
