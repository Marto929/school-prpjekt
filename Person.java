package domashnoit;

	public class Person {

	

	private String name;
	private String adress;
	private String phoneNumber;
	private String email;
	
	public Person(String name, String adress, String phoneNumber, String email){
		this.name = name;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return  "Name: " + name + "\n" +
				"Adress: " + adress + "\n" +
				"Phone Number: " + phoneNumber + "\n" +
				"Email: " + email;
	
	}
	
	

}