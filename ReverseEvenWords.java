package week2Day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] split1 = test.split("");
		System.out.println(split1);
		/*for(int i=0;i<split1.length;i++) {
			if(i%2!=0) {
				String[] split2 = test.split(" ");
				System.out.println(split2);
			}
			for(int j=split1.length-1;j>=0;j--) {
				if(j%2==0) {
					System.out.println(split1);
					
					}
			}
		}
*/
	}
}