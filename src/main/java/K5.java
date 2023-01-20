public class K5 extends Car {

    private String name;

    private int distance;

    public K5(final int distance) {
        this.name = "K5";
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 13;
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
        return "K5{" +
                "name='" + name + '\'' +
                ", distance=" + getChargeQuantity() +
                '}';
    }
}
