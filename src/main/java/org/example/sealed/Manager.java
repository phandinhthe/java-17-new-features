package org.example.sealed;

public non-sealed class Manager extends Employee implements ProvisionedMethod {
	@Override
	public String introduce() {
		return super.introduce().concat("\n\t •").concat(provisionedMethod());
	}
}
