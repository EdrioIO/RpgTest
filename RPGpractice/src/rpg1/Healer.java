package rpg1;

public class Healer extends Character{
	
	public Healer() {
		super(500,65,30);
		name = "Lotte";
	}
	
	
	
	@Override
	public void Skill1() {
		// TODO Auto-generated method stub
		System.out.println("Healer Activate 'Protection' ");
		this.hp += 50;
		this.def += 10;
	}
	
	@Override
	public void skill2(Character enemy) {
		System.out.printf("Priest Activate 'Life Drain' to %s\n",enemy.getName());
		this.hp += 80;
		enemy.hp -= 75;
	}
	
	public void ultimate() {
		System.out.println("Priest Activate 'Reseruction'");
		this.hp += 350;
		this.def += 15;
	}
}
