package kr.co.training;

public class CharacterAbility {
//	 1. 힘(str), 민첩(dex), 지력(knowledge)
//     - 기본값 : 0
	private int str = 0;
	private int dex = 0;
	private int knowledge = 0;

	public void setStr(int str) {
		this.str = str;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public void setKnowLedge(int knowledge) {
		this.knowledge = knowledge;
	}

	public int getStr() {
		return str;
	}

	public int getDex() {
		return dex;
	}

	public int getKnowLedge() {
		return knowledge;
	}

//  2. 레벨(level)
//     - 기본값 : 1
	private int level = 1;

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

//  3. 경험치(experience)
//     - 기본값 : 0
//     - 특징 : 경험치가 100 이상이 될 경우 레벨이 1 증가하고 경험치는 0으로 초기화됩니다.
	private int experience = 0;

	public void setExperience(int experience) {
		if (this.experience >= 100) {
			level++;
			unusedStatus += 5;
			this.experience = 0;
		}
		this.experience = experience;

	}

	public int getExperience() {
		return experience;
	}

//  4. 체력(hp), 마력(mp)
//     - 기본값 : 100
//     - 특징 : 레벨업을 해도 회복되지 않습니다.
//                  포션을 사용해도 최대 100까지만 회복됩니다.
	private int hp = 100;
	private int mp = 100;

	public void setHp(int hp) {
		if (hp >= 100) {
			this.hp = 100;
		}
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setMp(int mp) {
		if (mp >= 100) {
			this.mp = 100;
		}
		this.mp = mp;
	}

	public int getMp() {
		return mp;
	}

//  5. 잔여 스텟(unusedStatus)
//     - 기본값 : 0
//     - 특징 : 레벨업을 하면 5가 추가됩니다.
	private int unusedStatus = 0;

	public void setUnUsedStatus(int unusedStatus) {

		this.unusedStatus = unusedStatus;
	}

	public int getUnUsedStatus() {
		return unusedStatus;
	}

//  6. 소지중인 체력 포션(hpPortionCount), 마력 포션(hpPortionCount)
//     - 기본값 : 10
	private int hpPotionCount = 10;
	private int mpPotionCount = 10;

	public void setHpPotionCount(int hpPotionCount) {
		this.hpPotionCount = hpPotionCount;
	}

	public int getHpPotionCount() {
		return hpPotionCount;
	}

	public void setMpPotionCount(int mpPotionCount) {
		this.mpPotionCount = mpPotionCount;
	}

	public int getMpPotionCount() {
		return mpPotionCount;
	}
}
