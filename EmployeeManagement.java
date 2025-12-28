package employee_record_management;

import java.util.*;

class Employee{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return "ID :"+id+"  |  NAME :"+name+"    |    SALARY :"+salary;
	}
}

public class EmployeeManagement {
	
	
	private static final boolean String = false;

	static Map<Integer,Employee> empMap=new HashMap<>();
	
	static Scanner sc=new Scanner(System.in);
	
	static void addEmployee() {
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		if(empMap.containsKey(id)) {
			System.out.println("Employee Id already Exists");
		}else {
			sc.nextLine();
			System.out.println("Enter Employee Name");
			String name=sc.nextLine();
			System.out.println("Enter Employee Salary");
			double salary=sc.nextDouble();
			empMap.put(id, new Employee(id,name,salary));
			System.out.println("Employee added successfully");
		}
	}
	
	static void updateEmployee() {
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		sc.nextLine();
		if(empMap.containsKey(id)) {
			System.out.println("Enter Employee Name");
			String name=sc.nextLine();
			System.out.println("Enter Employee salary");
			double salary=sc.nextDouble();
			empMap.put(id, new Employee(id, name, salary));
			System.out.println("Employee Updated Successfully");
		}else {
			System.out.println("Employee Id not founded!..");
		}
	}
	static void deleteEmployee() {
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		if(empMap.remove(id) != null) {
			System.out.println("Employee Id deleted Successfully");
		}else {
			System.out.println("Employee Id not Found!");
		}
	}

	static void displayRecord() {
		if(empMap.isEmpty()) {
			System.out.println("No Data!");
		}else {
			for(Employee e:empMap.values()) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			System.out.println("\n...Employee Record Management...\n");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Display Employee Record");
			System.out.println("5. Exixt");
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:addEmployee();
			break;
			case 2:updateEmployee();
			break;
			case 3:deleteEmployee();
			break;
			case 4:displayRecord();
			break;
			case 5:System.out.println("Thank You");
			return;
			default :System.out.println("Invalid Choice..");
		}
	}

}
}
