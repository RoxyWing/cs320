package mod3.contactservice.cs320;

public class Contact {
	//variables for the class
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	
	//class object
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid Contact ID");
			}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
			}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
			}
		if (phoneNumber == null || phoneNumber.length()!=10) {
			throw new IllegalArgumentException("Invalid Phone Number");
			}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
			}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	//getter and setter methods
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Ivalid First Name");
		}
		this.firstName = firstName;
		}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Ivalid Last Name");
		}
		this.lastName = lastName;
		}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length()!=10) {
			throw new IllegalArgumentException("Ivalid Phone Number");
		}
		this.phoneNumber = phoneNumber;
		}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Ivalid Address");
		}
		this.address = address;
	}
}

