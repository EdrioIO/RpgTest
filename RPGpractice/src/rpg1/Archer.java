package rpg1;

public class Archer extends Character{
	
	public Archer() {
		super(950,75,25);
		name = "Shiva";
	}
	
	@Override
	public void Skill1() {
		// TODO Auto-generated method stub
		System.out.println("Archer Activate 'Eagle Eye'");
		this.atk += 20;
		this.def += 20;
	}
	
	@Override
	public void skill2(Character enemy) {
		System.out.printf("Archer Activates 'Power Shot' to %s\n",enemy.getName());
		System.out.println("Enemy Stumbled");
		enemy.hp -= 100;
		enemy.def -= 10;
	}
	
	public void ultimate(Character enemy) {
		System.out.printf("Archer Activates 'Nature Shot' to %s\n",enemy.getName());
		this.hp += 50;
		enemy.hp -= 100 + (this.atk*4/3) ;
	}
}
