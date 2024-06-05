package advancedCoding.clase_anonime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car carMercedes1 = new Car(20000, CarType.MERCEDES, 2010);
        Car carMercedes2 = new Car(35000, CarType.MERCEDES, 2015);

        Car carFiat1 = new Car(3500, CarType.FIAT, 2008);
        Car carFiat2 = new Car(7000, CarType.FIAT, 2010);

        Car carSkoda1 = new Car(12000, CarType.SKODA, 2015);
        Car carSkoda2 = new Car(25000, CarType.SKODA, 2021);

//        Dealership dealership = new Dealership();
//        System.out.println(dealership.getFinalPrice(carMercedes1));
//        System.out.println(dealership.getFinalPrice(carMercedes2));
//
//        System.out.println(dealership.getFinalPrice(carFiat1));
//        System.out.println(dealership.getFinalPrice(carFiat2));
//
//        System.out.println(dealership.getFinalPrice(carSkoda1));
//        System.out.println(dealership.getFinalPrice(carSkoda2));

        Car carMercedes3 = new Car(20000, CarType.MERCEDES, 2019);
//        System.out.println(dealership.getFinalPrice(carMercedes3));
//
//        dealership.negotiate(carMercedes3, new Offer() {
//            @Override
//            public int getDiscount(Car car) {
//                return 500;
//            }
//        });

        List<Car> cars = new ArrayList<>();

        cars.add(carMercedes1);
        cars.add(carMercedes2);
        cars.add(carMercedes3);
        cars.add(carFiat1);
        cars.add(carFiat2);
        cars.add(carSkoda1);
        cars.add(carSkoda2);

//        for (Car car : cars) {
//            if (car.getPrice() < 25000) {
//                System.out.println(car);
//                }
//            }

//        System.out.println(cars);
//        System.out.println(cars.stream()
//                .filter(car -> car.getPrice() < 25000)
//                .collect(Collectors.toList()));

//        System.out.println(cars.stream()
//                .filter(car -> car.getYear() == 2010)
//                .collect(Collectors.toList()));

        cars.removeIf(car -> car.getPrice() > 25000);
        System.out.println(cars);
    }

    }
