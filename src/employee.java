import java.util.Date;
import java.util.Scanner;

public class employee {
	static Scanner sc=new Scanner(System.in);
private int empId;
private String empName;
private long empPhone;
private address a1;
private String UserName;
private String Password;
public employee()
{

}
public employee(int empId, String empName, long empPhone, address a1) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empPhone = empPhone;
	this.a1 = a1;
}
public int getEmpId() {
	return empId;
}
public String getEmpName() {
	return empName;
}
public long getEmpPhone() {
	return empPhone;
}
public address getA1() {
	return a1;
}
public String getUserName() {
	return UserName;
}
public String getPassword() {
	return Password;
}

public void setUserName(String userName) {
	UserName = userName;
}
public void setPassword(String password) {
	Password = password;
}

}




