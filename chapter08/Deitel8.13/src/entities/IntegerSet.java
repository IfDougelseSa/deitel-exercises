package entities;

public class IntegerSet {

	private boolean[] arrayInteger = new boolean[101];

	public IntegerSet() {

	}

	public IntegerSet(boolean[] arrayInteger) {
		this.arrayInteger = arrayInteger;
	}

	public boolean[] getArrayInteger() {
		return arrayInteger;
	}

	public void setArrayInteger(boolean[] arrayInteger) {
		this.arrayInteger = arrayInteger;
	}

	public String insertElement(int element) {
		arrayInteger[element] = true;
		return "Element " + element + " has been inserted.";
	}

	public String deleteElement(int element) {
		arrayInteger[element] = false;
		return "Element " + element + " has been deleted.";
	}

	@Override
	public String toString() {
		String result = "";

		for (int i = 0; i < 101; i++) {
			if (arrayInteger[i]) {
				result += i + " ";
			}
		}

		if (result == "") {
			return "---";
		} else {
			return result.trim();
		}

	}

	public static String union(IntegerSet set, IntegerSet set2) {
		boolean[] union = new boolean[101];
		String allUnionElements = "";

		for (int i = 0; i < 101; i++) {
			if (set.arrayInteger[i] == true) {
				union[i] = true;
			}

			if (set2.arrayInteger[i] == true) {
				union[i] = true;
			}
		}

		for (int i = 0; i < 101; i++) {
			if (union[i] == true) {
				allUnionElements += i + " ";
			}
		}

		return allUnionElements.trim();
	}

	public static String intersection(IntegerSet set, IntegerSet set2) {
		boolean[] intersection = new boolean[101];

		String allIntersectionElements = "";

		for (int i = 0; i < 101; i++) {

			if (set.arrayInteger[i] && set2.arrayInteger[i]) {
				intersection[i] = true;
				allIntersectionElements += i + " ";
			}
		}
		return allIntersectionElements.trim();
	}

	public static boolean isEqualTo(IntegerSet set, IntegerSet set2) {
		for (int i = 0; i < 101; i++) {

			if (set.arrayInteger[i] != set2.arrayInteger[i]) {
				return false;
			}
		}
		return true;
	}

}
