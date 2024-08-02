package test.ex01;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public String solution(String letter) {
		
		String answer = "";
				    				
		// 1. �� ��ȣ�� �������� ���еȴ�. -> �������� ����� �Ѵ�.
		String[] arr = letter.split(" ");						
		
		// �Է¹��� ���ڿ��� �������� �����Ͽ� �迭����. 0.13~0.21
		Map<String, String> morse = new HashMap<String, String>();
        morse.put(".-","a");
        morse.put("-...","b");
        morse.put("-.-.","c");
        morse.put("-..","d");
        morse.put(".","e");
        morse.put("..-.","f");
        morse.put("--.","g");
        morse.put("....","h");
        morse.put("..","i");
        morse.put(".---","j");
        morse.put("-.-","k");
        morse.put(".-..","l");
        morse.put("--","m");
        morse.put("-.","n");
        morse.put("---","o");
        morse.put(".--.","p");
        morse.put("--.-","q");
        morse.put(".-.","r");
        morse.put("...","s");
        morse.put("-","t");
        morse.put("..-","u");
        morse.put("...-","v");
        morse.put(".--","w");
        morse.put("-..-","x");
        morse.put("-.--","y");
        morse.put("--..","z");
		  
        StringBuilder sb = new StringBuilder();        
        
		for(String str : arr) {
			sb.append(morse.get(str));
		}
		
		answer = sb.toString();
				
		return answer;
	}
}
