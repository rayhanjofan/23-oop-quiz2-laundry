package id.ac.polinema.quiz2;

public class ExpressLaundry extends LaundryOrder implements Deliverable{
    public static final double RATE_PER_KG = 9000;

    public ExpressLaundry(String id, Customer customer, double weightKg) {
        super(id, customer, weightKg);
    }

    @Override
    public double calculatePrice() {
        return getWeightKg() * RATE_PER_KG;
    }

    @Override
    public double deliveryFee() {
        return 5000;
    }
}
