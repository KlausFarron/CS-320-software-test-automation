package contactService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    // Test adding a valid contact
    @Test
    public void testAddContactSuccess() {
        ContactService service = new ContactService();

        service.addContact("1", "Luna", "Snow", "1234567890", "123 Main Street");

        assertEquals(1, service.getContacts().size());
        assertEquals("Luna", service.getContacts().get(0).getFirstName());
        assertEquals("Snow", service.getContacts().get(0).getLastName());
    }

    // if contactId already exists, throw an exception
    @Test
    public void testAddContactDuplicateId() {
        ContactService service = new ContactService();

        service.addContact("1", "Luna", "Snow", "1234567890", "123 Main Street");

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact("1", "Luna", "Snow", "1234567890", "123 Main Street");
        });
    }

    // Test deleting a contact that already exists
    @Test
    public void testDeleteContactSuccess() {
        ContactService service = new ContactService();

        service.addContact("1", "Luna", "Snow", "1234567890", "123 Main Street");
        service.deleteContact("1");

        assertEquals(0, service.getContacts().size());
    }

    // if deleting a contact that does not exist, throw an exception
    @Test
    public void testDeleteContactNotFound() {
        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("999");
        });
    }

    // Test updating first name on an existing contact
    @Test
    public void testUpdateFirstName() {
        ContactService service = new ContactService();

        service.addContact("1", "Luna", "Snow", "1234567890", "123 Main Street");
        service.updateFirstName("1", "Lulu");

        assertEquals("Lulu", service.getContacts().get(0).getFirstName());
    }

    // Test updating last name on an existing contact
    @Test
    public void testUpdateLastName() {
        ContactService service = new ContactService();

        service.addContact("1", "Luna", "Snow", "1234567890", "123 Main Street");
        service.updateLastName("1", "Frost");

        assertEquals("Frost", service.getContacts().get(0).getLastName());
    }

    // Test updating phone on an existing contact
    @Test
    public void testUpdatePhone() {
        ContactService service = new ContactService();

        service.addContact("1", "Luna", "Snow", "1234567890", "123 Main Street");
        service.updatePhone("1", "0987654321");

        assertEquals("0987654321", service.getContacts().get(0).getPhone());
    }

    // Test updating address on an existing contact
    @Test
    public void testUpdateAddress() {
        ContactService service = new ContactService();

        service.addContact("1", "Luna", "Snow", "1234567890", "123 Main Street");
        service.updateAddress("1", "456 Oak Avenue");

        assertEquals("456 Oak Avenue", service.getContacts().get(0).getAddress());
    }

    // if updating a contact that does not exist, throw an exception
    @Test
    public void testUpdateNonExistingContact() {
        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("999", "NoName");
        });
    }
}
