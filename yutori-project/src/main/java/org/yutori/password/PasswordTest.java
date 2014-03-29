package main.java.org.yutori.password;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordTest {

	Password password = new PasswordImpl();

	/**
	 * checkio('A1213pokl') == False
	 * checkio('bAse730onE') == True
	 * checkio('asasasasasasasaas') == False
	 * checkio('QWERTYqwerty') == False
	 * checkio('123456123456') == False
	 * checkio('QwErTy911poqqqq') == True
	 */

	@Test
	public void pattern1() {

		assertFalse(password.checkio("A1213pokl"));

	}

	@Test
	public void pattern2() {

		assertTrue(!password.checkio("bAse730onE"));

	}

	@Test
	public void pattern3() {

		assertFalse(password.checkio("asasasasasasasaas"));

	}

	@Test
	public void pattern4() {

		assertFalse(password.checkio("QWERTYqwerty"));

	}

	@Test
	public void pattern5() {

		assertFalse(password.checkio("123456123456"));

	}

	@Test
	public void pattern6() {

		assertTrue(!password.checkio("QwErTy911poqqqq"));

	}

}
