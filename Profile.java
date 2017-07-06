package mypackage;

import java.io.Serializable;

public class Profile implements Serializable{
	private static final long serialVersionUID = 1L;
	public int id=0;
	public String Email="";
	public String Password="";
	public String Fname="";
	public String Lname="";
	public String Type=""; //Type 0=NO TYPE, 1=Advisor, 2=Staff, 3=Admin
	public String Dept="";
	
	public void create(String email,String pw,String fname,String lname,String type,String dept){
		Email=email;
		Password=pw;
		Fname=fname;
		Lname=lname;
		Type=type;
		Dept=dept;		
	}

}
