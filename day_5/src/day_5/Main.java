package day_5;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Player player=new Player();
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String country=sc.next();
		String skill=sc.next();
		player.setname(name);
		player.setcountry(country);
		player.setskill(skill);
		System.out.println("Player details:");
		System.out.println("playername :"+player.getname());
		System.out.println("playercountry :"+player.getcountry());
		System.out.println("playerskill :"+player.getskill());

	}

}
