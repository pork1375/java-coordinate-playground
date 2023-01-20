public class Sonata extends Car {

    private String name;
    private int distance;

    public Sonata(final int distance) {
        this.name = "Sonata";
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 10;
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
        return "Sonata{" +
                "name='" + name + '\'' +
                ", distance=" + getChargeQuantity() +
                '}';
    }
}
