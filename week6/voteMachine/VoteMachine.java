package ss.week6.voteMachine;

public class VoteMachine {
	VoteList v;
	PartyList p;
	
	public VoteMachine(VoteList v, PartyList p) {
		this.v=v;
		this.p=p;
	}
	
	public VoteMachine() {
		this.v= new VoteList();
		this.p= new PartyList();
	}
	
	public void addParty(String party) {
		p.addParty(party);
	}
	
	public void vote(String party) {
		v.addVote(party);
	}
	
	public void start() {
		VoteTUIView TUIViewy = new VoteTUIView(this);
		TUIViewy.start();
	}

	public static void main(String[] args) {
		
		VoteMachine vm=new VoteMachine();
		vm.start(); 

	}
}