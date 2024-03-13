package application;

import entities.IntegerSet;
import tests.factory.IntegerSetFactory;

public class Program {

	public static void main(String[] args) {

		IntegerSet emptySet = IntegerSetFactory.createEmptyIntegerSet();
		IntegerSet fullSet = IntegerSetFactory.createFullIntegerSet();
		IntegerSet multipleFiveSet = IntegerSetFactory.createMultipleFiveIntegerSet();
		IntegerSet multipleFiveSet2 = IntegerSetFactory.createMultipleFiveIntegerSet();
		IntegerSet multipleThreeSet = IntegerSetFactory.createMultipleThreeIntegerSet();
		IntegerSet oddSet = IntegerSetFactory.createOddIntegerSet();
		IntegerSet pairSet = IntegerSetFactory.createPairIntegerSet();

		System.out.printf(
				"Empty set: %s%nFull set: %s%nMultiple five set: %s%nMultiple three set: %s%nOdd set: %s%nPair set: %s%n",
				emptySet, fullSet, multipleFiveSet, multipleThreeSet, oddSet, pairSet);

		System.out.printf("%nUnion pair set and odd set: %s%n%n", IntegerSet.union(oddSet, pairSet));
		System.out.printf("Interseciont multiple three set and multiple five set: %s%n%n",
				IntegerSet.intersection(multipleThreeSet, multipleFiveSet));
		System.out.printf("Inserting element 4 in empty set: %s%n%n", emptySet.insertElement(4));
		System.out.printf("Deleting element 4 in full set: %s%n%n", fullSet.deleteElement(4));
		System.out.printf("Comparing two differents sets (Odd set and pair set): %s%n%n",
				IntegerSet.isEqualTo(oddSet, pairSet));
		System.out.printf("Comparing two equals sets (multiple five set and multiple five set 2): %s",
				IntegerSet.isEqualTo(multipleFiveSet, multipleFiveSet2));
	}
}
