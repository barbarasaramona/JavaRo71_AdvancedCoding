package advancedCoding.clase_anonime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car mercedes1 = new Car(20000, CarType.MERCEDES,2010);
        Car mercedes2 = new Car(35000, CarType.MERCEDES,2015);

        Car fiat1 = new Car(3500, CarType.FIAT,2008);
        Car fiat2 = new Car(7000, CarType.FIAT,2010);

        Car skoda1 = new Car(12000, CarType.SKODA,2015);
        Car skoda2 = new Car(25000, CarType.SKODA,2021);

        Car bentley = new Car(50000, CarType.BENTLEY, 2022);

        Dealership dealership = new Dealership();
//        System.out.println(dealership.getFinalPrice(mercedes1));
//        System.out.println(dealership.getFinalPrice(mercedes2));
//
//        System.out.println(dealership.getFinalPrice(fiat1));
//        System.out.println(dealership.getFinalPrice(fiat2));
//
//        System.out.println(dealership.getFinalPrice(skoda1));
//        System.out.println(dealership.getFinalPrice(skoda2));

        Car mercedes3 = new Car(20000, CarType.MERCEDES, 2019);
        // new Offer -> clasa anonima dintr-o interfata
//        System.out.println(dealership.getFinalPrice(mercedes3));
        dealership.negotiate(mercedes3, new Offer() {
            @Override
            public int getDiscount(Car car) {
                return 500;
            }
        });

        List<Car> cars = new ArrayList<>();
        cars.add(mercedes1);
        cars.add(mercedes2);

        cars.add(fiat1);
        cars.add(fiat2);

        cars.add(skoda1);

        for (Car car : cars) {
            if (car.getPrice() < 25000 ) {
                System.out.println(car);
            }
        }
        System.out.println(cars);
        System.out.println("Lista cu masini sub 25000: " + cars.stream()
                .filter(car -> car.getPrice() < 25000)
                .collect(Collectors.toList()));
        System.out.println("Lista cu masini din 2010 este: ");
        System.out.println(cars.stream().filter(car -> car.getYear() == 2010).collect(Collectors.toList()));
        System.out.println("Lista inainte de modificare: " + cars);
        cars.removeIf(car -> car.getPrice() > 25000);
        System.out.println("Lista dupa modificare: " + cars);

        dealership.getFinalPrice(bentley);
        System.out.println(bentley.getPrice());


    }
}
