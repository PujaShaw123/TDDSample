package test;

import org.junit.Test;

import main.Password;

import org.junit.Assert;

public class PasswordValidationTest {

	@Test
	public void checkPassword0Length() {
		Password password = new Password("");
		Assert.assertEquals(false, password.isValid());
	}

	@Test
	public void checkPassword8Length() {
		Password password = new Password("Arcd!fh7");
		Assert.assertEquals(true, password.isValid());
	}

	@Test
	public void checkPasswordWithSpace() {
		Password password = new Password("        ");
		Assert.assertEquals(false, password.isValid());
	}

	@Test
	public void checkPasswordWithe20Length() {
		Password password = new Password("abc1eFgh7jklmnopqrst");
		Assert.assertEquals(false, password.isValid());
	}

	@Test
	public void checkPasswordWithoutSpecialCharacter() {
		Password password = new Password("ab2cdEfghi");
		Assert.assertEquals(false, password.isValid());
	}

	@Test
	public void checkPasswordWithoutDigit() {
		Password password = new Password("abc^efGhi");
		Assert.assertEquals(false, password.isValid());
	}

	@Test
	public void checkPasswordWithoutUpperCase() {
		Password password = new Password("abc^ef$hi3");
		Assert.assertEquals(false, password.isValid());
	}
	@Test
	public void checkPasswordWithoutLowerCase() {
		Password password = new Password("ABC^EF$HI3");
		Assert.assertEquals(false, password.isValid());
	}

}
