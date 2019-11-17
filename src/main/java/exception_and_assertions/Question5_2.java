package exception_and_assertions;

import javax.security.auth.login.AccountException;
import javax.security.auth.login.AccountNotFoundException;
import javax.security.auth.login.LoginException;

public class Question5_2 {
	
	public static void main(String[] args) {
		try {
			LoginException le = new AccountNotFoundException();
			throw (Exception) le;
		} catch (AccountNotFoundException anfe) {
			/*
			when looking for a catch handler,
			the Java runtime looks for the exact handler based on the dynamic type of the object
			 */
			System.out.println("In the handler of AccountNotFoundException");
		} catch (AccountException ae) {
			System.out.println("In the handler of AccountException");
		} catch (LoginException le) {
			System.out.println("In the handler of LoginException");
		} catch (Exception e) {
			System.out.println("In the handler of Exception");
		}
	}
	
}
