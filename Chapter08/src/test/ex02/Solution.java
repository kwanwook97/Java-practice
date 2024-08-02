package test.ex02;

import java.util.HashMap;

public class Solution {

    public long solution(String numbers) {
    	long answer = 0;
    	// zero~nine �� 10���ۿ� �ȵǹǷ� ������ ���̽��� ���� �� �ִ�.
    	// ���ڴ� �ϴ� ���ڿ� ���·κ��̰� ���߿� Long���·� ��ȯ�ؾ� �Ѵ�.    	  	    	    
    	
    	// ���1 : ���� �̿��ؼ� �ذ��ϴ� ���. (0.11 ~0.18ms)
    	HashMap<String, String> numberMap = getMap();
    	 
    	for (String key : numberMap.keySet()) {				
			numbers = numbers.replace(key, numberMap.get(key));			
		}
        
        // =====================================================            
    	// ���2 : �迭�̿� (0.10 ~ 0.16ms)
    	String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	for(int i=0; i<number.length; i++) {
    		numbers = numbers.replace(number[i], String.valueOf(i));
    	}
    	
    	answer = Long.parseLong(numbers);
    	return answer;
    }
    
    
    // �ڵ尡 ��� ������ �޼��带 �����Ͽ���.
    private HashMap<String, String> getMap(){		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("zero", "0");
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		map.put("four", "4");
		map.put("five", "5");
		map.put("six", "6");
		map.put("seven", "7");
		map.put("eight", "8");
		map.put("nine", "9");
		
		return map;    		
	}    
    
}
