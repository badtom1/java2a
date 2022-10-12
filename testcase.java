import java.util.Scanner;
public class testcase implements itstudent,itstaff{

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		String name,address,phone_no,email_id,role,usn,branch = null,company,empid,designation = null;
		student std = null;
		staff stf = null;
		itstudent std_f=null;
		itstaff stf_s=null;
		float t_fees=0;
		float t_sal=0;
		boolean std_flag=false;
		boolean stf_flag=false;
		char ch;
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.print("\n1.Enter Student details\n2.Enter Staff details\n3.Display Student details\n4.Display Staff details\n5.exit\nEnter your choice:");
			ch=s.next().charAt(0);
			switch(ch)
			{
			case '1':
				std_flag=true;
				System.out.print("\nEnter name : ");
				name=s.next();
				System.out.print("Enter address : ");
				address=s.next();
				System.out.print("Enter phone_no : ");
				phone_no=s.next();
				System.out.print("Enter email_id : ");
				email_id=s.next();
				role="Student";
				System.out.print("Enter usn : ");
				usn=s.next();
				System.out.print("Enter branch : ");
				branch=s.next();
				std=new student(name,address,phone_no,email_id,role,usn,branch);
				std_f=new testcase();
				t_fees=std_f.calculate_fees(branch);
				continue;
			case '2':
				stf_flag=true;
				System.out.print("\nEnter name :");
				name=s.next();
				System.out.print("Enter address :");
				address=s.next();
				System.out.print("Enter phone_no :");
				phone_no=s.next();
				System.out.print("Enter email_id :");
				email_id=s.next();
				role="Staff";
				System.out.print("Enter company :");
				company=s.next();
				System.out.print("Enter empid :");
				empid=s.next();
				System.out.print("Enter designation :");
				designation=s.next();
				stf=new staff(name,address,phone_no,email_id,role,company,empid,designation);
				stf_s=new testcase();
				t_sal=stf_s.calculate_salary(designation);
				continue;
			case '3':
				if(std_flag==true) 
				{
				System.out.print("\n\tstudent details\n");
				std.display();
				System.out.print("\n\tTotal Fees:" + t_fees + "\n");
				continue;
				}
				else
				{
					System.out.print("\nEnter student details first\n");
					continue;
				}
			case '4':
				if(stf_flag==true)
				{
				System.out.print("\n\tstaff details\n");
				stf.display();
				System.out.print("\n\tBasic Salary:" + t_sal + "\n");
				continue;
				}
				else
				{
					System.out.print("\nEnter staff details first\n");
					continue;
				}
			case '5':
				break;
			default:
				System.out.print("\ninvalid input\n");
				continue;
			}
			if (ch=='5')
			{
				s.close();
				break;
			}
		}
		
	}

	@Override
	public float calculate_fees(String branch) {
		if(branch.equalsIgnoreCase("mca")==true)
			return itstudent.mca_fees;
		else if(branch.equalsIgnoreCase("mba")==true)
			return itstudent.mba_fees;
		else if(branch.equalsIgnoreCase("mcom")==true)
			return itstudent.mcom_fees;
		else
			return itstudent.default_fees;
	}
	

	@Override
	public float calculate_salary(String designation) {
		if(designation.equalsIgnoreCase("ceo")==true)
			return itstaff.ceo_sal;
		else if(designation.equalsIgnoreCase("manager")==true)
			return itstaff.manager_sal;
		else if(designation.equalsIgnoreCase("employee")==true)
			return itstaff.employee_sal;
		else
			return itstaff.default_sal;
	}
}
