package OneToMany;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Location {
	private int Lid;
	private String Lcountry;
	private Map N;
	
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLcountry() {
		return Lcountry;
	}
	public void setLcountry(String lcountry) {
		Lcountry = lcountry;
	}
	public Map getN() {
		return N;
	}
	public void setN(Map n) {
		N = n;
	}

}
