package domashnoit;

public class Tuition {



	public static void main(String[] args) {
		
		double initialTuition = 10000;
		double percentIncrease = 0.06;
		
		double futureTuition = initialTuition;
		for(int i = 0; i < 10; i++) {
			futureTuition += futureTuition * percentIncrease;
		}
		double entireTuition = 0;
		for(int i = 0; i < 4; i++) {
			entireTuition += futureTuition;
			futureTuition += futureTuition * percentIncrease;
		}
		System.out.println("A four year study in 10 years will cost " + entireTuition + " .");
	}

}