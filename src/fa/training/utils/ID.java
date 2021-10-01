package fa.training.utils;

/**
 * An id generator which satisfies requirement.
 * <pre>
 *     <code>Domain constraints:</code> ID is a string of 7 characters,
 *     started by “FW” for fixed wing airplane, “RW” for helicopter and “AP” for
 *     airport, followed by 5 digits. ID is unique.
 * </pre>
 */
public final class ID {
    private static int FWID = 0;
    private static int RWID = 0;
    private static int APID = 0;

    private ID() {
    }

    /**
     * Formatted id for fixed wing airplane
     *
     * @return Formatted id for fixed wing airplane
     */
    public static String getFixedWingID() {

        return "FW" + String.format("%5d", ++FWID);
    }

    /**
     * Formatted id for rotated wing airplane
     *
     * @return Formatted id for helicopter
     */
    public static String getRotatedWingID() {

        return "RW" + String.format("%5d", ++RWID);
    }

    /**
     * Formatted id for airport
     *
     * @return Formatted id for airport
     */
    public static String getAirportID() {

        return "AP" + String.format("%5d", ++APID);
    }
}
