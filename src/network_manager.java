class Network_manage extends employee{
	private String Cisco_certificate;
	private int Creditial;
	employee e1;
	public Network_manage()
	{
		
	}
	public Network_manage(employee e1, String userName, String password,String cisco_certificate, int creditial) 
	{
		this.e1= e1;
		Cisco_certificate = cisco_certificate;
		Creditial = creditial;
	}
	public String getCisco_certificate() {
		return Cisco_certificate;
	}
	public int getCreditial() {
		return Creditial;
	}

	public String toString(){
		System.out.println("\n\t\t\t\t\t--------------------Network Manager "+getEmpName()+"Information ----------------------");
		System.out.println("\n\n\t\t\t\t\t\t Hello !!!!!  "+getEmpName()+" Your Detail Are -> ");
		return "\n\t\t\t\t\t\t  Id :- \t"+e1.getEmpId()+"\n\t\t\t\t\t\t  Name :-\t "+e1.getEmpName()+"\n\t\t\t\t\t\t  Contact :-\t"+e1.getEmpPhone()+"\n\t\t\t\t\t\t CISCO Certification  :- \t"+getCisco_certificate()+"\n\t\t\t\t\t\t CISCO Certification Creditals  :- \t"+getCreditial()+"\n\t\t\t\t\t\t Address :- \t"+e1.getA1()+"\n\t\t\t\t\t\t UserId  :-\t"+getUserName()+"\n\t\t\t\t\t\t PassWord :- \t*******";                                                                           
		}
	
}