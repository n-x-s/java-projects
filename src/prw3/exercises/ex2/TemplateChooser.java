package prw3.exercises.ex2;

import prw3.exercises.ex1.Customer;

public class TemplateChooser {

    public String chooseTemplate(Customer customer) {
        String customerName = customer.getName();
        String chosenTemplate = "";

        if (isManTemplate(customerName)) {
            chosenTemplate = "man";
        } else if (isWomanTemplate(customerName)) {
            chosenTemplate = "woman";
        } else if (isPrivilegedTemplate(customerName)) {
            chosenTemplate = "privileged";
        } else if (isDefaultTemplate(customerName)) {
            chosenTemplate = "default";
        }

        System.out.println("The Template for " + customerName + " is: " + chosenTemplate);
        return chosenTemplate;
    }


    private Boolean isManTemplate(String customerName) {
        if (!customerName.trim().startsWith("Mr.")) {
            return false;
        }
        return true;
    }

    private Boolean isWomanTemplate(String customerName) {
        if (!customerName.trim().startsWith("Ms.") || !customerName.trim().startsWith("Mrs.")) {
            return false;
        }
        return true;
    }

    private Boolean isPrivilegedTemplate(String customerName) {
        if (!customerName.contains("Hokopoko")) {
            return false;
        }
        return true;
    }

    private boolean isDefaultTemplate(String customerName) {
        if (isManTemplate(customerName) || isWomanTemplate(customerName) || isPrivilegedTemplate(customerName)) {
            return false;
        }
        return true;
    }

}
