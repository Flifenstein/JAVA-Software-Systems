package ss.week5;

import ss.week4.tictactoe.Game;
import ss.week4.tictactoe.Mark;
import ss.week4.tictactoe.HumanPlayer;
import ss.week4.tictactoe.Player;

/**
 * Executable class for the game Tic Tac Toe. The game can be played against the
 * computer. Lab assignment Module 2
 * 
 * @author Theo Ruys
 * @version $Revision: 1.4 $
 */
public class TicTacToe {
    public static void main(String[] args) {
    	Player h1;
    	Player h2;
    	if (args.length==2) {
    		if (args[0].equals("-N")){
    			h1 = new ComputerPlayer(Mark.XX);
    		}
    		else if(args[0].equals("-S")) {
    			h1 = new ComputerPlayer(Mark.XX,new SmartStrategy());
    		}
    		else {
    			h1 = new HumanPlayer(args[0],Mark.XX);
    		}
    		if (args[1].equals("-N")){
    			h2 = new ComputerPlayer(Mark.OO);
    		}
    		else if(args[1].equals("-S")) {
    			h2 = new ComputerPlayer(Mark.OO,new SmartStrategy());
    		}
    		else {
    			h2 = new HumanPlayer(args[1],Mark.OO);
    		}
	    	Game g = new Game(h1,h2);
	    	g.start(h1.getName(), h2.getName());
    	}
    	else if (args.length==1){
    		Player h;
    		if (args[0].equals("-N")){
    			h = new ComputerPlayer(Mark.XX);
    		}
    		else if(args[0].equals("-S")) {
    			h = new ComputerPlayer(Mark.XX,new SmartStrategy());
    		}
    		else {
    			h = new HumanPlayer(args[0],Mark.XX);
    		}
	    	ComputerPlayer c = new ComputerPlayer(Mark.OO);
	    	Game g = new Game(h,c);
	    	g.start(h.getName(), c.getName());
    	}
    	else {
	    	ComputerPlayer c1 = new ComputerPlayer(Mark.XX);
	    	ComputerPlayer c2 = new ComputerPlayer(Mark.OO);
	    	Game g = new Game(c1,c2);
	    	g.start(c1.getName(), c2.getName());
    	}
    }
} 