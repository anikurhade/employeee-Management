import java.util.Date;
import java.util.Scanner;
import java.io.Console;
public class main {
	 static int count =0;
		static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int ch=0;
		 int empId;
		 String empName;
		 long empPhone;
		 String UserName;
		 String Password ;
		 String Landmark;
		 String City;
		 String State;
		 int pinCode;
		 String[] user=new String[5]; 
		 String[] pass=new String[5];
		 int x=0,y=0;
	
		System.out.println("\n\n\t\t\t\t\t ------------------------------------------------------");
		System.out.println("\t\t\t\t\t |                                                    |");
		System.out.println("\t\t\t\t\t |\t\t    Welcome To DataHealer \t      |");
		System.out.println("\t\t\t\t\t |                                                    |");
		System.out.println("\t\t\t\t\t ------------------------------------------------------");
		do {
		
		System.out.println("\n\n\t\t\t\t\t -----------------** Have Choice **-------------------");
		System.out.println("\t\t\t\t\t\t\t 1.New Employee.");
		System.out.println("\t\t\t\t\t\t\t 2.Login.");
		System.out.println("\t\t\t\t\t\t\t 3.Admin Login.");
		System.out.println("\t\t\t\t\t\t\t 4.Exit.");
		System.out.println("\t\t\t\t\t ----------------------------------------------------");
		System.out.print("\t\t\t\t\t\t\t Choice :-\t ");ch=sc.nextInt();
		
		System.out.println("\t\t\t\t\t ----------------------------------------------------");
		switch(ch)
		{

		    //----------------------------------- New Registration -------------------------------
			case 1:
			{  int nch=0,cho=0;
				System.out.println("\n\n\n\n\n\n\n\t\t\t\t\t ======================================================");
				System.out.println("\t\t\t\t\t---------------****** New Employee !!!****---------------------");
				System.out.println("\n\t\t\t\t\t\t\t\t ( Creating Your Login !!!)");
				System.out.println("\n\t\t\t\t\t\t\t\t ( Please Enter Your Details ->)");
				System.out.println("\t\t\t\t\t ----------------------------------------------------");
				System.out.println("\n\n\t\t\t\t\t *  Which Of The Following Is Your Department ");
				System.out.println("\t\t\t\t\t\t\t 1.Head Representative.");
				System.out.println("\t\t\t\t\t\t\t 2.Consultant.");
				System.out.println("\t\t\t\t\t\t\t 3.DataBase Designer.");
				System.out.println("\t\t\t\t\t\t\t 4.Full StackDeveloper.");
				System.out.println("\t\t\t\t\t\t\t 5.Network Manager.");
				System.out.println("\t\t\t\t\t\t\t 6.Tester .");
				System.out.println("\t\t\t\t\t\t\t 7.FrontEnd Developer.");
				System.out.print("\t\t\t\t\t\t\t Choice :-\t ");nch=sc.nextInt();
				switch(nch)
				{

				//----------------------------------- Hr Employee -------------------------------
				case 1 :
						{  do {
							
							System.out.println("\t\t\t\t\t ------------------ Login Details -----------------");
							System.out.print("\n\t\t\t\t\t *  Create UserId  :- ");
							UserName=sc.next();
							user [x]=UserName;
							x++;
							System.out.println("\t\t\t\t\t ----------------------------------------------------");
							System.out.print("\n\t\t\t\t\t *  Create PassWord  :- ");
							Password=sc.next();
							pass [y]=Password;
							y++;
							System.out.println("\t\t\t\t\t ----------------------------------------------------");
							System.out.println("\t\t\t\t\t ------------------ Other  Details -----------------");
							System.out.print("\n\t\t\t\t\t *  Enter Your Department  :- ");
							String Dept=sc.next();
							System.out.println("\t\t\t\t\t ----------------------------------------------------");
							System.out.print("\n\t\t\t\t\t *  Enter Your Joining Date (dd/mm/yyyy)  :- ");
							String d = sc.next();
							//hr h1=new hr(empId, empName, empPhone, a1, UserName, Password, Dept, d);
							System.out.println("\t\t\t\t\t ----------------------------------------------------");
							System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
						//	System.out.println(h1);
							System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
							System.out.print("\t\t\t\t\t Press 1 To Confirm \n\t\t\t\t\t Press 2 To Refill-Up :-");
							cho=sc.nextInt();
							if(cho==1)
							{
								count++;
							}
						}while(cho!=1);
							System.out.println("\t\t\t\t\t ----------------------------------------------------");
							System.out.println("\t\t\t\t\t ---------------------Thank You ---------------------");
							System.out.println("\t\t\t\t\t ----------------------------------------------------");
					     	break ;
							//case 1 ends
						}
						//----------------------------------- Consultant Employee -------------------------------
						case 2 :
								{  do {
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\n\t\t\t\t\t *  Enter Your Offer Letter Id  :- ");
									empId=sc.nextInt();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Name  :- ");
									empName=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Contact Id  :- ");
									empPhone=sc.nextLong();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Address Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Enter Landmark  :- ");
									Landmark=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter City  :- ");
									City=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter State  :- ");
									State=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Pincode  :- ");
									pinCode=sc.nextInt();
									address a1=new address(Landmark, City, State, pinCode);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Login Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Create UserId  :- ");
									UserName=sc.next();
									user [x]=UserName;
									x++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Create PassWord  :- ");
									Password=sc.next();
									pass [y]=Password;
									y++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Other  Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Department  :- ");
									String Dept=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Last Workplace  :- ");
									String place = sc.next();
									constult c1=new constult(empId, empName, empPhone, a1, UserName, Password, Dept, place);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									System.out.println(c1);
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									System.out.print("\t\t\t\t\t Press 1 To Confirm \n\t\t\t\t\t Press 2 To Refill-Up :-");
									cho=sc.nextInt();
									if(cho==1)
									{
										count++;
									}
								}while(cho!=1);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ---------------------Thank You ---------------------");
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
							     	break ;
									//case 2 ends
								}	
								//----------------------------------- DB Designer -------------------------------
						case 3 :
								{  do {
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\n\t\t\t\t\t *  Enter Your Offer Letter Id  :- ");
									empId=sc.nextInt();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Name  :- ");
									empName=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Contact Id  :- ");
									empPhone=sc.nextLong();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Address Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Enter Landmark  :- ");
									Landmark=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter City  :- ");
									City=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter State  :- ");
									State=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Pincode  :- ");
									pinCode=sc.nextInt();
									address a1=new address(Landmark, City, State, pinCode);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Login Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Create UserId  :- ");
									UserName=sc.next();
									user [x]=UserName;
									x++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Create PassWord  :- ");
									Password=sc.next();
									pass [y]=Password;
									y++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Other  Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Specialization In Database  :- ");
									String special=sc.next();
									DB_designer d1=new DB_designer(empId, empName, empPhone, a1, UserName, Password, special);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									System.out.println(d1);
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									System.out.print("\t\t\t\t\t Press 1 To Confirm \n\t\t\t\t\t Press 2 To Refill-Up :-");
									cho=sc.nextInt();
									if(cho==1)
									{
										count++;
									}
								}while(cho!=1);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ---------------------Thank You ---------------------");
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
							     	break ;
									//case 3 ends
								}	
								//----------------------------------- Full Stack Developer -------------------------------
						case 4 :
								{  do {
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\n\t\t\t\t\t *  Enter Your Offer Letter Id  :- ");
									empId=sc.nextInt();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Name  :- ");
									empName=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Contact Id  :- ");
									empPhone=sc.nextLong();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Address Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Enter Landmark  :- ");
									Landmark=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter City  :- ");
									City=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter State  :- ");
									State=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Pincode  :- ");
									pinCode=sc.nextInt();
									address a1=new address(Landmark, City, State, pinCode);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Login Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Create UserId  :- ");
									UserName=sc.next();
									user [x]=UserName;
									x++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Create PassWord  :- ");
									Password=sc.next();
									pass [y]=Password;
									y++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Other  Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Enter The Specialization  Language  :- ");
									String special=sc.next();
									FullStack_Developer f1=new FullStack_Developer(empId, empName, empPhone, a1, UserName, Password, special);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									System.out.println(f1);
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									System.out.print("\t\t\t\t\t Press 1 To Confirm \n\t\t\t\t\t Press 2 To Refill-Up :-");
									cho=sc.nextInt();
									if(cho==1)
									{
										count++;
									}
								}while(cho!=1);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ---------------------Thank You ---------------------");
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
							     	break ;
									//case 4 ends
								}
								//----------------------------------- Network Management -------------------------------
						case 5 :
								{  do {
									employee e1=accept_employee();
									
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Login Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Create UserId  :- ");
									UserName=sc.next();
									user [x]=UserName;
									x++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Create PassWord  :- ");
									Password=sc.next();
									pass [y]=Password;
									y++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Other  Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Do You Have CISCO Certification :- ");
									String b1=sc.next();
									int credit;
									if(b1=="yes")
									{
										System.out.print("\n\t\t\t\t\t *  Enter Certification Credintials :- ");
										credit=sc.nextInt();
									}
									else
									{
										credit=0000;
									}
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									Network_manage n1=new Network_manage(e1, UserName, Password, b1, credit);
									System.out.println(n1);
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									System.out.print("\t\t\t\t\t Press 1 To Confirm \n\t\t\t\t\t Press 2 To Refill-Up :-");
									cho=sc.nextInt();
									if(cho==1)
									{
										count++;
									}
								}while(cho!=1);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ---------------------Thank You ---------------------");
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
							     	break ;
									//case 5 ends
								}
								//----------------------------------- Tester -------------------------------
						case 6 :
								{  do {
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\n\t\t\t\t\t *  Enter Your Offer Letter Id  :- ");
									empId=sc.nextInt();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Name  :- ");
									empName=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Contact Id  :- ");
									empPhone=sc.nextLong();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Address Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Enter Landmark  :- ");
									Landmark=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter City  :- ");
									City=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter State  :- ");
									State=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Pincode  :- ");
									pinCode=sc.nextInt();
									address a1=new address(Landmark, City, State, pinCode);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Login Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Create UserId  :- ");
									UserName=sc.next();
									user [x]=UserName;
									x++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Create PassWord  :- ");
									Password=sc.next();
									pass [y]=Password;
									y++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Other  Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Testing Title :- ");
									String test=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Total Testing    :- ");
									int numtest=sc.nextInt();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									Tester t1=new Tester(empId, empName, empPhone, a1, UserName, Password, test, numtest);
									System.out.println(t1);
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									System.out.print("\t\t\t\t\t Press 1 To Confirm \n\t\t\t\t\t Press 2 To Refill-Up :-");
									cho=sc.nextInt();
									if(cho==1)
									{
										count++;
									}
								}while(cho!=1);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ---------------------Thank You ---------------------");
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
							     	break ;
									//case 6 ends
								}
								//----------------------------------- FrontEnd Developers -------------------------------
						case 7 :
								{  do {
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\n\t\t\t\t\t *  Enter Your Offer Letter Id  :- ");
									empId=sc.nextInt();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Name  :- ");
									empName=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Your Contact Id  :- ");
									empPhone=sc.nextLong();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Address Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Enter Landmark  :- ");
									Landmark=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter City  :- ");
									City=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter State  :- ");
									State=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Pincode  :- ");
									pinCode=sc.nextInt();
									address a1=new address(Landmark, City, State, pinCode);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Login Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Create UserId  :- ");
									UserName=sc.next();
									user [x]=UserName;
									x++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Create PassWord  :- ");
									Password=sc.next();
									pass [y]=Password;
									y++;
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ------------------ Other  Details -----------------");
									System.out.print("\n\t\t\t\t\t *  Enter FrontEnd Programming Language Specilaization  :- ");
									String lang=sc.next();
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.print("\n\t\t\t\t\t *  Enter Completed Project Name      :- ");
									String proj=sc.next();
									FrontEnd_developer F1=new FrontEnd_developer(empId, empName, empPhone, a1, UserName, Password, proj, lang);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									System.out.println(F1);
									System.out.println("\n\n\t\t\t\t\t ----------------------------------------------------\n\n");
									System.out.print("\t\t\t\t\t Press 1 To Confirm \n\t\t\t\t\t Press 2 To Refill-Up :-");
									cho=sc.nextInt();
									if(cho==1)
									{
										count++;
									}
								}while(cho!=1);
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
									System.out.println("\t\t\t\t\t ---------------------Thank You ---------------------");
									System.out.println("\t\t\t\t\t ----------------------------------------------------");
							     	break ;
									//case 7 ends
								}
				//case 1 switch end
				}
				
				//case 1 ends
				break;
			}
			//----------------------------------- Login -------------------------------
			case 2:
			{
				System.out.println("\n\n\n\n\n\n\t\t\t\t\t ======================================================");
				System.out.println("\t\t\t\t\t---------------****** Login  !!!****---------------------");
				System.out.println("\n\n\t\t\t\t\t\t *  Enter The UserName And PassWord ");
				int i=0,j=count;
				Console cnsl =null;
				char[] readpassword; 
				do {
					System.out.print("\n\n\t\t\t\t\t\t\t\t *  UserName :- ");
					String temp_user=sc.next();
					int k=0;
					if(temp_user.equals(user[i]))
					{
						System.out.print("\n\n\t\t\t\t\t\t\t\t *   PassWord :-");
						char a[]=sc.next().toCharArray();
						String temp_pass=new String(a);
						
						if(temp_pass.equals(pass[i]))
						{
							System.out.println("\t\t\t\t\t\t\tEmployee Verified ");
							break;
						}
						else
						{
							System.out.println("Pass Word Invalid !!");
						}
					}
						
					else
					{
						if(i>=user.length)
						{
							System.out.println(" Username Not Found!!!");
							break;
						}
						
						else
							{
								System.out.println("User Name Entered Invalid");
								i++;
							}
					}
				}while(i!=user.length);
				//case 2 ends
				break;
			}
			case 3:
			{
				//case 3 ends
				break;
			}
			case 4:
			{
				System.out.println("\n\n\t\t\t\t\t ------------------------------------------------------");
				System.out.println("\t\t\t\t\t |                                                    |");
				System.out.println("\t\t\t\t\t |\t\t       ThankYou!!!!                   |");
				System.out.println("\t\t\t\t\t |                   Made By Anirudha                 |");
				System.out.println("\t\t\t\t\t |             Under Guidance Of Rahul Sir            |");
				System.out.println("\t\t\t\t\t |              (CEO - LinkCode Tecnology)            |");
				System.out.println("\t\t\t\t\t ------------------------------------------------------");
				
				
				//case 4 ends
				break;
			}
		default:
			System.out.println("\t\t\t\t\t\t Invaild Creditials  !!!");
		//switch end
		}
		//while end
		}while(ch!=4);
  //main end
	}
public static String accept_pass()
{
	Scanner sc = new Scanner(System.in);
	int i=0;
	char passwo[]=new char[6];
	for(i=0;;)
	{
		char a=sc.next().charAt(i);
		if((a>='a'&&a<='z')||(a>='A'&&a<='Z')||(a>='0'&&a<='9'))//check if a is numeric or alphabet
	    {
				 passwo[i]=a;//stores a in pass
				 ++i;
			 System.out.println("*");
		}
		if(a=='\b'&&i>=1)//if user typed backspace
							 //i should be greater than 1.
		{
				   System.out.println("\b \b");//rub the character behind the cursor.
					  --i;
			}
	if(a=='\r')//if enter is pressed
			 {
				 passwo[i]='\0';//null means end of string.
				 break;//break the loop
			 }
	}
	String temp_pass=new String(passwo);
	return temp_pass ;
}
public static employee accept_employee() {
	System.out.println("\t\t\t\t\t ----------------------------------------------------");
	System.out.print("\n\n\t\t\t\t\t *  Enter Your Offer Letter Id  :- ");
	int empId=sc.nextInt();
	System.out.println("\t\t\t\t\t ----------------------------------------------------");
	System.out.print("\n\t\t\t\t\t *  Enter Your Name  :- ");
	String empName=sc.next();
	System.out.println("\t\t\t\t\t ----------------------------------------------------");
	System.out.print("\n\t\t\t\t\t *  Enter Your Contact Id  :- ");
	long empPhone=sc.nextLong();
	System.out.println("\t\t\t\t\t ----------------------------------------------------");
	address a1=address.getaddr();
	System.out.println("\t\t\t\t\t ----------------------------------------------------");
	employee e1=new employee(empId, empName, empPhone, a1);
	return e1;
}
//class end
}