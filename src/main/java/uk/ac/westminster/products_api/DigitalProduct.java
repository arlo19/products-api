package uk.ac.westminster.products_api;


public class DigitalProduct extends Product implements Discountable {

    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    // No-argument constructor
    // no-arg constructor — Jackson needs this to build
    // an object from an incoming JSON request body

    public DigitalProduct() {

    }

    // Full constructor
    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB) {

        super(id, name, price);

        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    //Override getSummary() from Product
    @Override
    public String getSummary() {
        return "Digital: " + getName()
                + " | Download: " + downloadUrl;
    }

    //Apply discount
    @Override
    public void applyDiscount(double rate) {
        discountedPrice = getPrice() * (1 - rate);
    }

    //Return discounted price
    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    // Getter for downloadUrl
    public String getDownloadUrl() {
        return downloadUrl;
    }

    // Getter for fileSizeMB
    public double getFileSizeMB() {
        return fileSizeMB;
    }
}





