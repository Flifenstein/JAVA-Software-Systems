package ss.week6.voteMachine;
import  java.util.ArrayList;
import java.util.List;

public class PartyList {
	List<String> parties;
	
	public PartyList() {
		parties = new ArrayList<String>();
	}
	public void addParty(List<String> newParties) {
		for (String s:newParties) {
			parties.add(s);
		}
	}
	
	public void addParty(String s) {
		parties.add(s);
	}
	
	public List<String> getParties(){
		return parties;
	}
	
	public boolean hasParty(String p) {
		for (String s:parties) {
			if (s.equals(p)) {
				return true;
			}
		}
		return false;
	}
}
	

