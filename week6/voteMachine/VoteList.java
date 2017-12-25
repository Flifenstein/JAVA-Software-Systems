package ss.week6.voteMachine;

import java.util.HashMap;
import java.util.Map;



public class VoteList {
	Map<String, Integer> votes;
	
	public VoteList() {
		votes = new HashMap<String, Integer>();
	}
	
	public Map<String,Integer> getVotes(){
		return votes;
	}
	
	public void addVote(String p) {
		if (votes.containsKey(p)) {
			votes.put(p, votes.get(p)+1);
		}
		else {
			votes.put(p, 1);
		}
	}
}
