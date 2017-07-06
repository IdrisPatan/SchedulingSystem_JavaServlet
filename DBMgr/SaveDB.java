package mypackage.DBMgr;
import java.io.Serializable;
import java.util.ArrayList;

import mypackage.Profile;
import mypackage.TimeSlot;
public class SaveDB implements Serializable{
	private static final long serialVersionUID = 1L;
	public int idTS=0;
	public int idAppts=0;
	public ArrayList<TimeSlot> Slots=new ArrayList<TimeSlot>();
	public ArrayList<Profile> Profiles=new ArrayList<Profile>();
	
}
