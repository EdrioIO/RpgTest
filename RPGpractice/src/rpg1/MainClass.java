package rpg1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	ArrayList<Character> charList = new ArrayList<Character>();
	Scanner input = new Scanner(System.in);
	int choose = 0;
	
	void print(Character a, Character b, Character c) {
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString()); 
	}
	
	public MainClass() {
		Character Leon = new Warrior();
		Character Shiva = new Archer();
		Character Lotte = new Healer();
		charList.add(Leon);
		charList.add(Shiva);
		charList.add(Lotte);
		print(Leon,Shiva,Lotte);
		Leon.basicAttack(Shiva);
		print(Leon,Shiva,Lotte);
		Leon.Skill1();
		Shiva.Skill1();
		Lotte.Skill1();
		print(Leon,Shiva,Lotte);
		Leon.skill2(Shiva);
		Shiva.skill2(Lotte);
		Lotte.skill2(Leon);
		print(Leon,Shiva,Lotte);
		if(Leon instanceof Warrior) {
			Warrior d = (Warrior)Leon;
			d.ultimate(Shiva);
		}
		if(Shiva instanceof Archer) {
			Archer d = (Archer)Shiva;
			d.ultimate(Lotte);
		}
		if(Lotte instanceof Healer) {
			Healer d = (Healer)Lotte;
			d.ultimate();
		}
		print(Leon,Shiva,Lotte);
		if(Leon instanceof Warrior) {
			Warrior d = (Warrior)Leon;
			d.ultimate(Shiva);
		}
		if(Shiva instanceof Archer) {
			Archer d = (Archer)Shiva;
			d.ultimate(Lotte);
		}
		if(Lotte instanceof Healer) {
			Healer d = (Healer)Lotte;
			d.ultimate();
		}
		print(Leon,Shiva,Lotte);
		Leon.basicAttack(Shiva);
		print(Leon,Shiva,Lotte);
		Lotte.basicAttack(Shiva);
		print(Leon,Shiva,Lotte);
	}
	
	
	public static void main(String args[]) {
		new MainClass();
	}
	
	
}
