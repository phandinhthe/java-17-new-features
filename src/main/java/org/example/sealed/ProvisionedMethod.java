package org.example.sealed;

/**
 * Seal interface
 */
public sealed interface ProvisionedMethod permits Manager {
	default String provisionedMethod() {
		return "I could fired any one!!!";
	}
}
