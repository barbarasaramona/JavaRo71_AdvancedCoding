package advancedCoding.clase_anonime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(20000, CarType.MERCEDES, 2010);
        Car car2 = new Car(35000, CarType.MERCEDES, 2015);

        Car car3 = new Car(3500, CarType.FIAT, 2008);
        Car car4 = new Car(7000, CarType.FIAT, 2010);

        Car car5 = new Car(12000, CarType.SKODA, 2015);
        Car car6 = new Car(25000, CarType.SKODA, 2021);

//        Car car8 = new Car(50000, CarType.BENTLEY, 2022);

        Dealership dealership = new Dealership();
//        System.out.println(dealership.getFinalPrice(car1));
//        System.out.println(dealership.getFinalPrice(car2));
//        System.out.println(dealership.getFinalPrice(car3));
//        System.out.println(dealership.getFinalPrice(car4));
//        System.out.println(dealership.getFinalPrice(car5));
//        System.out.println(dealership.getFinalPrice(car6));
//        System.out.println(dealership.getFinalPrice(car8));

        Car car7 = new Car(20000, CarType.MERCEDES, 2019);
//        System.out.println(dealership.getFinalPrice(car7));
        dealership.negotiateCarOffer(car7, new Offer() {
            @Override
            public int getDiscount(Car car) {
                return 500;
            }
        });

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        carList.add(car3);
        carList.add(car4);

        carList.add(car5);
        carList.add(car6);
        carList.add(car7);

        for (Car car : carList) {
            if (car.getPrice() < 20000) {
                System.out.println(car);
            }
        }
        System.out.println(carList);
        System.out.println("Filtered list" + carList.stream()
                .filter(car -> car.getPrice() < 25000)
                .collect(Collectors.toList()));

        System.out.println("Car list of 2010 is: ");
        System.out.println(carList.stream()
                .filter(car -> car.getYear() == 2010)
                .collect(Collectors.toList()));

        System.out.println("List before modifier" + carList);
        carList.removeIf(car -> car.getPrice() > 25000);
        System.out.println("List after modifier" + carList);

    }
}
