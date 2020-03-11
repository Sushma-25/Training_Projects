package com.sushma.java.fun;

public class ExploreAnanymous {
	public static void main(String[] args) {
		String password = "sushma9kj";
		validate d = new validateimpl();

		System.out.println("User Password is acceptable = " + d.validatePassport(password));
		validate tempEmpPasswordValidation = new validate() {

			@Override
			public boolean validatePassport(String password) {
				if (password.length() > 8)
					return true;
				else
					return false;
			}

		};
		System.out.println("User Password is acceptable = " + d.validatePassport(password));

		validate valid = upassword -> {
			if (upassword.length() > 10)
				return true;
			else
				return false;
		};
		System.out.println("User Password is acceptable = " + valid.validatePassport(password));

		}
}

class validateimpl implements validate {

	@Override
	public boolean validatePassport(String password) {
		if (password.length() > 6)
			return true;
		else
			return false;
	}

}
@FunctionalInterface
interface validate {
	boolean validatePassport(String password);
	
}
