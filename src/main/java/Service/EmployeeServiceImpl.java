package Service;






import java.util.List;




import DAO.EmployeeDao;
import DAO.EmployeeHibernateDaoImpl;
import POJO.Employee;
import POJO.Reimbursement;
import exceptions.ReimbursementNotFoundException;
import exceptions.SystemException;



public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeHibernateDaoImpl();
	}

	@Override
	public List<Reimbursement> fetchAllReimbursements() throws SystemException, ReimbursementNotFoundException {
		// TODO Auto-generated method stub
		return employeeDao.fetchAllReimbursements();
	}

	@Override
	public Reimbursement submitRequest(Reimbursement reimbursement) throws SystemException {
		// TODO Auto-generated method stub
		return employeeDao.submitRequest(reimbursement);
	}

	@Override
	public Reimbursement updateReimbursement(Reimbursement reimbursement) throws SystemException {
		// TODO Auto-generated method stub
		return employeeDao.updateReimbursement(reimbursement);
	}

	
	@Override
	public Reimbursement fetchARequest(int employeeID) throws SystemException {
		// TODO Auto-generated method stub
		return employeeDao.fetchARequest(employeeID);
	}

	

	@Override
	public Employee updateEmployee(Employee employee) throws SystemException {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(employee);
	}
	
	@Override
	public void exitApplication() throws SystemException {
		// TODO Auto-generated method stub
		
	}

}
