package Tables;

import java.util.HashMap;
import java.util.HashSet;

public class Home_Quarantined extends Parent_Table{
	final private String [] Features = {
			"Aadhar_Number",
			"Start_Date",
			"Person_Contacted" 
	};
    final private HashSet<String> Primary_Key ;
	public Home_Quarantined() {
		Primary_Key = new HashSet<String>();
		Primary_Key.add("Aadhar_Number");
		
	}
	@Override
	public String[] get_features() {
		return Features.clone();
	}
	@Override
	public HashSet<String> get_primary_key() {
		return Primary_Key;
	}
}
