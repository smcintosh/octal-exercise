package ca.uwaterloo.cs446;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void testOneDigit() {
		Subject sub = new NumberSubject(0);
		Observer obs = new OctalObserver(sub);

		sub.setState(5);
		assertEquals(obs.getValue(), "5");
	}

	@Test
	public void testTwoDigit() {

		Subject sub = new NumberSubject(0);
		Observer obs = new OctalObserver(sub);

		sub.setState(14);
		assertEquals(obs.getValue(), "16");
	}
}
