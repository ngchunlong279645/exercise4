package ArrayOneDimensional;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Welcome to our zombie killer program!!!!");
		
		String backpack[] = {"Shotgun","Assault Rifle","Sniper"};
		String zombie[] = {"Close-range zombie","Mid_range zombie","Long-range zombie"};
		int numbersZombiesHATE[] = {4,90,70,123,12,4,561,1};
		int zombiesNotHate[];
		zombiesNotHate = new int [4];
		zombiesNotHate[0]=1;
		zombiesNotHate[1]=2;
		zombiesNotHate[2]=99;
		zombiesNotHate[3]=66;
		
		System.out.println("Backpack items!");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);

		System.out.println("These are the zombies!");
		System.out.println(zombie[0]);
		System.out.println(zombie[1]);
		System.out.println(zombie[2]);
		
		System.out.println(numbersZombiesHATE[6]);
		

	}

}
