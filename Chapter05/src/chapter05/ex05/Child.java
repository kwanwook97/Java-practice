package chapter05.ex05;

import chapter05.ex03.KeyEvent;
import chapter05.ex03.MouseEvent;

public interface Child extends KeyEvent, MouseEvent {
	
	public void textField(String text);
	public void selectOne();
	public void checkOne();

}