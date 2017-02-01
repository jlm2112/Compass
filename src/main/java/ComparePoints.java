
public class ComparePoints {

	public String Compass(String input) {
		String[] direction = input.split(",");
		// now we have an array of 4 things, first two are O P and second two
		// are Q R
		String result = null;
		if (direction[0].equals(direction[2]) && direction[1].equals(direction[3])) {
			// if O equals Q and P equals R
			result = "Here"; // then we're already Here!
		} else if (direction[0].compareTo(direction[2]) < 0 && direction[1].equals(direction[3])) {
			// if O is less than Q and P equals R
			result = "E"; // then we need to go East!
		} else if (direction[0].compareTo(direction[2]) > 0 && direction[1].equals(direction[3])) {
			// if O is greater than Q and P equals R
			result = "W"; // then we need to go West!
		} else if (direction[0].equals(direction[2]) && direction[1].compareTo(direction[3]) > 0) {
			// if O is equal to Q and P is greater than R
			result = "S"; // then we need to go South!
		} else if (direction[0].equals(direction[2]) && direction[1].compareTo(direction[3]) < 0) {
			// if O is equal to Q and P is less than R
			result = "N"; // then we need to go North!

		} else if (direction[0].compareTo(direction[2]) < 0 && direction[1].compareTo(direction[3]) > 0) {
			// if O is less than Q and P is greater than R
			result = "SE"; // then we need to go SouthEast!
		} else if (direction[0].compareTo(direction[2]) > 0 && direction[1].compareTo(direction[3]) > 0) {
			// if O is greater than Q and P is greater than R
			result = "SW"; // then we need to go SouthWest!
		} else if (direction[0].compareTo(direction[2]) < 0 && direction[1].compareTo(direction[3]) < 0) {
			// if O is less than Q and P is less than R
			result = "NE"; // then we need to go NorthEast!
		} else if (direction[0].compareTo(direction[2]) > 0 && direction[1].compareTo(direction[3]) < 0) {
			// if O is greater than Q and P is less than R
			result = "NW"; // then we need to go NorthWest!

		}
		return result;

	}
}
