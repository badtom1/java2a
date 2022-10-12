public class staff extends person{
	public String company,empid,designation;
	public staff(String name,String address,String phone_no,String email_id,String role,String company,String empid,String designation)
	{
		super(name,address,phone_no,email_id,role);
		this.company=company;
		this.empid=empid;
	 	this.designation=designation;
	}
	
	@Override
	public void display() {
		System.out.print("\n\tname:" + this.name + "\n\taddress:" + this.address + "\n\tphone_no:" + this.phone_no + "\n\temail:" + this.email_id + "\n\trole:" + this.role + "\n\tcompany:" + this.company + "\n\tempid:" + this.empid + "\n\tdesignation:" + this.designation);
	}
}
