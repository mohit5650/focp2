import java.util.Scanner;
public class DateTest{
	public static void main(String[] args) {
		Date display=new Date(0,0,0);
		Scanner input=new Scanner(System.in);
		int month;
		int day;
		int year;
		System.out.print("enter month:");
		month=input.nextInt();
		display.setMonth(month);
		System.out.println();

		System.out.print("enter day:");
		day=input.nextInt();
		display.setday(day);

		System.out.println();

		System.out.print("enter year");
		year=input.nextInt();
		display.setyear(year);

		System.out.println();

		display.displayDate();
	}
}