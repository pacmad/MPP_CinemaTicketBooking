package domain;

import java.time.LocalDate;

public class MovieScheduledFactory {
	
	public static Hall createHall(int hallNo, int totalSeat) {
		return new Hall(hallNo, totalSeat);
	}

	public static Movie createMovie(String name, TypeMovie type, int time, String director, AgeRating rate, String description) {
		return new Movie(name, type, time, director, rate, description);
	}

	public static Schedule createSchedule(LocalDate time, Movie movie, Hall hall) {
		return new Schedule(time, movie, hall);
	}
}
