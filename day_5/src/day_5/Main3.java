package day_5;
import java.util.*;
public class Main3 {

	public static void main(String[] args) {
		Innings innings=new Innings();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the innings number");
		String number=sc.next();
		System.out.println("Enter the batting team");
		String battingteam=sc.next();
		System.out.println("Enter the runs scored");
		long runs=sc.nextLong();
		innings.setNumber(number);
		innings.setBattingteam(battingteam);
		innings.setRuns(runs);
		System.out.println("Innings Details:");
		System.out.println("Innings number :"+innings.getNumber());
		System.out.println("Batting Team :"+innings.getBattingteam());
		System.out.println("Runs Scored :"+innings.getRuns());

	}

}
