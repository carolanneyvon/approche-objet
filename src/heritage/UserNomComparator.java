package heritage;

import java.util.Comparator;

public class UserNomComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o1.getNom().compareTo(o2.getNom());
	}
	
}
