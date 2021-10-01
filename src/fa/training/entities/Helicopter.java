package fa.training.entities;

import java.util.Objects;

public class Helicopter extends Airplane {
    private short range;

    public Helicopter() {
        super();
    }

    public Helicopter(String ID) {
        super(ID);
    }

    public Helicopter(short range) {
        super();
        this.range = range;
    }

    public short getRange() {
        return range;
    }

    public void setRange(short range) {
        this.range = range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Helicopter)) return false;
        if (!super.equals(o)) return false;
        Helicopter that = (Helicopter) o;
        return range == that.range;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), range);
    }

    @Override
    public String toString() {
        return "Helicopter{" + super.toString() +
                ", range=" + range +
                '}';
    }

    public String toChar() {
        return super.toChar() +
                "," + range;
    }

}
