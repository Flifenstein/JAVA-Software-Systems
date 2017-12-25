package ss.week5;

import ss.week4.tictactoe.*;

public class ComputerPlayer extends ss.week4.tictactoe.Player{
	Strategy s;
	
	public ComputerPlayer(Mark mark, Strategy strat) {
		super(strat.getName()+"-"+mark, mark);
		s=strat;
	}
	
	public ComputerPlayer(Mark mark) {
		super("Naive Strategy-"+mark, mark);
		s=new NaiveStrategy();
	}

	@Override
	public int determineMove(Board board) {
		return s.determineMove(board, getMark());
	}
	
}
