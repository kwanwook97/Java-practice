package test.ex03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
	
	public int solution(int []a, int []b){
        int answer = 0;
        
        /* Arrays.sort()�� ����� ���.        
        Arrays.sort()�� ������ �����Ų��. (1.45 ~ 2.05ms)               
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i=0; i<a.length; i++) {
        	answer += a[i] * b[(a.length-1)-i];
        }
        */
        
        // =======================================================
        // priority Queue�� ����� ���.
        // ȿ���� �������.       
        PriorityQueue<Integer> asc = new PriorityQueue<Integer>(); // �������� ����
        PriorityQueue<Integer> desc = new PriorityQueue<Integer>(Comparator.reverseOrder()); // �������� ����
        for(int i=0; i<a.length; i++) {
        	asc.add(a[i]);
        	desc.add(b[i]);
        }        
        
        for(int i=0; i<b.length; i++) {
        	answer += asc.poll() * desc.poll();
        }                
        
        return answer;
    }

}
