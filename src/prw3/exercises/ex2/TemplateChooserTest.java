package prw3.exercises.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import prw3.exercises.ex1.Customer;
import prw3.exercises.ex1.Screen;


class TemplateChooserTest {
    TemplateChooser templateChooser = new TemplateChooser();

    @Test
    void testManTemplate() {
        Customer mrJones = new Customer("Mr. Jones", "business");
        String mrJonesTemplate = templateChooser.chooseTemplate(mrJones);
        Assertions.assertEquals("man", mrJonesTemplate);
    }

    @Test
    void testWomanTemplate() {
        Customer mrsSmith = new Customer("Mrs. Smith", "economic");
        String mrsSmithTemplate = templateChooser.chooseTemplate(mrsSmith);
        Assertions.assertEquals("woman", mrsSmithTemplate);
    }

    @Test
    void testPrivilegedTemplate() {
        Customer mrJackson = new Customer("Mr. Jones Jackson Hokopoko", "privileged");
        String mrJacksonTemplate = templateChooser.chooseTemplate(mrJackson);
        Assertions.assertEquals("privileged", mrJacksonTemplate);
    }

    @Test
    void testDefaultTemplate() {
        Customer mrBoring = new Customer("Boring Bob", "privileged");
        String mrBoringTemplate = templateChooser.chooseTemplate(mrBoring);
        Assertions.assertEquals("default", mrBoringTemplate);
    }


}