package ss.week4.hotel;

import java.util.ArrayList;
import ss.week3.bill.StringPrinter;
import ss.week3.bill.Bill;
import ss.week3.bill.Bill.Item;

public class Hotel {
	
	private String hotelname;
	private ArrayList<Room> rooms;
	private ArrayList<Guest> guests;
	private Password password;
	
	
	public Hotel(String name) {
		hotelname = name;
		
		rooms = new ArrayList<Room>();
		rooms.add(new Room(999));
		rooms.add(new Room(111));        
		rooms.add(new PricedRoom(123,100,10));
		guests = new ArrayList<Guest>();
		password = new Password();
	}
	
	public Bill getBill(String name, int noNights, StringPrinter p) {
		Guest guest = findGuestbyName(name);
		Room r = guest.getRoom();
		if(r instanceof Item) { 
			Bill b = new Bill(p);
			Safe safe =r.getSafe();
			if(safe instanceof Item) {
				b.addItem((Item)safe);
			}
			for(int i=0; i<=noNights; i++) {
				
				b.addItem((Item) r);
			}
			return b;
		}
		return null;
		
	}
	
	protected Guest findGuestbyName(String guestname) {
		if (guests == null)
			return null;
		for(Guest guest : guests) {
			if(guest.getName().equals(guestname))
				return guest;
		}
		return null;
	}
	/*
	 * @requires password!=null && password!= ""
	 * @requires guestname !=null && guestname!=""
	 * @param password
	 * @param guestname
	 * @return
	 */
	public Room checkIn(String password, String guestname) {
		//Pasword check
		if(!this.password.testWord(password)) {
		return null;
		}	
		//Get guest from ArrayList
		Guest gguest = this.findGuestbyName(guestname);
		//if Guest doesnt exit create a new one
		if (gguest == null) {
			gguest = new Guest(guestname);
			guests.add(gguest);
		}
		// Assign free room
		Room room = getFreeRoom();
		if(room != null && gguest.getRoom()==null) {
			gguest.checkin(room);
			room.setGuest(gguest);
			return room;
		}
		return null;
		
	}
	public Room checkOut(String guestname) {
		for(Guest guest: guests) {
			if(guest.getName() == guestname) {
				Room room = guest.getRoom();
				if(guest.checkout()) {
					room.setGuest(null);
					room.getSafe().deactivate();
					room.getSafe().close();
				}
			
			}
		}
		return null;
		
	}
	
	/*
	 * Gets free room from the list of rooms
	 * @return
	 */
	public Room getFreeRoom() {
		for(Room room: rooms) {
			if(room.getGuest()==null)
				return room;
		}return null;
	}
	
	/*
	 * @requires guestnbame != null && guestname!= ""
	 * @param guestname
	 * @return
	 */
	
	public Room getRoom(String guestname) {
		for(Guest guest: guests) {
			if(guest.getName()==guestname) {
				return guest.getRoom();
			}
		}return null;
	}
	
	//public PricedRoom getPricedRoom(String guestname) {
	//	for(Guest guest: guests) {
	//		if(guest.getName()==guestname && guest.getRoom().isPriced()) {
	//			return (PricedRoom) guest.getRoom();
	//		}
	//	}return null;
	//}
	
	
	public Password getPassword() {
		return this.password;
	}
	
	public String getName() {
		return this.hotelname;
	}
	
	public String toString() {
		String output = "";
				for(Room room:rooms) {
					output += room.toString() + "\n";
				}
		
				for(Guest guest: guests) {
					output+= guest.toString() + "\n";
				}
				return output;
	}
	
}	

