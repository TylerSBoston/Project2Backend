



import POJO.Employee;
import POJO.Reimbursement;
import Service.EmployeeService;
import Service.EmployeeServiceImpl;
import Service.FinanceManagerService;
import Service.LoginService;


public class Project2Main {
	static EmployeeService employeeService = new EmployeeServiceImpl();

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javalin myServer = Javalin.create((config) -> config.enableCorsForAllOrigins()).start(4040);
		System.out.println("port 4040");
		myServer.get("/hi", ctx -> ctx.result("Hello"));
		
		
		myServer.get("/requests-pending", (ctx)-> {
			ctx.json(FinanceManagerService.getPendingReimbursements());	
		});
		
		myServer.get("/requests-resolved", (ctx)-> {
			ctx.json(FinanceManagerService.getCompletedReimbursements());	
			
		});
		myServer.get("/requests-all", (ctx)-> {
			ctx.json(FinanceManagerService.getAllReimbursements());	
			
		});
		myServer.get("/requests-employee/{bid}", (ctx)-> {
			String employeeID = ctx.pathParam("bid");
			ctx.json(FinanceManagerService.getEmployeeReimbursements(Integer.parseInt(employeeID)));
			
		});
		
		myServer.get("/all-employees-manager-view", (ctx)-> {
			ctx.json(FinanceManagerService.getAllEmployees());
			
		});
		
		// what is the practical difference between post/put my post both inserts and updates a table.
		myServer.post("/update-request", (ctx)->{
			Reimbursement rUpdate = ctx.bodyAsClass(Reimbursement.class);
			ctx.json(FinanceManagerService.updateReimbursement(rUpdate));
		});
		

		myServer.post("/login", (ctx)->{
			Employee e = ctx.bodyAsClass(Employee.class);
			ctx.json(LoginService.login(e));
		});
		
		myServer.get("/roles/{bid}", (ctx)->{
			String r = ctx.pathParam("bid");
			ctx.json(LoginService.roles(r));
		});
		
		
		
		
		
		
		// all employees
		myServer.get("/all-employees", (ctx)->{
		ctx.json(employeeService.fetchAllEmployees());
		});
		
		//fetch employee
		myServer.get("/get-employee/{employee_id}", (ctx)->{
			//retrieve the path param value,specify path param key
			String empId = ctx.pathParam("employee_id");
			//tell service layer to fetch employee
			Employee fetchedEmployee = employeeService.fetchAEmployee(Integer.parseInt(empId));
			//return
			ctx.json(fetchedEmployee);
		});
		//delete an employee
		myServer.delete("/delete-employees/{employee_id}", (ctx)->{
			//retrieve the path param value,specify path param key
			String empId = ctx.pathParam("employee_id");
			//tell service layer to delete
			Employee deletedEmp = employeeService.deleteEmployee(Integer.parseInt(empId));
			//return 
			ctx.json(deletedEmp);});
		
		//add a employee
		myServer.post("/add-employees", (ctx)->{
			//converts json to pojo
		Employee newEmp = ctx.bodyAsClass(Employee.class);
		Employee returnedEmp = employeeService.addEmployee(newEmp);
		ctx.json(returnedEmp);
		});
		
		//update a 
		
		myServer.put("/update-employees", (ctx)->{
			
		Employee newUpdate = ctx.bodyAsClass(Employee.class);
		Employee returnedUpdate = employeeService.updateEmployee(newUpdate);
		ctx.json(returnedUpdate);
		});
		
		
		
	} */

}