package Tables;

import java.util.HashMap;
import java.util.HashSet;

public class Foreign_Visit_Info extends Parent_Table {
	final private String [] Features = {
			"Aadhar_Number",
			"Country",
			"Date_Visit",
			
			
	};
    final private HashSet<String> Primary_Key ;
	public Foreign_Visit_Info() {
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
