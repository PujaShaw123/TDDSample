package main;

public class CheckPassword {
	public boolean isValid(String password)
    {
  
        // for checking if password length
        // is between 8 and 15
        if (!((password.length() >= 8)
              && (password.length() <= 15))) {
            return false;
        }
        if (password.contains(" ")) {
            return false;
        }

	return true;
    }
}
