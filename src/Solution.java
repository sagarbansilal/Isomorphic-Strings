import java.util.HashMap;

/**
 * @author Sagar
 */

public class Solution {
	public static void main(String[] args) {
		String s1="football";
		String s2="cootpass";
		if(s1.length()!=s2.length()){
			System.out.println("not isomorphic");
			return;
		}
		HashMap<Character, Character> hm1=new HashMap<Character, Character>();
		HashMap<Character, Character> hm2=new HashMap<Character, Character>();
		for(int i=0;i<s1.length();i++){
			char ch1=s1.charAt(i);
			char ch2=s2.charAt(i);
			if(!hm1.containsKey(ch1) && !hm2.containsKey(ch2)){
				hm1.put(ch1, ch2);
				hm2.put(ch2, ch1);
			}else if(hm1.containsKey(ch1) && hm2.containsKey(ch2)){
				if(hm1.get(ch1)==ch2 && hm2.get(ch2)==ch1) continue;
				else {
					System.out.println("not isomorphic");
					return;
				}
			}else{
				System.out.println("not isomorphic");
				return;
			}
		}
		System.out.println("isomorphic");
	}
}
