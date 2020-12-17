package ArrayOneDimensional;

public class exercise2 {

	public static void main(String[] args) {
		//write a statement that declare a string initialize with the following string : 
		// sunday monday tuesay wednesday thusday friday saturday
		// write a loop that display the content of each element in the array you declare
		
		String[] days = {"sunday", "monday", "tuesay", "wednesday", "thusday", "friday", "saturday"};
//for
		for(int i=0;i<days.length;i++) {
			System.out.println(days[i]);
		}
		System.out.println();
		
//while		
		int j=0;
		while(j<days.length) {
			System.out.println(days[j]);
			j++;
		}
		System.out.println();

//dowhile
		int z=0;
		do {System.out.println(days[z]);
			z++;
		}while(z<days.length);
		
		
	}

}
