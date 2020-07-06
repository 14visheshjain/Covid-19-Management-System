package Tables;

import java.util.HashMap;
import java.util.HashSet;

public class Doctor extends Parent_Table {
	final private String[] Features = { "Doctor_ID", "Name", "Hospital_ID", "Qualification" };
	final private HashSet<String> Primary_Key;

	public Doctor() {
		Primary_Key = new HashSet<String>();
		Primary_Key.add("Doctor_ID");

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
