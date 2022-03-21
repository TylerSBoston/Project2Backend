package Service;

import java.util.LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import DAO.FinanceManagerDao;
import Entities.EmployeeEntity;
import Entities.ReimbursementEntity;
import POJO.Employee;
import POJO.Reimbursement;

public class FinanceManagerService {

	private final static Logger log = LogManager.getLogger(FinanceManagerService.class);
	
	public static LinkedList<Reimbursement> getPendingReimbursements()
	{
		
		try {
			LinkedList<Reimbursement> reimbursements = new LinkedList<Reimbursement>();
			
			// have to do this here,should be easier with spring, trust id to spot-1 is accurate until hibernate added.
			LinkedList<EmployeeEntity> employees = FinanceManagerDao.getAllEmployees();
			
			
			for(ReimbursementEntity reimbursement : FinanceManagerDao.getPendingReimbursements())
			{
				Reimbursement input = new Reimbursement(reimbursement);
				input.setEmployee(employees.get(reimbursement.getEmployeeID()-1).getFirstName() + " " + employees.get(reimbursement.getEmployeeID()-1).getFirstName());
				
				reimbursements.add(new Reimbursement(reimbursement));
				
			}
			
			return reimbursements;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.warn(e.getMessage());
			e.printStackTrace();
			return new LinkedList<Reimbursement>();
		}
		
	}
	public static LinkedList<Reimbursement> getCompletedReimbursements()
	{
		
		try {
			LinkedList<EmployeeEntity> employees = FinanceManagerDao.getAllEmployees();
			LinkedList<Reimbursement> reimbursements = new LinkedList<Reimbursement>();
			for(ReimbursementEntity reimbursement : FinanceManagerDao.getCompletedReimbursements())
			{
				Reimbursement input = new Reimbursement(reimbursement);
				input.setEmployee(employees.get(reimbursement.getEmployeeID()-1).getFirstName() + " " + employees.get(reimbursement.getEmployeeID()-1).getFirstName());
				
				reimbursements.add(new Reimbursement(reimbursement));
			}
			
			return reimbursements;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.warn(e.getMessage());
			e.printStackTrace();
			return new LinkedList<Reimbursement>();
			
		}
		
	}
	public static LinkedList<Reimbursement> getAllReimbursements()
	{
		
		
		try {
			LinkedList<EmployeeEntity> employees = FinanceManagerDao.getAllEmployees();
			LinkedList<Reimbursement> reimbursements = new LinkedList<Reimbursement>();
			for(ReimbursementEntity reimbursement : FinanceManagerDao.getAllReimbursements())
			{
				Reimbursement input = new Reimbursement(reimbursement);
				input.setEmployee(employees.get(reimbursement.getEmployeeID()-1).getFirstName() + " " + employees.get(reimbursement.getEmployeeID()-1).getFirstName());
				
				reimbursements.add(new Reimbursement(reimbursement));
			}
			
			return reimbursements;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.warn(e.getMessage());
			e.printStackTrace();
			return new LinkedList<Reimbursement>();
		}
		
	}
	public static LinkedList<Reimbursement> getEmployeeReimbursements(int employee)
	{
		
		try {
			LinkedList<EmployeeEntity> employees = FinanceManagerDao.getAllEmployees();
			LinkedList<Reimbursement> reimbursements = new LinkedList<Reimbursement>();
			for(ReimbursementEntity reimbursement : FinanceManagerDao.getEmployeeReimbursements(employee))
			{
				Reimbursement input = new Reimbursement(reimbursement);
				input.setEmployee(employees.get(reimbursement.getEmployeeID()-1).getFirstName() + " " + employees.get(reimbursement.getEmployeeID()-1).getFirstName());
				
				reimbursements.add(new Reimbursement(reimbursement));
			}
			
			return reimbursements;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.warn(e.getMessage());
			e.printStackTrace();
			return new LinkedList<Reimbursement>();
		}
		
	}
	public static LinkedList<Employee> getAllEmployees()
	{
		
		try {
			LinkedList<Employee> employees = new LinkedList<Employee>();
			for(EmployeeEntity employee : FinanceManagerDao.getAllEmployees())
			{
				employees.add(new Employee(employee));
			}
			
			
			return employees;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.warn(e.getMessage());
			e.printStackTrace();
			return new LinkedList<Employee>();
		}
		
	}
	public static Reimbursement updateReimbursement(Reimbursement rUpdate) {
		try {
			return FinanceManagerDao.updateReimbursement(rUpdate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.warn(e.getMessage());
			e.printStackTrace();
			return new Reimbursement();
		}
	}
	
}
