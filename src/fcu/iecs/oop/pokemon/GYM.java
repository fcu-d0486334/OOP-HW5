package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1,Pokemon p2){
		int p=(int)(Math.random()*2);
		if(p==1){
			System.out.println("Winner is " +p1);
			p1.setCp(300);
		}
		else{
			System.out.println("Winner is " +p2);
			p2.setCp(300);
		}
	}
}
