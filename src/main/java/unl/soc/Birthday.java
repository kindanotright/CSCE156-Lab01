package unl.soc;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;

// This is some sort of java program
// I guess, this is really bad documentation
//so Im not ReAlLy SuRe.
public class Birthday {
	public static void main(String args[]) {

		String name = "Megan";

		int month = 8;
		int date = 12;
		int year = 1989;

		DateTime bday = new DateTime(year, month, date, 0, 0);
		DateTime today = new DateTime();

		Period age = new Period(bday, today);

		int years = age.getYears();
		int months = age.getMonths();
		int days = age.getWeeks() * 7 + age.getDays();

		DateTime nextBday = new DateTime(year + years + 1, month, date, 0, 0);
		Interval daysToNextBdayI = new Interval(today, nextBday);
		double daysRemaining = daysToNextBdayI.toDurationMillis() / (1000 * 60 * 60 * 24) + 1;

		System.out.println("Greetings, " +name+ ". Today you are " +years+ " years, " +month+ " months, and " +days+ " days old.");
//TODO: write code to output results here

	}
}
