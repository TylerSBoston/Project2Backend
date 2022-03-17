



import POJO.Employee;
import POJO.Reimbursement;
import Service.EmployeeService;
import Service.EmployeeServiceImpl;
import Service.FinanceManagerService;
import Service.LoginService;
import io.javalin.Javalin;


public class Project2Main {
	static EmployeeService employeeService = new EmployeeServiceImpl();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javalin myServer = Javalin.create((config) -> config.enableCorsForAllOrigins()).start(4040);
		System.out.println("port 4040");
		myServer.get("/hi", ctx -> ctx.result("Hello"));
		
		
		myServer.get("/RequestsPending", (ctx)-> {
			ctx.json(FinanceManagerService.getPendingReimbursements());	
		});
		
		myServer.get("/RequestsResolved", (ctx)-> {
			ctx.json(FinanceManagerService.getCompletedReimbursements());	
			
		});
		myServer.get("/RequestsAll", (ctx)-> {
			// test
			ctx.json(FinanceManagerService.getAllReimbursements());	
			
		});
		myServer.get("/RequestsEmployee/{bid}", (ctx)-> {
			String employeeID = ctx.pathParam("bid");
			ctx.json(FinanceManagerService.getEmployeeReimbursements(Integer.parseInt(employeeID)));
			
		});
		
		myServer.get("/AllEmployeesManagerView", (ctx)-> {
			ctx.json(FinanceManagerService.getAllEmployees());
			
		});
		
		// what is the practical difference between post/put my post both inserts and updates a table.
		myServer.post("/UpdateRequest", (ctx)->{
			Reimbursement rUpdate = ctx.bodyAsClass(Reimbursement.class);
			ctx.json(FinanceManagerService.updateReimbursement(rUpdate));
		});
		

		myServer.post("/Login", (ctx)->{
			Employee e = ctx.bodyAsClass(Employee.class);
			ctx.json(LoginService.login(e));
		});
		
		myServer.get("/Roles/{bid}", (ctx)->{
			String r = ctx.pathParam("bid");
			ctx.json(LoginService.roles(r));
		});
		
		
		
		
		
		
		// all employees
		myServer.get("/AllEmployees", (ctx)->{
		ctx.json(employeeService.fetchAllEmployees());
		});
		
		//fetch employee
		myServer.get("/GetEmployee/{employee_id}", (ctx)->{
			//retrieve the path param value,specify path param key
			String empId = ctx.pathParam("employee_id");
			//tell service layer to fetch employee
			Employee fetchedEmployee = employeeService.fetchAEmployee(Integer.parseInt(empId));
			//return
			ctx.json(fetchedEmployee);
		});
		//delete an employee
		myServer.delete("/DeleteEmployees/{employee_id}", (ctx)->{
			//retrieve the path param value,specify path param key
			String empId = ctx.pathParam("employee_id");
			//tell service layer to delete
			Employee deletedEmp = employeeService.deleteEmployee(Integer.parseInt(empId));
			//return 
			ctx.json(deletedEmp);});
		
		//add a employee
		myServer.post("/AddEmployees", (ctx)->{
			//converts json to pojo
		Employee newEmp = ctx.bodyAsClass(Employee.class);
		Employee returnedEmp = employeeService.addEmployee(newEmp);
		ctx.json(returnedEmp);
		});
		
		//update a 
		
		myServer.put("/UpdateEmployees", (ctx)->{
			
		Employee newUpdate = ctx.bodyAsClass(Employee.class);
		Employee returnedUpdate = employeeService.updateEmployee(newUpdate);
		ctx.json(returnedUpdate);
		});
		
		
		
	}

}