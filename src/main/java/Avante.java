public class Avante extends Car {


    private String name;
    private int distance;

    public Avante(final int distance) {
        this.name = "Avante";
        this.distance = distance;
    }


    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Avante{" +
                "name='" + name + '\'' +
                ", distance=" + getChargeQuantity() +
                '}';
    }
}
