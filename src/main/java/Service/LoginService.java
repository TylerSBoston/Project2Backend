package Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import DAO.LoginDao;
import POJO.Employee;

public class LoginService {
	private final static Logger log = LogManager.getLogger(LoginService.class);
	public static Employee login(Employee e) {
		// TODO Auto-generated method stub
		try {
			Employee loggedIn = LoginDao.login(e);
	//		loggedIn.setRoles(LoginDao.getRoles(loggedIn.getEmployeeID()));
			
			
			return loggedIn;
		}
		catch(Exception ex)
		{
			log.warn("attempted to get user that doesnt exist" + ex.getMessage());
			// getto postman test
			e.setEmail(ex.getMessage());
			return e;
		}
	}
	public static Object roles(String r) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
