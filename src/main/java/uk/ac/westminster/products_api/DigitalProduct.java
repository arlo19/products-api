package uk.ac.westminster.products_api;


public class DigitalProduct extends Product {

    private String downloadUrl;
    private double fileSizeMB;

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

    // Getter for downloadUrl
    public String getDownloadUrl() {
        return downloadUrl;
    }

    // Getter for fileSizeMB
    public double getFileSizeMB() {
        return fileSizeMB;
    }
}

