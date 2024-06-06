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
            } else if (car.getType().equals(CarType.SKODA)) {
                return 15;
            } else {
                throw new BrandNotFoundException();
//                throw new Exception("Brandul nu exista.");
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
            } else  {
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
        double pryceAfterBrandOffer = car.getPrice() - brandDiscount / 100.0 * car.getPrice();
        car.setPrice(pryceAfterBrandOffer);
        System.out.println("A fost aplicata oferta: " + brandOffer.getClass().getSimpleName() + " cu discountul "
                + brandDiscount + "%");

        DealerOffer dealerOffer = new DealerOffer();
        int dealerDiscount = 0;
        try {
            dealerDiscount = dealerOffer.getDiscount(car);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        double pryceAfterDealerOffer = car.getPrice() - dealerDiscount;
        car.setPrice(pryceAfterDealerOffer);
        System.out.println("A fost aplicata oferta: " + dealerOffer.getClass().getSimpleName() + " cu discountul "
                + dealerDiscount + "euro");

        return car.getPrice();
    }
    public void negotiate(Car car, Offer offer) {
        int clientDiscount = 0;
        try {
            clientDiscount = offer.getDiscount(car);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        double pryceAfterClientDiscount = car.getPrice() - clientDiscount;
        car.setPrice(pryceAfterClientDiscount);
        System.out.println("A fost aplicat discountul cerut de client de: " + clientDiscount + " euro");
        System.out.println("Noul pret este: " + car.getPrice());
    }
}
