package fa.training.entities;

import fa.training.entities.bo.FlyMethod;

import java.io.Serializable;
import java.util.Objects;

public class Airplane implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ID;
    private String model;
    private short cruiseSpeed;
    private float emptyWeight;
    private float maxTakeOffWeight;
    private FlyMethod flyMethod;

    public Airplane() {

    }

    public Airplane(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(short cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public float getEmptyWeight() {
        return emptyWeight;
    }

    public void setEmptyWeight(float emptyWeight) {
        this.emptyWeight = emptyWeight;
    }

    public float getMaxTakeOffWeight() {
        return maxTakeOffWeight;
    }

    public void setMaxTakeOffWeight(float maxTakeOffWeight) {
        this.maxTakeOffWeight = maxTakeOffWeight;
    }

    public FlyMethod getFlyMethod() {
        return flyMethod;
    }

    public void setFlyMethod(FlyMethod flyMethod) {
        this.flyMethod = flyMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airplane)) return false;
        Airplane airplane = (Airplane) o;
        return cruiseSpeed == airplane.cruiseSpeed && Float.compare(airplane.emptyWeight, emptyWeight) == 0 && Float.compare(airplane.maxTakeOffWeight, maxTakeOffWeight) == 0 && Objects.equals(ID, airplane.ID) && Objects.equals(model, airplane.model) && flyMethod == airplane.flyMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, model, cruiseSpeed, emptyWeight, maxTakeOffWeight, flyMethod);
    }

    @Override
    public String toString() {
        return "ID='" + ID + '\'' +
                ", model='" + model + '\'' +
                ", cruiseSpeed=" + cruiseSpeed +
                ", emptyWeight=" + emptyWeight +
                ", maxTakeOffWeight=" + maxTakeOffWeight +
                ", flyMethod=" + flyMethod +
                '}';
    }

    public String toChar() {
        return ID +
                "," + model +
                "," + cruiseSpeed +
                "," + emptyWeight +
                "," + maxTakeOffWeight +
                "," + flyMethod;
    }
}
