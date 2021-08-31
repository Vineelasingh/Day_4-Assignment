package day_5;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		Venue venue=new Venue();
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String city=sc.next();
		venue.setname(name);
		venue.setcity(city);
		System.out.println("Venue details:");
		System.out.println("Venue name :"+venue.getname());
		System.out.println("city name :"+venue.getcity());

	}

}
