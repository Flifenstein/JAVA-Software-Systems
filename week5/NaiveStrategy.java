package ss.week5;

import ss.week4.tictactoe.*;
import java.util.List;
import java.util.ArrayList;

public class NaiveStrategy implements Strategy{
	private String name="Naive Strategy";
	
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
		int f=(int)(Math.random()*fields.size());
		return fields.get(f);
	}

}
