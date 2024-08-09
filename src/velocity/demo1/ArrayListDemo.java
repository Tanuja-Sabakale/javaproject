package velocity.demo1;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList<String> al=new ArrayList<String>();
	al.add("Shayam");
	al.add("Mohan");
	al.add("Vinod");
	
	for(String s:al) {
		System.out.println(s);
	}
}
}
