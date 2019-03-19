package rpg1;


public class Character {
	protected long hp;
	protected long atk;
	protected long def;
	protected String name;
	
	
	
	public String getName() {
		return name;
	}



	public Character() {
		hp = 0;
		atk = 0;
		def = 0;
	}
	
	
	
	public long getHp() {
		return hp;
	}



	public void setHp(long hp) {
		this.hp = hp;
	}



	public long getAtk() {
		return atk;
	}



	public void setAtk(long atk) {
		this.atk = atk;
	}



	public long getDef() {
		return def;
	}



	public void setDef(long def) {
		this.def = def;
	}
	
	public Character(long hp, long atk, long def) {
		super();
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}



	public void basicAttack(Character enemy) {
		long dmg = 0;
		System.out.printf("%s Attacked %s\n",this.name,enemy.name);
		// DMG CALCULATE
		if(enemy.def >= this.atk) {
			dmg = 0;
		}
		else {
			dmg = this.atk - enemy.def;
		}
		//DMG EXECUTE
		if(enemy.getHp() > dmg) {
			enemy.setHp(enemy.getHp() - dmg);
		}
		else {
			System.out.printf("%s is Dead\n",enemy.name);
			enemy.setHp(0);
			enemy.setDef(0);
			enemy.setAtk(0);
			enemy.setName("Corpse " + enemy.getName());
		}
			
	}
	
	public void Skill1() {
		
	}
	
	public void skill2(Character enemy) {
		
	}
	
	@Override
	public String toString() {
		
		return String.format("|Name : %-12s | HP : %-3d | ATK : %-3d | DEF : %-3d",name, hp,atk,def);
	}
	
	
}
