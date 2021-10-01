package fa.training.entities;

import fa.training.entities.bo.PlaneType;

import java.util.Objects;

public class FixedWing extends Airplane {
    private PlaneType planeType;
    private short minNeededRunway;

    public FixedWing() {
    }

    public FixedWing(String ID) {
        super(ID);
    }

    public FixedWing(PlaneType planeType, short minNeededRunway) {
        super();
        this.planeType = planeType;
        this.minNeededRunway = minNeededRunway;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public short getMinNeededRunway() {
        return minNeededRunway;
    }

    public void setMinNeededRunway(short minNeededRunway) {
        this.minNeededRunway = minNeededRunway;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FixedWing)) return false;
        if (!super.equals(o)) return false;
        FixedWing fixedWing = (FixedWing) o;
        return minNeededRunway == fixedWing.minNeededRunway && planeType == fixedWing.planeType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), planeType, minNeededRunway);
    }

    @Override
    public String toString() {
        return "FixedWing{" + super.toString() +
                ", planeType=" + planeType +
                ", minNeededRunway=" + minNeededRunway +
                '}';
    }

    public String toChar() {
        return super.toChar() +
                "," + planeType +
                "," + minNeededRunway;
    }
}
