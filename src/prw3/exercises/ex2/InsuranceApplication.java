package prw3.exercises.ex2;

import prw3.exercises.ex1.Customer;

public class InsuranceApplication {
    public static void main(String[] args) {
        TemplateChooser templateChooser = new TemplateChooser();
        Customer jones = new Customer("Mr. Jones", "business");
        Customer smith = new Customer("Mrs. Smith", "economic");
        Customer hokopoko = new Customer("Mr. Hokopoko", "business");

        templateChooser.chooseTemplate(jones);
        templateChooser.chooseTemplate(smith);
        templateChooser.chooseTemplate(hokopoko);

    }
}
