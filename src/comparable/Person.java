package comparable;

public class Person implements Comparable<Person> {

	@Override
	public int compareTo(Person o) {
		throw new RuntimeException(
				"Nobody is superior, nobody is inferior, but nobody is equal either.\n" + 
				"People are simply unique, incomparable. You are you. I am I. -Osho");
	}

}
