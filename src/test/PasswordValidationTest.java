package test;

import org.junit.Test;

import main.CheckPassword;

import org.junit.Assert;



public class PasswordValidationTest {
	CheckPassword obj=new CheckPassword();
	@Test
	public void checkPassword0Length()
	{
		Assert.assertEquals(false, obj.isValid(""));
	}
}
