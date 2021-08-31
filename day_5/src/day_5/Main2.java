package day_5;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		Delivery delivery=new Delivery();
		Scanner sc=new Scanner(System.in);
		Long longover=(long) sc.nextInt();
		Long longball=(long)sc.nextInt();
		Long longruns=(long)sc.nextInt();
		String batsman=sc.next();
		String bowler=sc.next();
		String nonstriker=sc.next();
		delivery.setlongover(longover);
	    delivery.setlongball(longball);
		delivery.setlongruns(longruns);
		delivery.setbatsman(batsman);
		delivery.setbowler(bowler);
		delivery.setnonstriker(nonstriker);
		System.out.println(" details:");
		System.out.println(" over :"+delivery.longover());
		System.out.println(" ball :"+delivery.longball());
		System.out.println(" runs:"+delivery.longruns());
		System.out.println(" batsman :"+delivery.getbatsman());
		System.out.println(" bowler :"+delivery.getbowler());
		System.out.println(" nonstriker :"+delivery.getnonstriker());



	}

}
