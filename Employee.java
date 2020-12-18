package domashnoit;

	import java.util.Date;

	public class Employee extends Person{
		
		private String office;
		private double salary;
		private Date dateHired = new Date();
		
		public Employee(
				String name, 
				String adress, 
				String phoneNumber, 
				String email,
				String office,
				double salary) {
			super( name,  adress,  phoneNumber,  email);
			this.office = office;
			this.salary = salary;
			
		}

		public String getOffice() {
			return office;
		}

		public void setOffice(String office) {
			this.office = office;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Date getDate() {
			return dateHired;
		}

		public void setDate(Date dateHired) {
			this.dateHired = dateHired;
		}
		
		public String toString() {
			return super.toString() + 
					"\n" + "Office: " + office 
					+"\n" + "Salary: " + salary 
					+"\n" + "Date hired: " + dateHired.toString() ;
		}

	}
}
