package mod3.contactservice.cs320;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private Map<String, Contact> contacts = new HashMap<>();
	
	public void addContact(Contact contact) {
		if (contacts.containsKey(contact.getContactID())) {
			throw new IllegalArgumentException("Contact ID Already in Use");
		}
		contacts.put(contact.getContactID(), contact);
	}
	public void deleteContact(String contactID) {
		if(!contacts.containsKey(contactID)) {
			throw new IllegalArgumentException("Contact ID not Found");
		}
		contacts.remove(contactID);
	}
	
	public void updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address){
		Contact contact = contacts.get(contactID);
		if (contact == null){
			throw new IllegalArgumentException("Contact ID not Found");
		}
		  if (firstName == null || firstName.length() > 10) {
		        throw new IllegalArgumentException("Invalid first name");
		    } else {
		        contact.setFirstName(firstName);
		    }
		  
		  if (lastName == null || lastName.length() > 10) {
		        throw new IllegalArgumentException("Invalid last name");
		    } else {
		        contact.setLastName(lastName);
		    }
		  
		  if (phoneNumber == null || phoneNumber.length() != 10 || !phoneNumber.matches("\\d{10}")) {
		        throw new IllegalArgumentException("Invalid phone number");
		    } else {
		        contact.setPhoneNumber(phoneNumber);
		    }
		  
		  if (address == null || address.length() > 30) {
		        throw new IllegalArgumentException("Invalid address");
		    } else {
		        contact.setAddress(address);
		    }
	}
	
	public Contact getContact(String contactID) {
		return contacts.get(contactID);
	}
   }
