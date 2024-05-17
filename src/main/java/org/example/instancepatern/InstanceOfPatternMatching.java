package org.example.instancepatern;


import java.util.function.Function;

/*
The instanceof operator can now take a type pattern and perform a type matching, bringing simplicity.
 */
public record InstanceOfPatternMatching() {

	public static void demoClassicalSwitchCase(Object o) {
		String format = "My value is %s -> I am %s";
		String result = "";
		if (o instanceof Integer) {
			result = String.format(format, o, o.getClass().getSimpleName());
		}
		if (o instanceof Long ) {
			result = String.format(format, o, o.getClass().getSimpleName());
		}
		if (o instanceof Double) {
			result = String.format(format, o, o.getClass().getSimpleName());
		}
		if (o instanceof Float) {
			result = String.format(format, o, o.getClass().getSimpleName());
		} else {
			result = String.format(format, String.format("\"%s\""), o.getClass().getSimpleName());
		}
		System.out.println(result);
	}

	public static void demoModernSwitchCase(Object type) {
		Function<Object, String> getType = (o) -> {
			String format = "My value is %s -> I am %s";
			if (o instanceof Integer i) {
				return String.format(format,o, i.getClass().getSimpleName());
			}
			if (o instanceof Long i) {
				return String.format(format,o, i.getClass().getSimpleName());
			}
			if (o instanceof Double i) {
				return String.format(format,o, i.getClass().getSimpleName());
			}
			if (o instanceof Float i) {
				return String.format(format,o, i.getClass().getSimpleName());
			}
			return String.format(format, String.format("\"%s\"", o), "Nothing");
		};

		System.out.println(getType.apply(type));
	}
}
