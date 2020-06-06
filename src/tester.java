class Tester extends employee{
	private String Type;
	private int  testing_done;
	public Tester(int empId, String empName, long empPhone, address a1, String userName, String password, String type,
			int testing_done) {
		super(empId, empName, empPhone, a1);
		Type = type;
		this.testing_done = testing_done;
	}
	public String getType() {
		return Type;
	}
	public int getTesting_done() {
		return testing_done;
	}
	public String toString(){
		System.out.println("\n\t\t\t\t\t--------------------Tester "+getEmpName()+"Information ----------------------");
		System.out.println("\n\n\t\t\t\t\t\t Hello !!!!!  "+getEmpName()+" Your Detail Are -> ");
		return "\n\t\t\t\t\t\t  Id :- \t"+getEmpId()+"\n\t\t\t\t\t\t  Name :-\t "+getEmpName()+"\n\t\t\t\t\t\t  Contact :-\t"+getEmpPhone()+"\n\t\t\t\t\t\t Tester Type :- \t"+getType()+"\n\t\t\t\t\t\t Testing done   :- \t"+getTesting_done()+"\n\t\t\t\t\t\t Address :- \t"+getA1()+"\n\t\t\t\t\t\t UserId  :-\t"+getUserName()+"\n\t\t\t\t\t\t PassWord :- \t*******";                                                                           
		}
	
}
