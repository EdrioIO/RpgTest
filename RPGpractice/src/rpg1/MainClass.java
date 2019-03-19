package rpg1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	ArrayList<Character> charList = new ArrayList<Character>();
	Scanner input = new Scanner(System.in);
	int choose = 0;
	
	void print() {
		for (Character character : charList) {
			System.out.println(character.toString());
		}
	}
	
	public MainClass() {
		Character Leon = new Warrior();
		Character Shiva = new Archer();
		Character Lotte = new Healer();
		charList.add(Leon);
		charList.add(Shiva);
		charList.add(Lotte);
		print();
		Leon.basicAttack(Shiva);
		print();
		Leon.Skill1();
		Shiva.Skill1();
		Lotte.Skill1();
		print();
		Leon.skill2(Shiva);
		Shiva.skill2(Lotte);
		Lotte.skill2(Leon);
		print();
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
		print();
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
		print();
		Leon.basicAttack(Shiva);
		print();
		Lotte.basicAttack(Shiva);
		print();		
		
	}
	
	
	public static void main(String args[]) {
		new MainClass();
	}
	
	
}
