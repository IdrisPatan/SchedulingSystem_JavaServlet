package mypackage.DBMgr;

import java.util.ArrayList;

import mypackage.Profile;
import mypackage.TimeSlot;

public class SQLImp implements DBMgr{

	@Override
	public boolean saveTS(TimeSlot t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveTSs(ArrayList<TimeSlot> tss) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveIDs(int idts, int idappts) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<TimeSlot> getTimeSlots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getIDts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIDappts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Profile> getProfiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveProfiles(ArrayList<Profile> profiles) {
		// TODO Auto-generated method stub
		return false;
	}

}
