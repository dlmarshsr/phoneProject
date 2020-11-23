package phonebookProject;

public class Person {

	private String firstName;
	private String lastName;
	private int number;
	private String email;
	private String address;
	
	
	public Person(String firstName, String lastName, int number, String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.email = email;
		this.address = address;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", number=" + number + ", email=" + email
				+ ", address=" + address + "]";
	}

      public String [] toShow(){
    	  return new String[] {firstName,lastName,email};
      }
	
	
	
	
	
	
	
	
	
		

	}

