package userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelab.userregistration.InvalidUserInputException;
import com.bridgelab.userregistration.UserRegistration;

public class UserRegistrationTest {
	@Test
	public void givenFirstName_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		try {
			boolean result = userRegistrationRegEx.firstNameValidate.userEntries("Naveed");
			Assert.assertTrue(result);
		} catch (InvalidUserInputException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		try {
			boolean result = userRegistrationRegEx.firstNameValidate.userEntries("N");
			Assert.assertFalse(result);
		} catch (InvalidUserInputException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		try {
			boolean result = userRegistrationRegEx.lastNameValidate.userEntries("Pathan");
			Assert.assertTrue(result);
		} catch (InvalidUserInputException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenLastName_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		try {
			boolean result = userRegistrationRegEx.lastNameValidate.userEntries("npk");
			Assert.assertFalse(result);
		} catch (InvalidUserInputException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenEmail_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		try {
			boolean result = userRegistrationRegEx.emailValidate.userEntries("abc.xyz@bl.co.in");
			Assert.assertTrue(result);
		} catch (InvalidUserInputException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenEmail_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		try {
			boolean result = userRegistrationRegEx.emailValidate.userEntries("abc.xyz@bl.in");
			Assert.assertFalse(result);
		} catch (InvalidUserInputException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPhone_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		try {
			boolean result = userRegistrationRegEx.phoneNumberValidate.userEntries("91 8867866123");
			Assert.assertTrue(result);
		} catch (InvalidUserInputException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPhone_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		try {
			boolean result = userRegistrationRegEx.phoneNumberValidate.userEntries("918867866123");
			Assert.assertFalse(result);
		} catch (InvalidUserInputException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPassword_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		try {
			boolean result = userRegistrationRegEx.passwordValidate.userEntries("Abc12345#");
			Assert.assertTrue(result);
		} catch (InvalidUserInputException e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenPassword_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		try {
			boolean result = userRegistrationRegEx.passwordValidate.userEntries("Jhjsh23#%");
			Assert.assertFalse(result);
		} catch (InvalidUserInputException e) {
			System.out.println(e);
		}
	}
}