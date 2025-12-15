package contactService;

import java.util.ArrayList;
import java.util.List;

/*
 * The ContactService class to manage Contact objects.
 * 
 * - Stores contacts in a list
 * - Adds new contacts with a unique contactId
 * - Deletes contacts using contactId
 * - Updates contact fields (first name, last name, phone, address) using contactId
 */

public class ContactService {

    // List to store all Contact objects in memory
    private List<Contact> contacts = new ArrayList<>();

    // Method to add a new contact
    // Ensures the contactId is unique before adding
    public void addContact(String contactId, String firstName, String lastName,
                           String phone, String address) {

        // If a contact with this ID already exists, do not add a duplicate ID
        if (findContact(contactId) != null) {
            throw new IllegalArgumentException("Contact ID already exists");
        }

        // Create a new Contact object
        Contact newContact = new Contact(contactId, firstName, lastName, phone, address);

        // Add the new Contact to the list
        contacts.add(newContact);
    }

    // Method to delete a contact by contactId
    public void deleteContact(String contactId) {

        // Find the contact in the list
        Contact contact = findContact(contactId);

        // If the contact is not found, throw an exception
        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        // Remove the matching contact from the list
        contacts.remove(contact);
    }

    // Method to update the first name for a contact with a specific contactId
    public void updateFirstName(String contactId, String newFirstName) {

        // Find the contact in the list
        Contact contact = findContact(contactId);

        // If the contact is not found, throw an exception
        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        // Update the first name
        contact.setFirstName(newFirstName);
    }

    // Method to update the last name for a contact with a specific contactId
    public void updateLastName(String contactId, String newLastName) {

        // Find the contact in the list
        Contact contact = findContact(contactId);

        // If the contact is not found, throw an exception
        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        // Update the last name
        contact.setLastName(newLastName);
    }

    // Method to update the phone number for a contact with a specific contactId
    public void updatePhone(String contactId, String newPhone) {

        // Find the contact in the list
        Contact contact = findContact(contactId);

        // If the contact is not found, throw an exception
        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        // Update the phone number
        contact.setPhone(newPhone);
    }

    // Method to update the address for a contact with a specific contactId
    public void updateAddress(String contactId, String newAddress) {

        // Find the contact in the list
        Contact contact = findContact(contactId);

        // If the contact is not found, throw an exception
        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        // Update the address
        contact.setAddress(newAddress);
    }

    // Private helper method to find a contact by ID
    // Return the Contact object if found, otherwise return null
    private Contact findContact(String contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                return contact;
            }
        }
        return null;
    }

    // Getter method to return the list of contacts
    public List<Contact> getContacts() {
        return contacts;
    }	
	
}
