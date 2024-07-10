package thema7.rekursion;

public class Umkehren {

	public static void main(String[] args) {
		String original = "Hallo Piraten";
		String umgekehrt = umkehrenString(original);
		System.out.println("Der umgekehrte String ist: " + umgekehrt);
	}

	private static String umkehrenString(String str) {
		if (str.length() == 0) {
			return str;
		}
		return umkehrenString(str.substring(1)) + str.charAt(0);
	}
}
