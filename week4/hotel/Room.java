package ss.week4.hotel;

/**
 * Hotel room with number and possibly a guest.
 * @author Arend Rensink
 */
public class Room {
    // ------------------ Instance variables ----------------
    private int number;
    private Guest guest;
    protected Safe safe;
    
  

    // ------------------ Constructor ------------------------
    /**
     * Creates a <code>Room</code> with the given number, without a guest.
     * @param no number of the new <code>Room</code>
     */
    public Room(int no) {
    	number = no;
    	safe = new Safe();
    }
    
    public Room( int no, Safe safe) {
    	number =no;
    	this.safe=safe;
    }

    // ------------------ Queries --------------------------
    /**
     * Returns the number of this <code>Room</code>.
     */
    public int getNumber() {
    	return number;
    }

    /**
     * Returns the current guest living in this <code>Room</code>.
     * @return the guest of this <code>Room</code>;
     *         <code>null</code> if this <code>Room</code> 
     *         is not currently rented
     */
    public Guest getGuest() {
    	return guest;
    }

    // ------------------ Commands --------------------------
    /**
     * Assigns a <code>Guest</code> to this <code>Room</code>.
     * @param g the next guest renting this <code>Room</code>;
     *        if <code>null</code> is passed, this <code>Room</code>
     *        is empty afterwards
     */
    public void setGuest(Guest g) {
    	guest = g;
    }
    	
    /**
     * Returns a string of the room
     * @return description
     */
    	public String toString() {
    		return "Room" + this.getNumber();
    	}

	public Safe getSafe() {
		// TODO Auto-generated method stub
		return safe;
	}
    
}
