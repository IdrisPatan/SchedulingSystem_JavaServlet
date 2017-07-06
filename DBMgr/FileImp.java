package mypackage.DBMgr;

import java.io.*;
import java.util.ArrayList;

import mypackage.Profile;
import mypackage.TimeSlot;

public class FileImp implements DBMgr{
	private SaveDB saveDB=null;
	
	public boolean saveTS(TimeSlot t){
		System.out.println("In save TS");
		if(saveDB==null){
			System.out.println("In save TS save==null");
			boolean success=loadSave();
			System.out.println(success);
			if(success==true){
				System.out.println("adding to loaded file");
				saveDB.Slots.add(t);
			}
			if(success==false){
				saveDB=new SaveDB();
				saveDB.Slots.add(t);
			}
			boolean sv=saveSave(saveDB);
			System.out.println(sv);

		}
		else{
			saveDB.Slots.add(t);
			boolean sv=saveSave(saveDB);
		}
		return true;
	}
	
	public boolean saveTSs(ArrayList<TimeSlot> tss){
		System.out.println("In save TSs");
		if(saveDB==null){
			System.out.println("In save TSs save==null");
			boolean success=loadSave();
			System.out.println(success);
			if(success==true){
				System.out.println("adding to loaded file");
				saveDB.Slots=tss;
			}
			if(success==false){
				saveDB=new SaveDB();
				saveDB.Slots=tss;
			}
			boolean sv=saveSave(saveDB);
			System.out.println(sv);

		}
		else{
			saveDB.Slots=tss;
			boolean sv=saveSave(saveDB);
			
		}
		return true;
	}
	
	public boolean saveProfiles(ArrayList<Profile> profiles){
		System.out.println("In save Profiles");
		if(saveDB==null){
			System.out.println("In save Profiles save==null");
			boolean success=loadSave();
			System.out.println(success);
			if(success==true){
				System.out.println("adding to loaded file");
				saveDB.Profiles=profiles;
			}
			if(success==false){
				saveDB=new SaveDB();
				saveDB.Profiles=profiles;
			}
			boolean sv=saveSave(saveDB);
			System.out.println(sv);

		}
		else{
			saveDB.Profiles=profiles;
			boolean sv=saveSave(saveDB);
			
		}
		return true;
	}
	
	public boolean saveIDs(int idts,int idappts){
		System.out.println("In save ID");
		if(saveDB==null){
			System.out.println("In save ID save==null");
			boolean success=loadSave();
			System.out.println(success);
			if(success==true){
				System.out.println("adding to loaded file");
				saveDB.idTS=idts;
				saveDB.idAppts=idappts;
			}
			if(success==false){
				System.out.println("creating new file");
				saveDB=new SaveDB();
				saveDB.idTS=idts;
				saveDB.idAppts=idappts;
			}
			boolean sv=saveSave(saveDB);
			System.out.println(sv);

		}
		else{
			saveDB.idTS=idts;
			saveDB.idAppts=idappts;
			boolean sv=saveSave(saveDB);
			
		}
		return true;
	}

	public ArrayList<TimeSlot> getTimeSlots(){
		if(saveDB==null){
		System.out.println("In get TS save==null");
		boolean success=loadSave();
		System.out.println(success);
		if(success==true){
			System.out.println("returning slots");
			return saveDB.Slots;
		}
		else{
			System.out.println("creating new file");
			saveDB=new SaveDB();
			boolean sv=saveSave(saveDB);
			return saveDB.Slots;
		}
		
		}
		else{
			return saveDB.Slots;
		}
		
	}
	
	public ArrayList<Profile> getProfiles(){
		if(saveDB==null){
		System.out.println("In get TS save==null");
		boolean success=loadSave();
		System.out.println(success);
		if(success==true){
			System.out.println("returning slots");
			return saveDB.Profiles;
		}
		else{
			System.out.println("creating new file");
			saveDB=new SaveDB();
			boolean sv=saveSave(saveDB);
			return saveDB.Profiles;
		}
		
		}
		else{
			return saveDB.Profiles;
		}
		
	}
	
	public int getIDts(){
		if(saveDB==null){
		System.out.println("In get idts save==null");
		boolean success=loadSave();
		System.out.println(success);
		if(success==true){
			System.out.println("adding to loaded file");
			return saveDB.idTS;
		}
		else{
			saveDB=new SaveDB();
			boolean sv=saveSave(saveDB);
			return saveDB.idTS;
		}
		}
		else{
			return saveDB.idTS;
		}
		
	}
	
	public int getIDappts(){
		if(saveDB==null){
		System.out.println("In get idappts save==null");
		boolean success=loadSave();
		System.out.println(success);
		if(success==true){
			System.out.println("adding to loaded file");
			return saveDB.idAppts;
		}
		else{
			saveDB=new SaveDB();
			boolean sv=saveSave(saveDB);
			return saveDB.idAppts;
		}
		}
		else{
			return saveDB.idAppts;
		}
		
	}
	
	private boolean loadSave(){
		try{
			System.out.println("in load");
			FileInputStream fileIn=new FileInputStream("C:/School/Fall 2014/Design Patterns/workspace/AdvisorScheduling/database/save2.ser");
			System.out.println("file stream in");
			InputStream buffer = new BufferedInputStream(fileIn);
			System.out.println("file buffer in");
			ObjectInputStream in=new ObjectInputStream(buffer);
			System.out.println("objet stream in");
			SaveDB s=(SaveDB) in.readObject();
			System.out.println("read file");
			in.close();
			fileIn.close();
			System.out.println("closed file");
			saveDB=s;
			return true;
		}
		catch(IOException i){
			System.out.println(i);
			return false;			
		}
		catch(ClassNotFoundException c){
			System.out.println(c);
			return false;			
		}
		
	}
	
	private boolean saveSave(SaveDB save){
		try{
			FileOutputStream fileOut=new FileOutputStream("C:/School/Fall 2014/Design Patterns/workspace/AdvisorScheduling/database/save2.ser");
			System.out.println("steam made");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			System.out.println("obj steam made");
			out.writeObject(save);
			System.out.println("write");
			out.close();
			fileOut.close();
			System.out.println("closed");
			return true;
			
		}catch(IOException i){
			System.out.println("derp");
			System.out.println(i);
			return false;
		}
		
	}
	
}
