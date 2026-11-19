package uk.ac.westminster.products_api;

//abstract class cannot be instantiated directly.
//Product p = new Product();

public abstract class Product{
    private Long id;
    private String name;
    private double price;

    // Tutorial 5 Activity 1: getSummary()
    //public String getSummary() {
      //  return getName() + " — £" + getPrice();
    //}

    public Product() {}

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //getSummary() when class is abstract
    public abstract String getSummary();

    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }


// Tutorial 2 Activity 3: verified getter removal affects JSON output

    // add these alongside the getters you wrote in Lecture 2
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
}


