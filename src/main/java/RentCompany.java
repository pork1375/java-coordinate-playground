import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private List<Car> cars = new ArrayList<>();
    private RentCompany() {

    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }


    public String generateReport() {
        cars.forEach(System.out::println);
        return "실행해";
    }
}
