// ======= DO NOT EDIT THIS FILE ============

class Car {

    String owner;
    int price;

    Car(String xOwner, int xPrice) {
        owner = xOwner;
        price = xPrice;
    }

    @Override
    public String toString() {
        return ("(" + owner + "," + price + ")");
    }
}
