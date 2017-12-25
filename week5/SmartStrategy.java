package ss.week5;

import ss.week4.tictactoe.*;
import java.util.List;
import java.util.ArrayList;

public class SmartStrategy implements Strategy{
	private String name="Smart Strategy";
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int determineMove(Board b, Mark m) {
		List<Integer> fields= new ArrayList<Integer>();
		int i=0;
		while (i<9) {
			if (b.isEmptyField(i)) {
				fields.add(i);
			}
			i++;
		}
		if(fields.contains(4)) {
			return 4;
		}
		else if(winField(b,m,fields)!=-1) {
			return winField(b,m,fields);
		}
		else if(winField(b,m.other(),fields)!=-1) {
			return winField(b,m.other(),fields);
		}
		else {
			int f=(int)(Math.random()*fields.size());
			return fields.get(f);
		}
	}
	
	public int winField(Board b, Mark m, List<Integer> fields) {
		for (int i:fields) {
			Board newB=b.deepCopy();
			newB.setField(i, m);
			if (newB.hasWinner()) {
				return i;
			}
			i++;
		}
		return -1;
	}
}
