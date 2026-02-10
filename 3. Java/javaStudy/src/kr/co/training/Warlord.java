package kr.co.training;

public class Warlord implements Character {

	CharacterAbility ca;
	MonsterAbility ma;
//	1. 워로드는 객체 생성 시 기본 스탯을 갖습니다.
//    - 힘 30
//    - 덱스 17
//    - 지력 10
	public Warlord(CharacterAbility ca, MonsterAbility ma) {
		this.ca = ca;
		ca.setStr(30);
		ca.setDex(17);
		ca.setKnowLedge(10);
		
		this.ma = ma;
	}

//
	@Override
	public void attack() {
//  2. 기본 공격 attack 메서드
//    ------- 케릭터 공격 차례
//    - 마력이 6 미만이라면 기본 공격 사용 불가 ("마력이 부족해 공격할 수 없습니다" 출력)
//    - "몬스터가 OO의 피해를 입었습니다!" 출력    
//    - 몬스터가 케릭터 힘*1.3 만큼의 체력이 깍입니다.
//    - 케릭터의 마력 6 감소
		if (ca.getMp() < 6) {
			System.out.println("마력이 부족해 공격할 수 없습니다.");
			return;
		} else {
			System.out.println(ma.getMonster() + ca.getStr() * 1.3 + "의  피해를 입었습니다!");
			ca.setMp(ca.getMp() - 6);
			ma.setHp(ma.getHp() - (ca.getStr() * 1.3));
//		    ------- 케릭터 공격 차례(몬스터 처치 시)
//		    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//		    - 케릭터의 경험치 13 증가
			if (ma.getHp() <= 0) {
				System.out.println(ma.getMonster() + " 사냥을 성공하셨습니다.");
				ca.setExperience(ca.getExperience() + 13);
				ma.setHp(100);
			} else {
//			    ------- 몬스터 공격
//			    - "몬스터가 공격했습니다!" 출력    
//			    - "케릭터가 OO의 피해를 입었습니다!" 출력
//			    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.		
				System.out.println(ma.getMonster() + "가 공격했습니다!");
				System.out.println("캐릭터가 " + ma.getDamage() + "의 피해를 입습니다!");
				ca.setHp(ca.getHp() - ma.getDamage());
				if (ca.getHp() <= 0) {
//				    ------- 몬스터 공격(케릭터 사망 시)
//				    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//				    > 경험치가 30 감소합니다.
					ca.setHp(70);
					ca.setMp(70);
					ca.setExperience(ca.getExperience() - 30);
				}
			}
		}
	}

//  3. 힘 스킬 strSkill 메서드
	@Override
	public void strSkill() {
//	    ------- 케릭터 공격 차례
//	    - 마력이 15 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다." 출력)
//	    - "몬스터가 힘 스킬로 인해 OO의 피해를 입었습니다!" 출력
//	    - 몬스터가 힘*1.8 만큼의 체력이 깍입니다.
//	    - 케릭터의 마력 15 감소
		if (ca.getMp() < 15) {
			System.out.println("마력이 부족해 스킬을 사용할 수 없습니다.");
		} else {
			System.out.println(ma.getMonster() + "가 힘 스킬로 인해 " + ca.getStr() * 1.8 + "의 피해를 입었습니다.");
			ma.setHp(ma.getHp() - (ca.getStr() * 1.8));
			ca.setMp(ca.getMp() - 15);
			if (ma.getHp() <= 0) {
				// ------- 케릭터 공격 차례(몬스터 처치 시)
//			    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//			    - 케릭터의 경험치 13 증가
				System.out.println(ma.getMonster() + " 사냥을 성공하셨습니다.");
				ca.setExperience(ca.getExperience() + 13);
				ma.setHp(100);
			} else {
//			    ------- 몬스터 공격
//			    - "몬스터가 공격했습니다!" 출력    
//			    - "케릭터가 OO의 피해를 입었습니다!" 출력
//			    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
				System.out.println(ma.getMonster() + "가 공격했습니다!");
				System.out.println("캐릭터가 " + ma.getDamage() + "의 피해를 입었습니다.");
				ca.setHp(ca.getHp() - ma.getDamage());
				if (ca.getHp() <= 0) {
//				    ------- 몬스터 공격(케릭터 사망 시)
//				    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//				    > 경험치가 30 감소합니다.
					ca.setHp(70);
					ca.setMp(70);
					ca.setExperience(ca.getExperience() - 30);
				}
			}
		}
	}

//  4. 민첩 스킬 dexSkill 메서드
//    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//               즉, 서로 한 번씩 돌아가며 공격합니다.
//
//    ------- 케릭터 공격 차례
//    - 마력이 19 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다." 출력)
//    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다. 

//    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다.

//    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다. (총 3회 공격)
//    - 케릭터의 마력 19 감소
//
//   ------- 케릭터 공격 차례(몬스터 처치 시)
//    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//    - 케릭터의 경험치 13 증가
//
//    ------- 몬스터 공격
//    - "몬스터가 공격했습니다!" 출력    
//    - "케릭터가 OO의 피해를 입었습니다!" 출력
//    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
//
//    ------- 몬스터 공격(케릭터 사망 시)
//    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//    > 경험치가 30 감소합니다.
	@Override
	public void dexSkill() {
		if (ca.getMp() < 19) {
			System.out.println("마력이 부족해 스킬을 사용할 수 없습니다.");
		} else {
			System.out.println(ma.getMonster() + "가 민첩 스킬로 인해 " + ca.getDex() * 0.7 + "의 피해를 입었습니다.!");
			ma.setHp(ma.getHp() - (ca.getDex() * 0.7));
			System.out.println(ma.getMonster() + "가 민첩 스킬로 인해 " + ca.getDex() * 0.7 + "의 피해를 입었습니다.!");
			ma.setHp(ma.getHp() - (ca.getDex() * 0.7));
			System.out.println(ma.getMonster() + "가 민첩 스킬로 인해 " + ca.getDex() * 0.7 + "의 피해를 입었습니다.!");
			ma.setHp(ma.getHp() - (ca.getDex() * 0.7));
			ca.setMp(ca.getMp() - 19);
			if (ma.getHp() <= 0) {
				System.out.println(ma.getMonster() + " 사냥을 성공하셨습니다.");
				ca.setExperience(ca.getExperience() + 13);
				ma.setHp(100);
			} else {
				System.out.println(ma.getMonster() + "가 공격했습니다!");
				System.out.println("캐릭터가 " + ma.getDamage() + "의 피해를 입었습니다.");
				ca.setHp(ca.getHp() - ma.getDamage());
				if (ca.getHp() <= 0) {
					ca.setHp(70);
					ca.setMp(70);
					ca.setExperience(ca.getExperience() - 30);
				}
			}
		}
	}
//  5. 지력 스킬 knowledgeSkill 메서드
//    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//               즉, 서로 한 번씩 돌아가며 공격합니다.
//
//    ------- 케릭터 공격 차례
//    - 마력이 28 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다." 출력)
//    - "몬스터가 지력 스킬로 인해 OO의 피해를 입었습니다!" 출력
//    - 몬스터가 지력*3.6 만큼의 체력이 깍입니다.
//    - 케릭터의 마력 28 감소
//
//   ------- 케릭터 공격 차례(몬스터 처치 시)
//    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//    - 케릭터의 경험치 13 증가
//
//    ------- 몬스터 공격
//    - "몬스터가 공격했습니다!" 출력    
//    - "케릭터가 OO의 피해를 입었습니다!" 출력
//    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
//
//    ------- 몬스터 공격(케릭터 사망 시)
//    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//    > 경험치가 30 감소합니다.

	@Override
	public void knowledgeSkill() {
		if (ca.getMp() < 28) {
			System.out.println("마력이 부족해 스킬을 사용할 수 없습니다.");
		} else {
			System.out.println(ma.getMonster() + "가 지력 스킬로 인해 " + ca.getKnowLedge() * 3.6 + "의 피해를 입었습니다!");
			ma.setHp(ma.getHp() - (ca.getKnowLedge() * 3.6));
			ca.setMp(ca.getMp() - 28);
			if (ma.getHp() <= 0) {
				System.out.println(ma.getMonster() + " 사냥을 성공하셨습니다.");
				ca.setExperience(ca.getExperience() + 13);
				ma.setHp(100);
			} else {
				System.out.println(ma.getMonster() + "가 공격했습니다!");
				System.out.println("캐릭터가 " + ma.getDamage() + "만큼의 피해를 입었습니다!");
				ca.setHp(ca.getHp() - ma.getDamage());
				if (ca.getHp() <= 0) {
					ca.setHp(70);
					ca.setMp(70);
					ca.setExperience(ca.getExperience() - 30);
				}
			}
		}
	}

}
