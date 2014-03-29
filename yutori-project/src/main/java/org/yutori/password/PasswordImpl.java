package main.java.org.yutori.password;


public class PasswordImpl implements Password {

	public static int MIN_LENGTH = 10;

	@Override
	public boolean checkio(String pass) {

		// Check null (fxxk)
		if (pass == null) {
			return false;
		}

		// Check length
		if ( pass.length() < 10 ) {
			return false;
		}

		// Check digit
		if (!pass.matches("(.*)[0-9](.*)"))  {
			return false;
		}

		// Check
		if (!pass.matches("(.*)[a-z](.*)"))  {
			return false;
		}

		// Check
		if (!pass.matches("(.*)[A-Z](.*)"))  {
			return false;
		}

		return false;
	}

}
