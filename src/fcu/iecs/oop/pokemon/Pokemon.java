package fcu.iecs.oop.pokemon;

public class Pokemon {
	private final String name;
	private int cp;
	
	public Pokemon(String name,int cp){
		this.name=name;
		this.cp=cp;
	}
	public void getName(){
		System.out.println("Name=" +name);
	}
	public void getCp(){
		System.out.println("cp=" +cp);
	}
	public void setCp(int num){
		this.cp+=num;
	}
}
