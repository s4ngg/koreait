package kr.co.training;

public class MonsterAbility {
//	  1. 데미지(damage)
//	     - 기본값 : 5
	private int damage = 5;

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

//	  2. 체력(hp)
//	     - 기본값: 100
	public double hp = 100;

	public void setHp(double hp) {
		this.hp = hp;
	}

	public double getHp() {
		return hp;
	}

	
	// 몬스터 이름
	private String monster = "몬스터";
	
	public void setMonster(String monster) {
		this.monster = monster;
	}
	public String getMonster() {
		return monster;
	}
//	  3. getter/setter 작성
}
