package contactService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    // Test creating a valid Contact object
    @Test
    public void testValidContactCreation() {
        Contact contact = new Contact("12345", "Luna", "Snow",
                                      "1234567890", "123 Main Street");

        assertEquals("12345", contact.getContactId());
        assertEquals("Luna", contact.getFirstName());
        assertEquals("Snow", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    // if contactId null, throw an exception
    @Test
    public void testContactIdNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Luna", "Snow", "1234567890", "123 Main Street");
        });
    }

    // if contactId longer than 10 characters, throw an exception
    @Test
    public void testContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678900", "Luna", "Snow",
                        "1234567890", "123 Main Street");
        });
    }

    // if firstName null, throw an exception
    @Test
    public void testFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "Snow", "1234567890", "123 Main Street");
        });
    }
    
    // if firstName too long, throw an exception
    @Test
    public void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "ThisIsTooLong", "Snow",
                        "1234567890", "123 Main Street");
        });
    }

    // if lastName null, throw an exception
    @Test
    public void testLastNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Luna", null, "1234567890", "123 Main Street");
        });
    }
    
    // if lastName too long, throw an exception
    @Test
    public void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Luna", "ThisIsTooLong",
                        "1234567890", "123 Main Street");
        });
    }

    // if phone null, throw an exception
    @Test
    public void testPhoneNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Luna", "Snow", null, "123 Main Street");
        });
    }

    // if phone not exactly 10 digits, throw an exception
    @Test
    public void testPhoneNotTenDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Luna", "Snow", "12345", "123 Main Street");
        });
    }

    // if address null, throw an exception
    @Test
    public void testAddressNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Luna", "Snow", "1234567890", null);
        });
    }
    
    // if address too long should, throw an exception
    @Test
    public void testAddressTooLong() {
        String longAddress = "1234567890123456789012345678901"; // 31 characters

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Luna", "Snow",
                        "1234567890", longAddress);
        });
    }

 // Test updating first name with a valid value
    @Test
    public void testUpdateFirstNameValid() {
        Contact contact = new Contact("12345", "Luna", "Snow",
                                      "1234567890", "123 Main Street");

        contact.setFirstName("Lulu");
        assertEquals("Lulu", contact.getFirstName());
    }

    // updating firstName with null should throw an exception
    @Test
    public void testUpdateFirstNameNull() {
        Contact contact = new Contact("12345", "Luna", "Snow",
                                      "1234567890", "123 Main Street");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName(null);
        });
    }

    // Test updating last name with a valid value
    @Test
    public void testUpdateLastNameValid() {
        Contact contact = new Contact("12345", "Luna", "Snow",
                                      "1234567890", "123 Main Street");

        contact.setLastName("Frost");
        assertEquals("Frost", contact.getLastName());
    }

    // updating lastName with null should throw an exception
    @Test
    public void testUpdateLastNameNull() {
        Contact contact = new Contact("12345", "Luna", "Snow",
                                      "1234567890", "123 Main Street");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName(null);
        });
    }

    // Test updating phone with a valid value
    @Test
    public void testUpdatePhoneValid() {
        Contact contact = new Contact("12345", "Luna", "Snow",
                                      "1234567890", "123 Main Street");

        contact.setPhone("0987654321");
        assertEquals("0987654321", contact.getPhone());
    }

    // updating phone with invalid digits should throw an exception
    @Test
    public void testUpdatePhoneInvalid() {
        Contact contact = new Contact("12345", "Luna", "Snow",
                                      "1234567890", "123 Main Street");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone("abc");   // invalid phone number
        });
    }

    // updating phone with null should throw an exception
    @Test
    public void testUpdatePhoneNull() {
        Contact contact = new Contact("12345", "Luna", "Snow",
                                      "1234567890", "123 Main Street");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone(null);
        });
    }

    // Test updating address with a valid value
    @Test
    public void testUpdateAddressValid() {
        Contact contact = new Contact("12345", "Luna", "Snow",
                                      "1234567890", "123 Main Street");

        contact.setAddress("456 Oak Avenue");
        assertEquals("456 Oak Avenue", contact.getAddress());
    }

 // updating address with null should throw an exception
    @Test
    public void testUpdateAddressNull() {
        Contact contact = new Contact("12345", "Luna", "Snow",
                                      "1234567890", "123 Main Street");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress(null);
        });
    }
}
