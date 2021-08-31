package day_5;
import java.util.*;
public class Player1 {
	String name;
	String country;
	String skill;
	public Player1(String name,String country,String skill)
	{
		this.name=name;
		this.country=country;
		this.skill=skill;
	}
	public void display()
	{
		System.out.println("name:," +name +"country:,"  +country +"skill:"+skill);
		
	}

}
