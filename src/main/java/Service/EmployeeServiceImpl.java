package Service;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.sql.SQLException;
import java.util.List;

//import org.postgresql.util.PSQLException;

import DAO.EmployeeDao;
import POJO.Employee;
import POJO.Reimbursement;
import exceptions.ReimbursementNotFoundException;
import exceptions.SystemException;

/*public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeJdbcDao();
	}

	@Override
	public List<Employee> fetchAllEmployees() throws FileSystemException {
		// TODO Auto-generated method stub
		return employeeDao.fetchAllEmployees();
	}

	@Override
	public Employee addEmployee(Employee employee) throws FileSystemException {
		// TODO Auto-generated method stub
		return employeeDao.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws FileSystemException {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public Employee deleteEmployee(int employeeID) throws FileSystemException {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployee(employeeID);
	}

	@Override
	public Employee fetchAEmployee(int employeeID) throws FileSystemException {
		// TODO Auto-generated method stub
		return employeeDao.fetchAEmployee(employeeID);
	}

	@Override
	public List<Reimbursement> fetchAllReimbursements() throws SystemException, ReimbursementNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement submitRequest(Reimbursement reimbursement) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement fetchARequest(int employeeID) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement updateReimbursement(Reimbursement reimbursement) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void exitApplication() throws SystemException {
		// TODO Auto-generated method stub
		
	}

}*/
