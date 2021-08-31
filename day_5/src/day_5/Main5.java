package day_5;
import java.util.*;
public class Main5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String country=sc.next();
		String skill=sc.next();
		Player1 obj=new Player1(name,country,skill);
		obj.display();
	}

}
