class constult extends employee{
private String Department;
private String Last_workplace;
public constult(int empId, String empName, long empPhone, address a1, String userName, String password,
		String department, String last_workplace) {
	super(empId, empName, empPhone, a1);
	Department = department;
	Last_workplace = last_workplace;
}
public String getDepartment() {
	return Department;
}
public String getLast_workplace() {
	return Last_workplace;
}
public String toString(){
	System.out.println("\n\t\t\t\t\t--------------------Constult Information ----------------------");
	return "\n\t\t\t\t\t\t  Id :- \t"+getEmpId()+"\n\t\t\t\t\t\t  Name :-\t "+getEmpName()+"\n\t\t\t\t\t\t  Contact :-\t"+getEmpPhone()+"\n\t\t\t\t\t\t Department :- \t"+getDepartment()+"\n\t\t\t\t\t\t Last WorkPlace :-\t"+getLast_workplace()+"\n\t\t\t\t\t\t Address :- \t"+getA1()+"\n\t\t\t\t\t\t UserId  :-\t"+getUserName()+"\n\t\t\t\t\t\t PassWord :- \t******";                                                                           
	}
	
	
}
