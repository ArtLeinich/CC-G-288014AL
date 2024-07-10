package thema6.verschachtelung;

public class PasswortStaerkePruefer {

	public static void main(String[] args) {
		String[] passwoerter = { "Pass1234", "123456", "PassPass", "MeinStaerkesPasswort" };

		for (int i = 0; i < passwoerter.length; i++) {
			String passwort = passwoerter[i];
			if (isStrong(passwort)) {
				System.out.println("Das Passwort \"" + passwort + "\" ist stark.");
			} else {
				System.out.println("Das Passwort \"" + passwort + "\" ist schwach.");
			}
		}
	}

	public static boolean isStrong(String password) {
		if (password.length() < 8) {
			return false;
		}

		boolean buchstabe = false;
		boolean zahl = false;

		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isLetter(c)) {
				buchstabe = true;
			} else if (Character.isDigit(c)) {
				zahl = true;
			}

			if (buchstabe && zahl) {
				return true;
			}
		}
		return false;
	}
}
