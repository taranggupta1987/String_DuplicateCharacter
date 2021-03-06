package string;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacter {
	
	Map<Character,Integer> map = new HashMap<Character,Integer>();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Statement : ");
		String str = s.nextLine();
		
		
		DuplicateCharacter count = new DuplicateCharacter();
		
		System.out.print("Duplicate character :");
		count.checkDuplicate(str);
		
	}
	
	void checkDuplicate(String str){
		getIterator(str);
	}
	
	void getIterator(String str){
		char ch = str.charAt(0);
		
		int i = map.getOrDefault(ch, -1);
		
		if(i == -1){
			map.put(ch, 1);
		}else{
			if(ch!=' ')
				System.out.print(ch+" ");
		}

		str = str.substring(1);
		
		if(!str.equals(""))
			getIterator(str);
		
	}
}
