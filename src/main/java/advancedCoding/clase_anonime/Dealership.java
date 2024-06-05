package advancedCoding.clase_anonime;

import java.time.LocalDate;

public class Dealership {
    private class BrandOffer implements Offer {

        @Override
        public int getDiscount(Car car) throws Exception {
            if (car.getType().equals(CarType.MERCEDES)) {
                return 5;
            } else if (car.getType().equals(CarType.FIAT)) {
                return 10;
            } else if (car.getType().equals(CarType.SKODA)){
                return 15;
            } else {
                throw new Exception("Brandul nu exista in dealership");
            }

        }
    }
    private class DealerOffer implements Offer {

        @Override
        public int getDiscount(Car car) throws Exception {
            if (car.getType().equals(CarType.MERCEDES)) {
                return 300 * (LocalDate.now().getYear() - car.getYear());
            } else if (car.getType().equals(CarType.FIAT)) {
                return 100 * (LocalDate.now().getYear() - car.getYear());
            } else if (car.getType().equals(CarType.SKODA)){
                return 150 * (LocalDate.now().getYear() - car.getYear());
            } else {
                throw new Exception("Brandul nu exista in dealership");
            }

        }
    }

    public double getFinalPrice(Car car) {
        BrandOffer brandOffer = new BrandOffer();
        int brandDiscount = 0;
        try {
            brandDiscount = brandOffer.getDiscount(car);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        double priceAfterBrandDiscount = car.getPrice() - car.getPrice() * brandDiscount / 100.0;
        car.setPrice(priceAfterBrandDiscount);
        System.out.println(
                "Applying "
                + brandOffer.getClass().getSimpleName()
                + " discount: "
                + brandDiscount
        );

        DealerOffer dealerOffer = new DealerOffer();
        int dealerDiscount = 0;
        try {
            dealerDiscount = dealerOffer.getDiscount(car);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
        int clientDiscount = 0;
        try {
            clientDiscount = offer.getDiscount(car);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        double priceAfterClientDiscount = car.getPrice() - clientDiscount;
        car.setPrice(priceAfterClientDiscount);
        System.out.println("Client discount has been applied: " + clientDiscount);
        System.out.println("New vehicle price is: " + car.getPrice());
    }

}

