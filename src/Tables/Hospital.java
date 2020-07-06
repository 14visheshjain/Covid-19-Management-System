package Tables;

import java.util.HashMap;
import java.util.HashSet;

public class Hospital extends Parent_Table {
	final private String [] Features = {
			"Hospital_ID",
			"Name",
			"City" ,
			"State",
			"PinCode"
			
	};
    final private HashSet<String> Primary_Key ;
	public Hospital() {
		Primary_Key = new HashSet<String>();
		Primary_Key.add("Hospital_ID");
		
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
