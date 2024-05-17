package org.example.sealed;

/*
Sealed class
** Goals
- Allow author of a class or interface to control which code is responsible to implement it.
- Provide a more declarative way than access modifiers to restrict the use of super class.
** Non-goals
- It is not a goal to provide new forms of access control such as "friends"
- It is not a goal to change final in any way.
 */
public sealed class SealedUser permits Guest, Employee, Administrator {
	protected final String getRole() {
		return this.getClass().getSimpleName();
	}

	public String introduce() {
		return String.format("My role is \"%s\"", getRole());
	}
}
