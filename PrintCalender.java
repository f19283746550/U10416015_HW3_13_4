import java.util.*;
public class PrintCalender {
	public static void main(String[] args) {
		GregorianCalendar g = new GregorianCalendar();
		ArrayList<String> day=new ArrayList();
		Scanner input=new Scanner(System.in);
		System.out.println("Please input year(ex:2016).");
		int y=input.nextInt();//使用者輸入年份
		System.out.println("Please input month(ex:3).");
		int m=input.nextInt()-1;//使用者輸入月份，因系統從零開始計算，使用者輸入的數字對系統而言會加一(ex:輸入一月跑出二月)，故減一
		g.set(y,m,g.get(Calendar.DATE));//設定程使用者期望的年月
		System.out.println(g.getTime());
		System.out.print("       ");//格式好看別介意
		switch (g.get(GregorianCalendar.MONTH)) {//因為他從零開始，我也只好從零開始惹
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
		System.out.println("	"+g.get(GregorianCalendar.YEAR));//白白只為好看，別介意
		System.out.println("---------------------------");
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		g.set(y,m,31);//利用它超過就會跑到下個月的特性(ex:輸入4/31會變成5/1)，來計算這個月有幾天
		switch (g.get(Calendar.DATE)) {
			case 31:
				for(int i=1;i<=9;i++) {
					day.add("  "+Long.toString(i));
				}
				for(int i=10;i<=31;i++) {
				day.add(" "+Long.toString(i));
				}break;//因白白量不同，故分開寫
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
			case 2:for(int i=1;i<=1;i++){day.add(0,"   ");}break;//一個日期佔量須為三格(因為星期幾皆占三格)，這邊再多些白白來讓1號站在它該站的位子
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
				}//list的get(int)從零開始，size()從一開始，故擺前面
				System.out.print(day.get(i));
				System.out.print(" ");
				i++;
			}
			System.out.println();
		}
	}
}
