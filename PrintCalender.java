import java.util.*;
public class PrintCalender {
	public static void main(String[] args) {
		GregorianCalendar g = new GregorianCalendar();
		ArrayList<String> day=new ArrayList();
		Scanner input=new Scanner(System.in);
		System.out.println("Please input year(ex:2016).");
		int y=input.nextInt();
		System.out.println("Please input month(ex:3).");
		int m=input.nextInt()-1;
		g.set(y,m,g.get(Calendar.DATE));
		System.out.println(g.getTime());
		System.out.print("       ");
		switch (g.get(GregorianCalendar.MONTH)) {
			case 0:System.out.print("January");break;
			case 1:System.out.print("February");break;
			case 2:System.out.print("March");break;
			case 3:System.out.print("April");break;
			case 4:System.out.print("May");break;
			case 5:System.out.print("June");break;
			case 6:System.out.print("July");break;
			case 7:System.out.print("August");break;
			case 8:System.out.print("September");break;
			case 9:System.out.print("October");break;
			case 10:System.out.print("November");break;
			case 11:System.out.print("December");break;
		}
		System.out.println("	"+g.get(GregorianCalendar.YEAR));
		System.out.println("---------------------------");
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		g.set(y,m,31);
		switch (g.get(Calendar.DATE)) {
			case 31:
				for(int i=1;i<=9;i++) {
					day.add("  "+Long.toString(i));
				}
				for(int i=10;i<=31;i++) {
				day.add(" "+Long.toString(i));
				}break;
			case 1:
				for(int i=1;i<=9;i++) {
					day.add("  "+Long.toString(i));
				}
				for(int i=10;i<=30;i++) {
					day.add(" "+Long.toString(i));
				}break;
			case 2:
				for(int i=1;i<=9;i++) {
					day.add("  "+Long.toString(i));
				}
				for(int i=10;i<=29;i++) {
					day.add(" "+Long.toString(i));
				}break;
			case 3:
				for(int i=1;i<=9;i++) {
					day.add("  "+Long.toString(i));
				}
				for(int i=10;i<=29;i++) {
					day.add(" "+Long.toString(i));
				}break;
		}
		g.set(y,m,1);
		switch(g.get(GregorianCalendar.DAY_OF_WEEK)) {
			case 1:break;
			case 2:for(int i=1;i<=1;i++){day.add(0,"   ");}break;
			case 3:for(int i=1;i<=2;i++){day.add(0,"   ");}break;
			case 4:for(int i=1;i<=3;i++){day.add(0,"   ");}break;
			case 5:for(int i=1;i<=4;i++){day.add(0,"   ");}break;
			case 6:for(int i=1;i<=5;i++){day.add(0,"   ");}break;
			case 7:for(int i=1;i<=6;i++){day.add(0,"   ");}break;
		}
		for(int i=0;i<day.size();) {
			for(int a=1;a<=7;a++) {
				if(i==day.size()) {
					break;
				}
				System.out.print(day.get(i));
				System.out.print(" ");
				i++;
			}
			System.out.println();
		}
	}
}
