public class student extends person{
	public String usn,branch;
	public student(String name,String address,String phone_no,String email_id,String role,String usn,String branch)
	{
		super(name,address,phone_no,email_id,role);
		this.usn=usn;
		this.branch=branch;
	}
	
	@Override
	public void display() {
		System.out.print("\n\tname:" + this.name + "\n\taddress:" + this.address + "\n\tphone_no:" + this.phone_no + "\n\temail:" + this.email_id + "\n\trole:" + this.role + "\n\tusn:" + this.usn + "\n\tbranch:" + this.branch);
	}
}