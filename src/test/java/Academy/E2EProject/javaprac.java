package Academy.E2EProject;

import java.util.ArrayList;

public class javaprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i :arr) {
			int num = i;
			if(i % 2 == 0)
			System.out.println(i);
		}
		*/
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Apple");
		a.add("2");
		a.add("Ball");
		a.add("3");		
		System.out.println(a.get(0)); 
		for (String b:a) {
			System.out.println(b);
		}
	}

}
