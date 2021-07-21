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
	//Commit 2
	@Test
	public void checkPassword8Length()
	{
		Assert.assertEquals(true, obj.isValid("abcdefgh"));
	}
	@Test
	public void checkPasswordWithSpace()
	{
		Assert.assertEquals(false, obj.isValid("        "));
	}
}
