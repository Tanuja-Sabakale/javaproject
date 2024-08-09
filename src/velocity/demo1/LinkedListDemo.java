package velocity.demo1;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<Integer> list=new LinkedList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	
	list.stream().forEach(x->System.out.println(x));
}
}
