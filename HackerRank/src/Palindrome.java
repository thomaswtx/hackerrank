import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Palindrome {
	
	public static boolean palindromeCheck(String palindrome) {
		
		String newString = palindrome.trim();
		newString = newString.toLowerCase();
		
		Map<Character, Integer> charMap	= new HashMap<Character, Integer>();
		
		for(int i = 0; i < newString.length(); i++) {		
			charMap.put(newString.charAt(i), charMap.getOrDefault(newString.charAt(i), 0) + 1);
		}
		
		int count = 0;
		
		for(char key : charMap.keySet()) {
			count += charMap.get(key) % 2;
		}
		
		return count <= 1;
	}
	
	public static void main(String[] args) {
		
		List<String> palindromeList = new ArrayList<String>();
		
		palindromeList.add("Anna");
		palindromeList.add("Civic");
		palindromeList.add("Nnaa");
		palindromeList.add("Kaya");
		palindromeList.add("Kayak");
		palindromeList.add(" yaakk ");
		palindromeList.add("Madam");
		palindromeList.add("Thomas");
		palindromeList.add("Person");
		palindromeList.add(" erson ");
		palindromeList.add(" erson ");
		palindromeList.add("Repaper");
		
		for(String str : palindromeList) {
			
			System.out.println("Palindrome: " + str + (palindromeCheck(str) ? " Yes" : " No"));
		}
	}
}
