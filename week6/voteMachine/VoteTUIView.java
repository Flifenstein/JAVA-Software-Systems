package ss.week6.voteMachine;
import java.util.Map;
import java.util.Scanner;

import java.util.List;

public class VoteTUIView {
	 private VoteMachine vm; 
	 
	public void start() {
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
	
			String s = scan.nextLine();
			
			if() {
				
				
			}else if (tmp.equals("PARTIES")) {
				showParties(getParties());
			} else if(tmp.equals("VOTES")) {
				showVotes(getVotes());
			}else if (tmp.equals("EXIT")) {
				break;
			}
			
		}
		scan.close();
	}
	
	public void showVotes(Map<String, Integer> m) {
		
	for(String s : m.keySet()) {
		System.out.println(s + " "+ m.get(s));
	}

	}
	
	public void showParties(List<String> l) {
		for(String s : l) {
			System.out.println(s);
		}
	}
	
	public void showErrors(String s) {
		System.out.println(s);
	}
	
	  
	 public VoteTUIView(VoteMachine vm) {  
	  this.vm = vm; 
	 } 
	 
	 public List<String> getParties() {
		 return vm.p.getParties();
	 }
	 
	 public Map<String, Integer> getVotes() {
		 return vm.v.getVotes();
		 
	 }
	 
	 
}
