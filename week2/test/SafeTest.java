package ss.week2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ss.week4.hotel.Password;
import ss.week4.hotel.Safe;

class SafeTest {
	private Safe s1;
	
	@BeforeEach
	void setUp() throws Exception {
		s1 = new Safe();
	}

	@Test
	void testInitial() {
		assertFalse(s1.isActive());
		assertFalse(s1.isOpen());
		assertTrue(s1.getPassword().testWord(Password.INITIAL));
	}
	
	@Test
	void testChangeActive() {
		assertFalse(s1.isActive());
		s1.activate(Password.INITIAL);
		assertTrue(s1.isActive());
	}
	
	@Test
	void testChangeOpenNotActive() {
		assertFalse(s1.isOpen());
		s1.open(Password.INITIAL);
		assertFalse(s1.isOpen());
	}
	
	@Test
	void testChangeOpenActive() {
		assertFalse(s1.isOpen());
		assertFalse(s1.isActive());
		s1.activate(Password.INITIAL);
		s1.open(Password.INITIAL);
		assertTrue(s1.isActive());
		assertTrue(s1.isOpen());
	}
	
	@Test
	void testChangePassword() {
		assertTrue(s1.getPassword().testWord(Password.INITIAL));
		s1.getPassword().setWord(Password.INITIAL, "newnewnew");
		assertFalse(s1.getPassword().testWord(Password.INITIAL));
		assertTrue(s1.getPassword().testWord("newnewnew"));
	}
	
	@Test
	void testActivateWrongPassword() {
		assertFalse(s1.isActive());
		s1.activate("wrongwrongwrong");
		assertFalse(s1.isActive());
	}
	
	@Test
	void testopenWrongPassword() {
		assertFalse(s1.isActive());
		s1.activate(Password.INITIAL);
		assertTrue(s1.isActive());
		assertFalse(s1.isOpen());
		s1.open("wrongwrongwrong");
		assertFalse(s1.isOpen());
	}
	
	@Test
	void testopenWrongActivatePassword() {
		assertFalse(s1.isActive());
		s1.activate("wrongwrongwrong");
		assertFalse(s1.isActive());
		assertFalse(s1.isOpen());
		s1.open(Password.INITIAL);
		assertFalse(s1.isOpen());
	}
	
	@Test
	void testDeactivate() {
		s1.deactivate();
		assertFalse(s1.isActive());
	}
	
	@Test
	void testClose() {
		s1.close();
		assertFalse(s1.isOpen());
	}


}
