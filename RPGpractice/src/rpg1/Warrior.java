package rpg1;

public class Warrior extends Character{
	public Warrior() {
		super(1000,50,50);
		name = "Leon";
	}
	
	@Override
	public void Skill1() {
		// TODO Auto-generated method stub
		System.out.println("Warrior Activate 'Rage'");
		this.hp -=50;
		this.atk += 50;
	}
	
	@Override
	public void skill2(Character enemy) {
		System.out.printf("Warrior Activates 'Jump Slash' to %s\n",enemy.getName());
		enemy.hp -= 150;
	}
	
	public void ultimate(Character enemy) {
		System.out.printf("Warrior Activates 'Dead Slash' to %s\n",enemy.getName());
		this.hp -= 200;
		enemy.hp -= this.atk * 4;
	}
}
