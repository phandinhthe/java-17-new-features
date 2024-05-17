package org.example;

import org.example.instancepatern.InstanceOfPatternMatching;
import org.example.sealed.*;

import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		// Seal class
		SealedUser guest = new Guest();
		SealedUser manager = new Manager();
		SealedUser employee = new Employee();
		SealedUser administrator = new Administrator();
		Stream.of(guest, manager, employee, administrator).forEachOrdered(e -> System.out.println(e.introduce()));


		// instanceof pattern matching
		Stream.of(Integer.valueOf(1), Double.valueOf(2), Float.valueOf(3), String.valueOf(1), Long.valueOf(2L))
				.forEachOrdered(InstanceOfPatternMatching::demoModernSwitchCase);
	}
}
