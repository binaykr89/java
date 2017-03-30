package javalab;

 class banker {

	String name;
	String address;
	String phone;
	String pan;
	String aadhar;
	
	public banker(String name, String address,String phone,String pan,String aadhar){
		
		this.name=name;
		this.address=address;
		this.phone =phone;
		this.pan=pan;
		this.aadhar=aadhar;
	}
	
	void displayDetails()
	{
		System.out.println("Name : "+name+"\nAddress : "+address+"\nPhone : "+phone+"\nPan : "+pan+"\nAadhar :"+aadhar);		
	}
	
	void calcInterest()
	{
		System.out.println("\nDefault");
	}
}


class SBAccount extends banker
{
	String accNum;
	double avalBal;
	String type;
	int time;
	public SBAccount(String name, String address, String phone, String pan,
			String aadhar, String accNum,int time) {
		super(name, address, phone, pan, aadhar);
		this.accNum = accNum;
		this.type = "Savings";
		this.time=time;
		avalBal =20000;
		
		// TODO Auto-generated constructor stub
	}
	
	public SBAccount(String name, String address, String phone, String pan,
			String aadhar, String accNum,double avalBal,int time) {
		super(name, address, phone, pan, aadhar);
		this.accNum = accNum;
		this.type = "Savings";
		this.avalBal = avalBal;
		this.time=time;
		// TODO Auto-generated constructor stub
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("AccNum :"+ accNum+"\nAvalBal :" +avalBal+"\nType :"+type+"\n\n");
	}
	
	void calcInterest()
	{
		double sum;
		sum = ((this.avalBal*time*4)/100);
		System.out.println("\nInterest After 1 Year is :"+(sum+this.avalBal)+"\n\n");	
	}
	
}

class loanAccount extends banker
{	
		int time;
		String accNum;
		double loanAmount;
		String type;
	public loanAccount(String name, String address, String phone, String pan,
			String aadhar,String accNum,double loanAmount,int time){
		super(name, address, phone, pan, aadhar);
		this.accNum=accNum;
		this.loanAmount=loanAmount;
		this.type ="Loan Account";
		this.time=time;
		// TODO Auto-generated constructor stub
	}
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("AccNum :"+ accNum+"\nLoanBal :" +loanAmount+"\nType :"+type);
	}
	
	void calcInterest()
	{
		double loan;
		loan = ((this.loanAmount*1*10)/100);
		System.out.println("\nLoan Amount to be given After 1 Year is :"+loan);	
	}

}

public class program1
{
	public static void main(String[] args)
	{
		SBAccount stacc =new SBAccount("Akaak","Bangalore","9741203581","BA241","CAD12314","SHUBHAM08",50000,1) ;
		stacc.displayDetails();
		stacc.calcInterest();
		loanAccount loacc = new loanAccount("Singh","Bangalore","9876241321","B1314","TAD1314","SHASHI12",200000,1);
		loacc.displayDetails();
		loacc.calcInterest();
		
	}
}

