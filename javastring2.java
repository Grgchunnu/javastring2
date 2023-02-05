package one;

public class javastring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city = "pune";
		//String city2 = new String("nagpur");
		System.out.println(city);
		
		
		// 0  1  2  3
		// p  u  n  e
		
		for (int i = 0 ; i < 4; i++) {
			System.out.println(i);
			//i----0
			//i----1
			//i----2
			//i----3
			System.out.println(city.charAt(i));
			
		}
		 
		
		//for reverse
		for (int i = city.length()-1 ; i>=0; i--) {
			System.out.println(i);
			System.out.println(city.charAt(i));
		}
	 
		String country = "nepal";
		String rev = "";
		
		for (int i = 0 ; i < country.length(); i ++ ) {
			//System.out.println(i);
			System.out.println(country.charAt(i));
		
		rev= country.charAt(i) + rev;
				System.out.println(rev);
		//         "n"   + "" ==>n
		//         "e"   + "n"==>en
		//          "p"  +"en"==>pen
		//          "a"  +"pen"==>apen
		//          "l"   +"apen"==>lapen
		
		}
		
		
		System.out.println(rev);
	
		
		
		String city2="chitwan";
		String rev1= "";
		// c h i t w a n
		// 0 1 2 3 4 5 6
		for (int i= city2.length()-1; i >=0; i-- ) {
			//System.out.println(i);
			//System.out.println(city2.charAt(i));
			rev1 = rev1 + city2.charAt(i);
			
		}
		System.out.println(rev1);
		
		//Program4
		String fruits ="apple mango banana grapes papaya";
		String userInput ="mango";
		if (fruits.contains(userInput)) {
			System.out.println("fruit is available");
		}
		else {
			System.out.println("fruit not available");
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
