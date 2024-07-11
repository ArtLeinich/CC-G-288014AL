package thema8.oop.grundlagen;

public class AutoSpiel {

	public static void main(String[] args) {

		Auto auto1 = new Auto(1, "BMW", "X5", 2021);
		Auto auto2 = new Auto(2, "Mercedes", "F5", 2023);
		Auto auto3 = new Auto(3, "Audio", "Z5", 2024);
		
		System.out.println(auto1);
		System.out.println(auto2);
		System.out.println(auto3);
	}

}