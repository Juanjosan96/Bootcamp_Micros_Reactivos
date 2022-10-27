package Taller1;

import java.util.List;

public class imperativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		int count=0;
			for(int number :numbers) {
				if(number>10) {
					count+=1;
				}
					}	
	System.out.println(count);
	}

}
