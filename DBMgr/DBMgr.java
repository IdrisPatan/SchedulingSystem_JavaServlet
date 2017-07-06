package mypackage.DBMgr;
import java.util.ArrayList;

import mypackage.Profile;
import mypackage.TimeSlot;

public interface DBMgr {
	
	public boolean saveTS(TimeSlot t);
	public boolean saveTSs(ArrayList<TimeSlot> tss);
	public boolean saveProfiles(ArrayList<Profile> profiles);
	public boolean saveIDs(int idts,int idappts);
	public ArrayList<TimeSlot> getTimeSlots();
	public ArrayList<Profile> getProfiles();
	public int getIDts();
	public int getIDappts();
}
