class DB_designer extends employee{
	private String Specialization;

	public DB_designer(int empId, String empName, long empPhone, address a1, String userName, String password,
			String specialization) {
		super(empId, empName, empPhone, a1);
		Specialization = specialization;
	}

	public String getSpecialization() {
		return Specialization;
	}
	
	public String toString(){
		System.out.println("\n\t\t\t\t\t--------------------Data Base Designer Information ----------------------");
		return "\n\t\t\t\t\t\t  Id :- \t"+getEmpId()+"\n\t\t\t\t\t\t  Name :-\t "+getEmpName()+"\n\t\t\t\t\t\t  Contact :-\t"+getEmpPhone()+"\n\t\t\t\t\t\t Specialization :- \t"+getSpecialization()+"\n\t\t\t\t\t\t Address :- \t"+getA1()+"\n\t\t\t\t\t\t UserId  :-\t"+getUserName()+"\n\t\t\t\t\t\t PassWord :- \t"+getPassword();                                                                           
		}
			
}
