class hr extends employee{
	private String Department;
	private String Join_date;
	public hr(int empId, String empName, long empPhone, address a1, String userName, String password, String department,
			String join_date) {
		super(empId, empName, empPhone, a1);
		Department = department;
		Join_date = join_date;
	}
	public String getDepartment() {
		return Department;
	}
	public String getJoin_date() {
		return Join_date;
	}
	public String toString(){
	System.out.println("\n\t\t\t\t\t--------------------Head Representative Information ----------------------");
	return "\n\t\t\t\t\t\t  Id :- \t"+getEmpId()+"\n\t\t\t\t\t\t  Name :-\t "+getEmpName()+"\n\t\t\t\t\t\t  Contact :-\t"+getEmpPhone()+"\n\t\t\t\t\t\t Department :- \t"+getDepartment()+"\n\t\t\t\t\t\t Joining Date :-\t"+getJoin_date()+"\n\t\t\t\t\t\t Address :- \t"+getA1()+"\n\t\t\t\t\t\t UserId  :-\t"+getUserName()+"\n\t\t\t\t\t\t PassWord :- \t******";                                                                           
	}
}