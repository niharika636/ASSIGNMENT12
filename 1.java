import java.util.*;
 class Calendar {

	public static HashMap<String, String> date = new HashMap<String, String>();
	public static HashMap<String, String> month = new HashMap<String, String>();
	public static HashMap<String, String> year1= new HashMap<String, String>();
	public static HashMap<String, String> year2 = new HashMap<String, String>();

	public static void input() {
		date.put("01", "First");
		date.put("02", "Second");
		date.put("03", "Third");
		date.put("04", "Fourth");
		date.put("05", "Fifth");
		date.put("06", "Sixth");
		date.put("07", "Seventh");
		date.put("08", "Eighth");
		date.put("09", "Nineth");
		date.put("10", "Tenth");
		date.put("11", "Eleventh");
		date.put("12", "Tweleveth");
		date.put("13", "Thirteenth");
		date.put("14", "Fourteenth");
		date.put("15", "Fifteenth");
		date.put("16", "Sixteenth");
		date.put("17", "Seventeenth");
		date.put("18", "Eighteenth");
		date.put("19", "Nineteenth");
		date.put("20", "Twenty");
		date.put("21", "Twenty First");
		date.put("22", "Twenty Second");
		date.put("23", "Twenty Third");
		date.put("24", "Twenty Fourth");
		date.put("25", "Twent Fifth");
		date.put("26", "Twenty Sixth");
		date.put("27", "Twenty Seventh");
		date.put("28", "Twenty Eighth");
		date.put("29", "Twenty Nineth");
		date.put("30", "Thirty");
		date.put("31", "Thirty First");

		month.put("01", "January");
		month.put("02", "February");
		month.put("03", "March");
		month.put("04", "April");
		month.put("05", "May");
		month.put("06", "June");
		month.put("07", "July");
		month.put("08", "August");
		month.put("09", "September");
		month.put("10", "October");
		month.put("11", "November");
		month.put("12", "December");

		year1.put("07", "Seven");
		year1.put("08", "Eight");
		year1.put("09", "Nine");
		year1.put("10", "Ten");
		year1.put("11", "Eleven");
		year1.put("12", "Tweleve");
		year1.put("13", "Thirteen");
		year1.put("14", "Fourteen");
		year1.put("15", "Fifteen");
		year1.put("16", "Sixteen");
		year1.put("17", "Seventeen");
		year1.put("18", "Eighteen");
		year1.put("19", "Nineteen");
		year1.put("20", "Twenty");
		year1.put("21", "Twenty One");
		year1.put("22", "Twenty Two");

		year2.put("00", "Hundred");
		year2.put("10", "Ten");
		year2.put("20", "Twenty");
		year2.put("30", "Thirty");
		year2.put("40", "Forty");
		year2.put("50", "Fifty");
		year2.put("60", "Sixty");
		year2.put("70", "Seventy");
		year2.put("80", "Eighty");
		year2.put("90", "Ninety");
                                  year2.put("91", "NinetyOne");year2.put("92", "NinetyTwo");
                               year2.put("93", "NinetyThree");
                           year2.put("94", "NinetyFour");
                             year2.put("95", "NinetyFive");
                          year2.put("96", "NinetySix");
                          year2.put("97", "NinetySeven");
                          year2.put("98", "NinetyEight");
                          year2.put("99", "NinetyNine");
	}

	public static String convert(String dateInput) {
		String d = dateInput.substring(0, 2);
		String m = dateInput.substring(3, 5);
		String y1 = dateInput.substring(6, 8);
		String y2= dateInput.substring(8, 10);
		return date.get(d) + " " + month.get(m) + " " + year1.get(y1) + " " + year2.get(y2);
	}

	public static void main(String args[]) {

		input();
                                   String c;
                             Scanner sc=new Scanner(System.in);
                              c=sc.next();
		System.out.println(c);
		System.out.println(convert(c));


	}
}
