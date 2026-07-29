package example;

public class Character {
    /*
	 * 과제 목적: 상속(Inheritance), 
	 * 메서드 오버라이딩(Overriding), 
	 */
	/*
	 * if, switch, instanceof 사용 금지 반드시
	 * 오버라이딩과 다형성으로 구현할 것 출력 결과 형식은 예시와 동일해야 한다.
	 */
	/*
	 * 게임에는 여러 종류의 캐릭터가 존재하며, 각 캐릭터는 서로 다른 공격 방식을 가진다. 부모 클래스 Character를 만들고, 이를
	 * 상속받는 자식 클래스들을 통해 같은 메서드 호출로 서로 다른 결과가 출력되도록 구현하시오.
	 */
	/*
	 * 구현 요구사항
	 * Character 클래스를 생성하시오.
	 * attack(int power) 메서드를 정의하시오.
	 * 반환형은 int
	 * 기본 반환값은 -1로 설정하시오.
	 * Character 클래스를 상속받는 Warrior 클래스를 생성하시오.
	 * attack() 메서드를 오버라이딩하시오.
	 * 공격력 계산식: power * 2
	 * Character 클래스를 상속받는 Mage 클래스를 생성하시오.
	 * attack() 메서드를 오버라이딩하시오.
	 * 공격력 계산식: power * 3
	 * Main 클래스에서 다음 조건을 만족하도록 구현하시오.
	 * 사용자로부터 기본 공격력을 입력받는다.
	 * Character 타입 배열에 Warrior, Mage 객체를 저장한다.
	 * for문을 이용하여 캐릭터별 공격력을 출력한다.
	 * 클래스 이름은 getClass().getSimpleName()으로 출력한다.
	 */
    
    // private String Warrior;
	// private String Mage;
	
	// public Character(String warrior, String mage) {
	// 	Warrior = warrior;
	// 	Mage = mage;
	// }

	// int power;
	// public int attack() {
	// 	return -1;
	// }

	// Character String Warrior = attack();

	public int attack(int power) {
		return -1;
	}

	



}//class
