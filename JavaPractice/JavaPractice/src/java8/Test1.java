package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.consumer;

class MyConsumer implements Consumer<Integer>{
	
	@Override
	public void aceept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}
	
public class Test1 {

	public static void main(String[] args) {
		
	}
}
