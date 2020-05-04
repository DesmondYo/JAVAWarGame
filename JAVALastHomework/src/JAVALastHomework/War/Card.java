package JAVALastHomework.War;

//1A.
public class Card {

	//I 1 & 2
	private int value;
	private String name;
	
	public Card(String name, int value) {
		this.setName(name);
		this.setValue(value);
	}

	//II1.
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//II2.
	public void describe() {
		System.out.println(name + " : " + value);
	}
	
}
