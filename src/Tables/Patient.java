
package Tables;

import java.util.HashMap;
import java.util.HashSet;

public class Patient  extends Parent_Table{
	final private String [] Features = {
			"Aadhar_Number",
			"Patient_ID",
			"Hospital_ID",
			"Date_Admit",
			"Date_Discharge",
			"Testing_Status",
			"Doctor_ID"
	};
    final private HashSet<String> Primary_Key ;
	public Patient() {
		Primary_Key = new HashSet<String>();
		Primary_Key.add("Patient_ID");
		
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
