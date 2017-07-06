package mypackage;

import java.io.Serializable;

public class Appointment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String studentName="";
	private String studentID="";
	private String description="";
	private String sTime="";
	private String eTime="";
	private String duration="";
	private String date="";
	private String email="";
	private boolean taken=false;
	private int id=0;
	
	/*Getters to get values*/
	public boolean getTakenStatus(){
		return taken;
	}
	public String getStudentName(){
		return studentName;
	}
	public String getStudentID(){
		return studentID;
	}
	public String getDescription(){
		return description;
	}
	public String getSTime(){
		return sTime;
	}
	public String getETime(){
		return eTime;
	}
	public String getDuration(){
		return duration;
	}
	public String getDate(){
		return date;
	}
	public int getID(){
		return id;
	}
	/*Setters to set values*/
	public void setTakenStatus(boolean x){
		taken=x;
	}
	public void setStudentName(String x){
		studentName=x;
	}
	public void setStudentID(String x){
		studentID=x;
	}
	public void setDescription(String x){
		description=x;
	}
	public void setSTime(String x){
		sTime=x;
	}
	public void setETime(String x){
		eTime=x;
	}
	public void setDuration(String x){
		duration=x;
	}
	public void setDate(String x){
		date=x;
	}
	public void setID(int x){
		id=x;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
