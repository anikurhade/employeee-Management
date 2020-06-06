class FrontEnd_developer extends employee{
	private String proj;
	private String lang_special;
	public FrontEnd_developer(int empId, String empName, long empPhone, address a1, String userName, String password,
			String proj, String lang_special) {
		super(empId, empName, empPhone, a1);
		this.proj = proj;
		this.lang_special = lang_special;
	}
	public String getProj() {
		return proj;
	}
	public String getLang_special() {
		return lang_special;
	}
	public String toString(){
		System.out.println("\n\t\t\t\t\t--------------------Front End Developer"+getEmpName()+"Information ----------------------");
		System.out.println("\n\n\t\t\t\t\t\t Hello !!!!!  "+getEmpName()+" Your Detail Are -> ");
		return "\n\t\t\t\t\t\t  Id :- \t"+getEmpId()+"\n\t\t\t\t\t\t  Name :-\t "+getEmpName()+"\n\t\t\t\t\t\t  Contact :-\t"+getEmpPhone()+"\n\t\t\t\t\t\t Specialitation Language :- \t"+getLang_special()+"\n\t\t\t\t\t\t Project Done  :- \t"+getProj()+"\n\t\t\t\t\t\t Address :- \t"+getA1()+"\n\t\t\t\t\t\t UserId  :-\t"+getUserName()+"\n\t\t\t\t\t\t PassWord :- \t******";                                                                           
		}
}