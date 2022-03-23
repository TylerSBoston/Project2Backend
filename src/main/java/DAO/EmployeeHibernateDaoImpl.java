package DAO;

import java.util.ArrayList;


import java.util.List;

import javax.persistence.Query;


import org.hibernate.Session;
import org.hibernate.Transaction;

import Entities.EmployeeEntity;
import Entities.ReimbursementEntity;
import POJO.Employee;
import POJO.Reimbursement;
import exceptions.ReimbursementNotFoundException;
import exceptions.SystemException;

public class EmployeeHibernateDaoImpl implements EmployeeDao {

	@Override
	public List<Reimbursement> fetchAllReimbursements() throws SystemException, ReimbursementNotFoundException {
		List<Reimbursement> allReimbursements = new ArrayList<Reimbursement>();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("FROM reimbursementEntity");
		List<ReimbursementEntity> allReimbursementsEntity = query.getResultList();
		//copying collection of entity into collection of pojo
		for(ReimbursementEntity reimbursementEntity: allReimbursementsEntity) {
			Reimbursement riembursement = new Reimbursement(
					reimbursementEntity.getEmployeeId(),
					reimbursementEntity.getStatustId(),
					reimbursementEntity.getTypeId(),
					reimbursementEntity.getDateOfTransaction(),
					reimbursementEntity.getAmount(),
					reimbursementEntity.getDetails(),
					reimbursementEntity.getMerchant()
					
					);
					
				
			allReimbursements.add(riembursement);
		}
		return allReimbursements;
	}

	@Override
	public Reimbursement submitRequest(Reimbursement reimbursement) throws SystemException {
		//copy pojo into entity
		ReimbursementEntity reimbursementEntity = new ReimbursementEntity(
				reimbursement.getReimbursementId(),
				reimbursement.getEmployeeId(),
				reimbursement.getStatusId(),
				reimbursement.getTypeId(),
				reimbursement.getDateOfTransaction(),
				reimbursement.getAmount(),
				reimbursement.getDetails(),
				reimbursement.getMerchant());
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(reimbursementEntity);
		session.flush();
		System.out.println(reimbursementEntity);
		transaction.commit();	
		
		reimbursement.setEmployeeId(reimbursementEntity.getEmployeeId());
		return reimbursement;
	}

	@Override
	public Reimbursement updateReimbursement(Reimbursement reimbursement) throws SystemException {
		//copy pojo into entity
		ReimbursementEntity reimbursementEntity = new ReimbursementEntity(
				reimbursement.getReimbursementId(),
				reimbursement.getEmployeeId(),
				reimbursement.getStatusId(),
				reimbursement.getTypeId(),
				reimbursement.getDateOfTransaction(),
				reimbursement.getAmount(),
				reimbursement.getDetails(),
				reimbursement.getMerchant());
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(reimbursementEntity);
		System.out.println(reimbursementEntity);
		transaction.commit();	
		
		return reimbursement;
	}
	
	@Override
	public Employee updateEmployee(Employee employee) throws SystemException {
		EmployeeEntity employeeEntity = new EmployeeEntity(
				employee.getEmployeeId(),
				employee.getFirstName(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getPhone(),
				employee.getUserName(),
				employee.getPassword());
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(employeeEntity);
		System.out.println(employeeEntity);
		transaction.commit();
		
		return employee;
	}

//	@Override
//	public reimbursement deleteEmployee(int bookId) throws SystemException {
//		
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction transaction = session.beginTransaction();
//		reimbursementEntity reimbursementEntity = session.find(reimbursementEntity.class, bookId);
//		session.delete(reimbursementEntity);
//		System.out.println(reimbursementEntity);
//		transaction.commit();	
//		
//		reimbursement reimbursement = new reimbursement(reimbursementEntity.getBookId(), reimbursementEntity.getBookTitle(), reimbursementEntity.getBookAuthor(), reimbursementEntity.getBookGenre(), reimbursementEntity.getBookCost(), reimbursementEntity.getBookImageUrl());
//		return reimbursement;
//	}

	@Override
	public Reimbursement fetchARequest(int employeeId) throws SystemException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		ReimbursementEntity reimbursementEntity = session.find(ReimbursementEntity.class, employeeId);
		//copying entity into pojo
		Reimbursement reimbursement = new Reimbursement(
				reimbursementEntity.getEmployeeId(),
				reimbursementEntity.getStatustId(),
				reimbursementEntity.getTypeId(),
				reimbursementEntity.getDateOfTransaction(),
				reimbursementEntity.getAmount(),
				reimbursementEntity.getDetails(),
				reimbursementEntity.getMerchant()
				
				
				);
		return reimbursement;
	}

	@Override
	public void exitApplication() throws SystemException {
		// TODO Auto-generated method stub
		
	}

















}
