
public class ComparePoints {

	public String findDirection(String input) {
		String[] direction = input.split(",");
		// now we have an array of 4 things, first two are O P and second two
		// are Q R
		String result = null;
		String fromX = direction[0];
		String toX = direction[2];
		String fromY = direction[1];
		String toY = direction[3];
		if (fromX.equals(toX) && fromY.equals(toY)) {
			// if O equals Q and P equals R
			result = "Here"; // then we're already Here!
		} else {
			boolean movingEast = isLessThan(fromX, toX);
			if (movingEast && fromY.equals(toY)) {
				// if O is less than Q and P equals R
				result = "E"; // then we need to go East!
			} else {
				boolean movingWest = isGreaterThan(fromX, toX);
				if (movingWest && fromY.equals(toY)) {
					// if O is greater than Q and P equals R
					result = "W"; // then we need to go West!
				} else {
					boolean movingSouth = isGreaterThan(fromY, toY);
					if (fromX.equals(toX) && movingSouth) {
						// if O is equal to Q and P is greater than R
						result = "S"; // then we need to go South!
					} else {
						boolean movingNorth = isLessThan(fromY, toY);
						if (fromX.equals(toX) && movingNorth) {
							// if O is equal to Q and P is less than R
							result = "N"; // then we need to go North!

						} else if (movingEast && movingSouth) {
							// if O is less than Q and P is greater than R
							result = "SE"; // then we need to go SouthEast!
						} else if (movingWest && movingSouth) {
							// if O is greater than Q and P is greater than R
							result = "SW"; // then we need to go SouthWest!
						} else if (movingEast && movingNorth) {
							// if O is less than Q and P is less than R
							result = "NE"; // then we need to go NorthEast!
						} else if (movingWest && movingNorth) {
							// if O is greater than Q and P is less than R
							result = "NW"; // then we need to go NorthWest!

						}
					}
				}
			}
		}
		return result;

	}

	private boolean isGreaterThan(String fromX, String toX) {
		return fromX.compareTo(toX) > 0;
	}

	private boolean isLessThan(String fromY, String toY) {
		return fromY.compareTo(toY) < 0;
	}
}
