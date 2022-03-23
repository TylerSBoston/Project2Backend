import org.junit.jupiter.api.*;

import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;



import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.*;

import com.Project2Backend.entities.RoleEntity;


@ExtendWith(MockitoExtension.class)
public class Testing {

	// only tests 1 method, others require input or interaction with the DB
	

	
	@Test
	public void TestLoginReturn()
	{
		try(MockedStatic<LoginDao> MockLogin = Mockito.mockStatic(LoginDao.class))
		{
			RoleEntity testRole = new RoleEntity();
			testRole.setRoleID(1);
			testRole.setRole("reimbursment");
			ArrayList<RoleEntity> testRoles = new ArrayList<RoleEntity>();
			testRoles.add(testRole);
			
			MockLogin.when(()-> {LoginDao.getRoles(4);}).thenReturn(testRoles);
			try {
				assertEquals(testRoles,LoginDao.getRoles(4));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
} 
