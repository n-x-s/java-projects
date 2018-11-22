package prw3.exercises.ex1;

public class Screen {

    public void display(Customer customer) {
        System.out.println(formatName(customer));
    }

    String formatName(Customer customer) {
        if (customer.getCategory().equalsIgnoreCase("business")) {
            return customer.getName().toUpperCase();
        }
        return customer.getName().toLowerCase();
    }

}
