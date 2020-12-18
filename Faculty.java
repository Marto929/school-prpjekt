package domashnoit;


	import java.util.Date;

	public class Faculty extends Employee{
		private String officeHours;
		private String rank;
		
		public Faculty(
				String name, 
				String adress, 
				String phoneNumber, 
				String email,
				String office,
				double salary,
				String officeHours,
				String rank) {
			super(name, 
				adress, 
				phoneNumber, 
				email,
				office,
				salary);
			this.officeHours = officeHours;
			this.rank = rank;
		}
		
		public String getOfficeHours() {
			return officeHours;
		}
		public void setOfficeHours(String officeHours) {
			this.officeHours = officeHours;
		}
		public String getRank() {
			return rank;
		}
		public void setRank(String rank) {
			this.rank = rank;
		}
		
		public String toString() {
			return super.toString() +
					"\n" + "Office hours: " + officeHours +
					"\n" + "Rank: " + rank;
		}
}
