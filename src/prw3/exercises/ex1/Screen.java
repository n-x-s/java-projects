package prw3.exercises.ex1;

public class Screen {

    String displayCustomerName(Customer customer) {
        String displayName = customer.getName();

        if (customer.getCategory().equalsIgnoreCase("business")) {
            displayName = customer.getName().toUpperCase();
        } else if (customer.getCategory().equalsIgnoreCase("economic")) {
            displayName = customer.getName().toLowerCase();
        }

        System.out.println(customer.getCategory() + ": " + displayName);

        return displayName;
    }

}
