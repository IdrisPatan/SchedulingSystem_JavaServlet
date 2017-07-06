package mypackage;

import java.io.Serializable;
import java.util.ArrayList;

public class TimeSlot implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String date="";
	private String sTime="";
	private String eTime="";
	private String type="";
	private String duration="";
	private ArrayList<Appointment> appointments=new ArrayList<Appointment>();
	private int id=0;
	private String advisor="";
	
	public String getDate(){
		return date;
	}
	public String getSTime(){
		return sTime;
	}
	public String getETime(){
		return eTime;
	}
	public String getType(){
		return type;
	}
	public String getDuration(){
		return duration;
	}	
	public ArrayList<Appointment> getAppts(){
		return appointments;
	}
	public int getID(){
		return id;
	}
	
	public void setDate(String d){
		date=d;
	}
	public void setSTime(String st){
		sTime=st;
	}
	public void setETime(String et){
		eTime=et;
	}
	public void setType(String t){
		type=t;
	}
	public void setDuration(String dur){
		duration=dur;
	}
	public void addAppt(Appointment a){
		appointments.add(a);
		
	}
	public void setAppts(ArrayList<Appointment> x){
		appointments=x;
	}
	public void setID(int x){
		id=x;
	}
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	
}