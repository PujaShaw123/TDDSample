package main;

import java.util.regex.Pattern;

public class Password {
	private String password;

	public Password(String password) {
		super();
		this.password = password;
	}

	public boolean isValid() {
		String patterns[] = { "[!|@|#|$|^]", "^.{8,15}$", "[0-9]", "[A-Z]", "[a-z]", "\\S" };
		for (String pattern : patterns) {
			Pattern matcher = Pattern.compile(pattern);
			if (!matcher.matcher(password).find())
				return false;
		}

		return true;
	}
}
