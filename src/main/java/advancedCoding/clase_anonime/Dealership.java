package advancedCoding.clase_anonime;

import java.time.LocalDate;

public class Dealership {
    private class BrandOffer implements Offer{

        @Override
        public int getDiscount(Car car) throws Exception {
            if (car.getType().equals(CarType.MERCEDES)) {
                return 5;
            } else if (car.getType().equals(CarType.FIAT)) {
                return 10;
            } else if (car.getType().equals(CarType.SKODA)) {
                return 15;
            } else {
                throw new BrandNotFoundException();
            }
        }
    }

    private class DealerOffer implements Offer {

        @Override
        public int getDiscount(Car car) throws Exception {
            int currentYear = LocalDate.now().getYear();
            int carAge = currentYear - car.getYear();
            if (CarType.MERCEDES.equals(car.getType())) {
                return 300 * carAge;
            } else if (CarType.FIAT.equals(car.getType())) {
                return 100 * carAge;
            } else if (CarType.SKODA.equals(car.getType())) {
                return 150 * carAge;
            } else {
                throw new BrandNotFoundException();
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
        double priceAfterBrandOffer = car.getPrice() - brandDiscount / 100.0 * car.getPrice();
        car.setPrice(priceAfterBrandOffer);
        System.out.println("Offer applied: " + brandOffer.getClass().getSimpleName() + " with discount: "
                + brandDiscount + "%");

        DealerOffer dealerOffer = new DealerOffer();
        int dealerDiscount = 0;
        try {
            dealerDiscount = dealerOffer.getDiscount(car);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        double priceAfterDealerOffer = car.getPrice() - dealerDiscount;
        car.setPrice(priceAfterDealerOffer);
        System.out.println("Offer applied: " + dealerOffer.getClass().getSimpleName() + " with discount: "
                + dealerDiscount + "Euro");

        return car.getPrice();
    }

    public void negotiateCarOffer (Car car, Offer offer) {
        int clientDiscount = 0;
        try {
            clientDiscount = offer.getDiscount(car);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        double priceAfterClientDiscount = car.getPrice() - clientDiscount;
        car.setPrice(priceAfterClientDiscount);
        System.out.println("Applied client discount of: " + clientDiscount + "Euro");
        System.out.println("New price is: " + car.getPrice());
    }

}
