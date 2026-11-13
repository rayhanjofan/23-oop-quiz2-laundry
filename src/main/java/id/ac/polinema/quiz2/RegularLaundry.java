package id.ac.polinema.quiz2;

public class RegularLaundry extends LaundryOrder {
public static final double RATE_PER_KG = 6000;

    public RegularLaundry(String id, Customer customer, double weightKg) {
        super(id, customer, weightKg);
    }

    @Override
    public double calculatePrice() {
        return getWeightKg() * RATE_PER_KG;
    }
}
