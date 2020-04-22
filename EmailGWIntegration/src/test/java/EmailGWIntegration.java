import com.End;
import com.controllers.CustomerController;
import com.gateway.EmailGatewayStub;
import com.repository.Repository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmailGWIntegration {
    @AfterAll
    static void afterAll() {
        new End();
    }

    @Test
    void sendSpecialGreetings() {
        Repository repository = new Repository();
        EmailGatewayStub iEmailGateway = new EmailGatewayStub();
        CustomerController customerController = new CustomerController(repository, iEmailGateway);
        customerController.createCustomer("Angelico", "mail_test@test.mail.com", "Odense");
        Assertions.assertEquals("Angelico", repository
                .getCustomerByEmail("mail_test@test.mail.com").getName());
        Assertions.assertEquals("mail_test@test.mail.com", repository
                .getCustomerByEmail("mail_test@test.mail.com").getEmail());
        Assertions.assertEquals("Odense", repository
                .getCustomerByEmail("mail_test@test.mail.com").getCity());
        Assertions.assertEquals(EmailGatewayStub.getSentEmails(), 1);
        Assertions.assertTrue(EmailGatewayStub.getMessagesSent().get(0).contains(repository
                .getCustomerByEmail("mail_test@test.mail.com").getName()));
    }
}
