package exercises.ex4;

public class CarShopApplication {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Car mini = new Car("Mini");
        seller.describe(mini);
        Car bmw = new Car("BMW");
        seller.describe(bmw);
        Car rollsRoyce = new Car("Rolls Royce");
        seller.describe(rollsRoyce);

    }
}
