package Openning.Entry.Register.Userinfo;

import java.util.*;

import java.io.*; 

public class UserInfo{
	private String firstname;
	private String lastname;
	private String username;
	private String phonenumber;
	private String address;
	private String city;
	private String confirmpassword;

	private File file;
	private FileWriter fwriter;
	private Scanner scanner;
	
	public UserInfo()
	{
		
	}
	public UserInfo(String firstname, String lastname,String username,String phonenumber,String address,String city,String confirmpassword)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.phonenumber = phonenumber;
		this.address = address;
		this.city = city;
		this.confirmpassword = confirmpassword;	
	}
	public void setFirstName(String firstname) {this.firstname = firstname;}
	public void setLastName(String lastname) {this.lastname = lastname;}
	public void setUserName(String username) {this.username = username;}
	public void setPhoneNumber(String phonenumber) {this.phonenumber = phonenumber;}
	public void setAddress(String address) {this.address = address;}
	public void setCity(String city) {this.city = city;}
	public void setConfirmPassword(String confirmpassword) {this.confirmpassword = confirmpassword;}
	public String getFirstName() {return this.firstname;}
	public String getLastName() {return this.lastname;}
	public String getUserName() {return this.username;}
	public String getPhoneNumber() {return this.phonenumber;}
	public String getAddress() {return this.address;}
	public String getCity () {return this.city;}
	public String getConfirmPassword() {return confirmpassword;}
	
	public void addInfo()
	{
		try
		{
			file= new File("./Openning/Entry/Login/Privatedata.txt"); 
			file.createNewFile();
			fwriter=new FileWriter(file,true);
			fwriter.write("Name: "+getFirstName()+" ");
			fwriter.write(getLastName()+"\t"+"\n");
			fwriter.write("User Name: "+getUserName()+"\t"+"\n");
			fwriter.write("Phone Number: "+getPhoneNumber()+"\t"+"\n");
			fwriter.write("Address: "+getAddress()+"\t"+"\n");
			fwriter.write("City: "+getCity()+"\t"+"\n"); 
			fwriter.write("Password: "+getConfirmPassword()+"\n");
			fwriter.write("--------------------------------------------"+"\n"); 
			fwriter.flush(); 
			fwriter.close(); 
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	public boolean getInfo(String username,String password)
	{
		boolean flag=false;
		file= new File("./Openning/Entry/Login/Privatedata.txt");
		try{
			scanner=new Scanner(file);
			
			while(scanner.hasNextLine())
			{
				String line=scanner.nextLine();
				String[] value=line.split("\t");
				if(value[0].equals(username)&&value[1].equals(password))
				{
					flag=true;
				}
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		return flag;
	}
	
}