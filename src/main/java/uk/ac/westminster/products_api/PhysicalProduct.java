package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it shares the common
// properties of a product, such as id, name and price.
// A ShoppingCart is not a Product because it contains products.

public class PhysicalProduct extends Product implements Discountable {

    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    // TODO (a): empty no-arg constructor for Jackson
    // No-argument constructor
    public PhysicalProduct() {

    }

    // TODO (b): full constructor.
    // First line must be super(id, name, price);
    // then assign this.weightKg and this.dimensions

    // Full constructor
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {

        super(id, name, price);

        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    //Override getSummary() from Product
    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + " kg";
    }
    @Override
    public void applyDiscount(double rate) {

        double capped = Math.min(rate, 0.20); // TODO (a): cap the rate at 0.20 with Math.min
        discountedPrice = getPrice() * (1 - capped); // TODO (b): apply the capped rate, not the rate
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    // TODO (c): getWeightKg() and getDimensions()

    // Getter for weightKg
    public double getWeightKg() {
        return weightKg;
    }

    // Getter for dimensions
    public String getDimensions() {
        return dimensions;
    }
}

