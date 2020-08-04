package pokemon;

public class Pokemon {
	private int number;
	private String name;
	private int attack;
	private String type1;
	private String type2;

	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAttack(){
		return attack;
	}
	public void setAttack(int attack){
		this.attack = attack;
	}
	public String getType1(){
		return type1;
	}
	public void setType1(String type1){
		this.type1 = type1;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2){
		this.type2 = type2;
	}
}
