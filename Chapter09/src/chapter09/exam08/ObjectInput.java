package chapter09.exam08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Map;

public class ObjectInput {

	public static void main(String[] args) throws Exception {
      // 경로설정 + 주스트림
      FileInputStream fis = new FileInputStream("C:\\img\\temp\\obj.dat");
      BufferedInputStream bis = new BufferedInputStream(fis);
      ObjectInputStream ois = new ObjectInputStream(bis);
      
      // 보조스트림
      
      // 가져오기
      // map
      Map<String, String> map = (Map<String, String>) ois.readObject();
      System.out.println(map);
      // array
      int[] scores = (int[]) ois.readObject();
      System.out.println(Arrays.toString(scores));
      // string
      String msg = ois.readUTF();
      System.out.println(msg);
      // sample
      Sample sample = (Sample) ois.readObject();
      System.out.println("team : "+sample.team);
      System.out.println(sample.method());      
      
      // 자원 반납
      ois.close();

   }

}



