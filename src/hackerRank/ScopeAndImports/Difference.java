package hackerRank.ScopeAndImports;

import java.util.Arrays;

class Difference {
	private int[] elements;
	public int maximumDifference;

	Difference(int[] a) {
		elements = a;
	}

	int computeDifference() {
		Arrays.sort(elements);
		maximumDifference = elements[elements.length - 1] - elements[0];
		return maximumDifference;
	}
}
