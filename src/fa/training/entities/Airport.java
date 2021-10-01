package fa.training.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Airport implements Serializable {

    private static final long serialVersionUID = 2L;

    private String id;
    private String name;
    private short runwaySize;
    private byte maxFixedWingParkingPlaces;
    private List<String> fixedWingIDs;
    private byte maxHelicopterParkingPlaces;
    private List<String> helicopterIDs;

    public Airport() {
    }

    public Airport(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getRunwaySize() {
        return runwaySize;
    }

    public void setRunwaySize(short runwaySize) {
        this.runwaySize = runwaySize;
    }

    public byte getMaxFixedWingParkingPlaces() {
        return maxFixedWingParkingPlaces;
    }

    public void setMaxFixedWingParkingPlaces(byte maxFixedWingParkingPlaces) {
        this.maxFixedWingParkingPlaces = maxFixedWingParkingPlaces;
    }

    public List<String> getFixedWingIDs() {
        return fixedWingIDs;
    }

    public void setFixedWingIDs(List<String> fixedWingIDs) {
        this.fixedWingIDs = fixedWingIDs;
    }

    public byte getMaxHelicopterParkingPlaces() {
        return maxHelicopterParkingPlaces;
    }

    public void setMaxHelicopterParkingPlaces(byte maxHelicopterParkingPlaces) {
        this.maxHelicopterParkingPlaces = maxHelicopterParkingPlaces;
    }

    public List<String> getHelicopterIDs() {
        return helicopterIDs;
    }

    public void setHelicopterIDs(List<String> helicopterIDs) {
        this.helicopterIDs = helicopterIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return runwaySize == airport.runwaySize &&
                maxFixedWingParkingPlaces == airport.maxFixedWingParkingPlaces &&
                maxHelicopterParkingPlaces == airport.maxHelicopterParkingPlaces &&
                Objects.equals(id, airport.id) && Objects.equals(name, airport.name) &&
                Objects.equals(fixedWingIDs, airport.fixedWingIDs) &&
                Objects.equals(helicopterIDs, airport.helicopterIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, runwaySize, maxFixedWingParkingPlaces, fixedWingIDs, maxHelicopterParkingPlaces, helicopterIDs);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", runwaySize=" + runwaySize +
                ", maxFixedWingParkingPlaces=" + maxFixedWingParkingPlaces +
                ", fixedWingIDs=" + fixedWingIDs +
                ", maxHelicopterParkingPlaces=" + maxHelicopterParkingPlaces +
                ", helicopterIDs=" + helicopterIDs +
                '}';
    }

    public String toChar() {
        return id +
                "," + name +
                "," + runwaySize +
                "," + maxFixedWingParkingPlaces +
                "," + fixedWingIDs +
                "," + maxHelicopterParkingPlaces +
                "," + helicopterIDs;
    }
}
