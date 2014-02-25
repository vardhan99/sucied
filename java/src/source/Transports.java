package source;

public class Transports {
	private static int DISTANCE = 10000;
	private static int TOTAL_NUMBER_OF_FLIGHTS = 10;
	private static int TOTAL_PEOPLE_CAN_CARRAY_IN_FLIGHT = 300;
	private static int KMPERHOUR_FOR_FLIGHT = 500;
	private static int TOTAL_PEOPLE_CAN_CARRAY_IN_SHIP = 25000;
	private static int SHIP_TRAVELING_DAYS = 30;
	private static int TOTAL_PEOPLE_CAN_CARRAY_IN_ROCKET = 20;
	private static int ROCKET_TRAVELING_TIME = 35;

	public static int flight(int totalPeople) {
		int totalTime = (DISTANCE / KMPERHOUR_FOR_FLIGHT);
		int totalPeopleOneTrip = TOTAL_PEOPLE_CAN_CARRAY_IN_FLIGHT
				* TOTAL_NUMBER_OF_FLIGHTS;

		int trips = (totalPeople / totalPeopleOneTrip);
		int totalTrips = (trips + (trips - 1));

		int flightTotalDays = (totalTrips * totalTime) / 24;
		if (flightTotalDays <= 0) {
			flightTotalDays = 1;
		}
		return flightTotalDays;

	}

	public static int ship(int totalPeople) {

		if (totalPeople < TOTAL_PEOPLE_CAN_CARRAY_IN_SHIP)
			return SHIP_TRAVELING_DAYS;
		int trip = totalPeople / TOTAL_PEOPLE_CAN_CARRAY_IN_SHIP;
		int totalTrip = (trip + (trip - 1));
		int shipTotalDays = totalTrip * SHIP_TRAVELING_DAYS;

		return shipTotalDays;
	}

	public static int rocket(int totalPeople) {

		int trip = totalPeople / TOTAL_PEOPLE_CAN_CARRAY_IN_ROCKET;
		int totalTrip = (trip + (trip - 1));
		int rocketTotalDays = (totalTrip * ROCKET_TRAVELING_TIME) / (24 * 60);
		if (rocketTotalDays <= 0) {
			rocketTotalDays = 1;
		}
		return rocketTotalDays;
	}

	public static void main(String[] args) {
		int totalPeoples = Integer.parseInt(args[0]);
		int timeInFlight = flight(totalPeoples);
		int timeInShip = ship(totalPeoples);
		int timeInRocket = rocket(totalPeoples);

		System.out.println("flight take " + timeInFlight + "days");
		System.out.println("Ship take " + timeInShip + "days");
		System.out.println("Rocket take " + timeInRocket + "days");
		if ((timeInFlight < timeInShip) && (timeInFlight < timeInRocket)) {
			System.out.println("Flight is best");
		} else if ((timeInShip < timeInFlight) && (timeInShip < timeInRocket)) {
			System.out.println(" Ship is best");
		} else {
			System.out.println("Rocket is best");
		}
	}
}
