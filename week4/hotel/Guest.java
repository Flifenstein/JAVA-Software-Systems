package ss.week4.hotel;

public class Guest {
	private String name;
	private Room room;
	
	/**
	 * Initialize Guest class with a name
	 * @param name The name of the guest
	 */
	public Guest(String name) {
		this.name = name;
	}
	
	/**
	 * get name of the guest
	*@return name
	*/
	public String getName() {
		return name;
	}
	
	/**
	 * get room 
	*@return room
	*/
	public Room getRoom() {
		return room;
	}
	
	/**
	 *  check if guest is in a room
	 * @param r
	 * @return false or fail , else true
	 */
	public boolean checkin(Room r) {
		if(r.getGuest() == null) {
			r.setGuest(this);
			this.room=r;
			return true;
		}
	return false;
	}
	
	/**
	 * Check guest out
	 * @return boolean
	 */
	public boolean checkout() {
		if(this.room != null&& this.room.getGuest() == this) {
			this.room.setGuest(null);
			this.room = null;
			return true;
		} 
		return false;
	}
	
	/**
	 * @return String
	 */
	public String toString() {
		return "Guest " + name;
	}
}
