package ss.week4.tictactoe;

/**
 * Executable class for the game Tic Tac Toe. The game can be played against the
 * computer. Lab assignment Module 2
 * 
 * @author Theo Ruys
 * @version $Revision: 1.4 $
 */
public class TicTacToe {
	private static String[] name = {"ioana", "JD"};
    public static void main(String[] args) {
        // TODO: implement, see P-4.21
    	HumanPlayer h1 = new HumanPlayer(name[0],Mark.XX);
    	HumanPlayer h2 = new HumanPlayer(name[1],Mark.OO);
    	Game g = new Game(h1,h2);
    	g.start(h1.getName(), h2.getName());
    }
} 