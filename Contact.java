package contactService;


/*
 * The ContactService class to manage Contact objects
 * 
 * - Stores contact ID, first name, last name, phone, and address
 * - Validates all fields based on project requirements
 * - contactId cannot be updated after creation
 * 
 */

public class Contact {

	    // Class attributes
	    private final String contactId;
	    private String firstName;
	    private String lastName;
	    private String phone;
	    private String address;

	    // Constructor with validation
	    public Contact(String contactId, String firstName, String lastName,
	                   String phone, String address) {

	        // contactId: must be non-null and no longer than 10 characters
	        if (contactId == null || contactId.length() > 10) {
	            throw new IllegalArgumentException("Invalid contact ID");
	        }

	        // firstName: must be non-null and max 10 characters
	        if (firstName == null || firstName.length() > 10) {
	            throw new IllegalArgumentException("Invalid first name");
	        }

	        // lastName: must be non-null and max 10 characters
	        if (lastName == null || lastName.length() > 10) {
	            throw new IllegalArgumentException("Invalid last name");
	        }

	        // phone: must be exactly 10 digits, and no spaces or symbols
	        if (phone == null || !phone.matches("\\d{10}")) {
	            throw new IllegalArgumentException("Invalid phone number");
	        }

	        // address: must be non-null and max 30 characters
	        if (address == null || address.length() > 30) {
	            throw new IllegalArgumentException("Invalid address");
	        }

	        // Values assigned after passing validation
	        this.contactId = contactId;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phone = phone;
	        this.address = address;
	    }

	    // Getters
	    public String getContactId() {
	        return contactId;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public String getAddress() {
	        return address;
	    }

	    // Setters
	    public void setFirstName(String firstName) {
	        if (firstName == null || firstName.length() > 10) {
	            throw new IllegalArgumentException("Invalid first name");
	        }
	        this.firstName = firstName;
	    }

	    public void setLastName(String lastName) {
	        if (lastName == null || lastName.length() > 10) {
	            throw new IllegalArgumentException("Invalid last name");
	        }
	        this.lastName = lastName;
	    }

	    public void setPhone(String phone) {
	        if (phone == null || !phone.matches("\\d{10}")) {
	            throw new IllegalArgumentException("Invalid phone number");
	        }
	        this.phone = phone;
	    }

	    public void setAddress(String address) {
	        if (address == null || address.length() > 30) {
	            throw new IllegalArgumentException("Invalid address");
	        }
	        this.address = address;
	    }

}
