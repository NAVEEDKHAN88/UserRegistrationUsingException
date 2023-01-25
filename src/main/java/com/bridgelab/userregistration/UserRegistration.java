package com.bridgelab.userregistration;

import java.util.regex.Pattern;

/**
 * Validating first name, last name, email-id, phone number & Password.
 */

public class UserRegistration {
	private static final String NAME = "[A-Z][a-z]{2,}";
	private static final String EMAIL = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
	private static final String PHONE_NUMBER = "^[\\d]{2}[\\s][\\d]{10}$";
	private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

	public UserRegistrationInterface firstNameValidate = new UserRegistrationInterface() {
		public boolean userEntries(String fName) throws InvalidUserInputException {
			boolean result = Pattern.matches(NAME, fName);
			if (result) {
				return result;
			} else {
				throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_FIRST_NAME,
						"Invalid Firsrt Name");
			}
		}
	};

	public UserRegistrationInterface lastNameValidate = new UserRegistrationInterface() {
		public boolean userEntries(String lName) throws InvalidUserInputException {
			boolean result = Pattern.matches(NAME, lName);
			if (result) {
				return result;
			} else {
				throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_LAST_NAME,
						"Invalid Last Name");
			}
		}
	};

	public UserRegistrationInterface emailValidate = new UserRegistrationInterface() {
		public boolean userEntries(String email) throws InvalidUserInputException {
			boolean result = Pattern.matches(EMAIL, email);
			if (result) {
				return result;
			} else {
				throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_EMAIL, "Invalid Email");
			}
		}
	};

	public UserRegistrationInterface phoneNumberValidate = new UserRegistrationInterface() {
		public boolean userEntries(String phNum) throws InvalidUserInputException {
			boolean result = Pattern.matches(PHONE_NUMBER, phNum);
			if (result) {
				return result;
			} else {
				throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PHONE_NUMBER,
						"Invalid Phone Number");
			}
		}
	};

	public UserRegistrationInterface passwordValidate = new UserRegistrationInterface() {
		public boolean userEntries(String pw) throws InvalidUserInputException {
			boolean result = Pattern.matches(PASSWORD, pw);
			if (result) {
				return result;
			} else {
				throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PASSWORD,
						"Invalid Password");
			}
		}
	};
}