import java.util.*;

class SwitchDemo2{
	public static void main(String [] args){
		String taste;
		Scanner sc=new Scanner(System.in);
		System.out.println("What kind of taste you like ");
		taste=sc.next();

		switch(taste){
			case "sweet" : System.out.println("You can taste Icecream,Basundi,Pedha,GulabJamun");
				 break;

			case "spicy": System.out.println("You can Taste MisalPav.VadSamber,Thecha,PavBhaji,Tarri");
				 break;

			case "Saur" : System.out.println("You can taste Dahi,LimbuSarbat,Lassi");
				 break;

			default : System.out.println("Invalid Selection");
		}
	}
}