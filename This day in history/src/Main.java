
import java.time.LocalDate;

import java.time.YearMonth;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int month = YearMonth.now().getMonthValue();
		LocalDate day = YearMonth.now().atDay(month-1);

		System.out.print("Šodienas datums: " + day + "\n");

	
		
		
		
		
		Scanner input = new Scanner(System.in);

		System.out.print("Ievadiet Mēnesi pāc kārtas: ");
		int men = input.nextInt();

		System.out.print("Ievadiet datumu: ");
		int date = input.nextInt();

		input.close();

		if (men == 1) {
			January jan = new January(date);
		} else if (men == 2) {
			February feb = new February(date);
		} else if (men == 3) {
			March mar = new March(date);

		} else if (men == 4) {
			April apr = new April(date);

		} else if (men == 5) {
			May may = new May(date);

		} else if (men == 6) {
			June jun = new June(date);

		} else if (men == 7) {
			July jul = new July(date);

		} else if (men == 8) {
			August aug = new August(date);

		} else if (men == 9) {
			September sep = new September(date);

		} else if (men == 10) {
			October oct = new October(date);

		} else if (men == 11) {
			November nov = new November(date);

		} else if (men == 12) {
			December dec = new December(date);

		} else {
			System.out.print("Nav šāda mēneša");
		}

//		switch (men) {
//		case 1:
//			January jan = new January(date);
//			break;
//		case 2:
//			February feb = new February(date);
//			break;
//		case 3:
//			March mar = new March(date);
//			break;
//		case 4:
//			April apr = new April(date);
//			break;
//		case 5:
//			May may = new May(date);
//			break;
//		case 6:
//			June jun = new June(date);
//			break;
//		case 7:
//			July jul = new July(date);
//			break;
//		case 8:
//			August aug = new August(date);
//			break;
//		case 9:
//			September sep = new September(date);
//			break;
//		case 10:
//			October oct = new October(date);
//			break;
//		case 11:
//			November nov = new November(date);
//			break;
//		case 12:
//			December dec = new December(date);
//			break;
//
//		default:
//			System.out.print("Nav šāda mēneša");
//			break;
//		}

	}

}
