class FullStack_Developer extends employee{
	private String Software_special;

	public FullStack_Developer(int empId, String empName, long empPhone, address a1, String userName, String password,
			String software_special) {
		super(empId, empName, empPhone, a1);
		Software_special = software_special;
	}

	public String getSoftware_special() {
		return Software_special;
	}
	
	public String toString(){
		System.out.println("\n\t\t\t\t\t--------------------Full Stack Developer "+getEmpName()+"Information ----------------------");
		return "\n\t\t\t\t\t\t  Id :- \t"+getEmpId()+"\n\t\t\t\t\t\t  Name :-\t "+getEmpName()+"\n\t\t\t\t\t\t  Contact :-\t"+getEmpPhone()+"\n\t\t\t\t\t\t Specialized Language :- \t"+"\n\t\t\t\t\t\t Address :- \t"+getA1()+"\n\t\t\t\t\t\t UserId  :-\t"+getUserName()+"\n\t\t\t\t\t\t PassWord :- \t*******";                                                                           
		}
		
}
