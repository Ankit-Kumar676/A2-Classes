package array_programs;

public class Vowel_char {

	public static void main(String[] args) {
		char[] a= {'a','b','e','i','j','o'};
		for(char x:a) {
			if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
				System.out.println(x);
		}
	}

}
