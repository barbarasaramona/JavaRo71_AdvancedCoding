package advancedCoding.clase_anonime;

import java.time.LocalDate;

public class Dealership {
    private class BrandOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            if (car.getType().equals(CarType.MERCEDES)) {
                return 5;
            } else if (car.getType().equals(CarType.FIAT)) {
                return 10;
            } else if (car.getType().equals(CarType.SKODA)){
                return 15;
            }
            return 0;
        }
    }
    private class DealerOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            if (car.getType().equals(CarType.MERCEDES)) {
                return 300 * (LocalDate.now().getYear() - car.getYear());
            } else if (car.getType().equals(CarType.FIAT)) {
                return 100 * (LocalDate.now().getYear() - car.getYear());
            } else if (car.getType().equals(CarType.SKODA)){
                return 150 * (LocalDate.now().getYear() - car.getYear());
            }
            return 0;
        }
    }

    public double getFinalPrice(Car car) {
        BrandOffer brandOffer = new BrandOffer();
        int brandDiscount = brandOffer.getDiscount(car);
        double priceAfterBrandDiscount = car.getPrice() - car.getPrice() * brandDiscount / 100.0;
        car.setPrice(priceAfterBrandDiscount);
        System.out.println(
                "Applying "
                + brandOffer.getClass().getSimpleName()
                + " discount: "
                + brandDiscount
        );

        DealerOffer dealerOffer = new DealerOffer();
        int dealerDiscount = dealerOffer.getDiscount(car);
        double priceAfterDealerDiscount = car.getPrice() - dealerDiscount;
        car.setPrice(priceAfterDealerDiscount);
        System.out.println(
                "Applying "
                + dealerOffer.getClass().getSimpleName()
                + " discount: "
                + dealerDiscount
        );

        return car.getPrice();
    }

    public void negotiate (Car car, Offer offer) {
        int clientDiscount = offer.getDiscount(car);
        double priceAfterClientDiscount = car.getPrice() - clientDiscount;
        car.setPrice(priceAfterClientDiscount);
        System.out.println("Client discount has been applied: " + clientDiscount);
        System.out.println("New vehicle price is: " + car.getPrice());
    }

}

