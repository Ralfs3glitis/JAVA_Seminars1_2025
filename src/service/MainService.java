package service;
import java.util.Arrays;

import datastr.MyList;

public class MainService {


	public static void main(String[] args) {
		MyList<Character> listForChar = new MyList<Character>(3);
		listForChar.add('a');
		listForChar.add('b');
		listForChar.add('c');
		listForChar.add('d'); // a b c d
		try {
			listForChar.print();
			listForChar.add('Z', 1); //a Z b c d
			listForChar.print(); 
			
			listForChar.remove(0);
			listForChar.print();
			
			System.out.println(listForChar.get(1)); // b
			listForChar.add('c');
			System.out.println(Arrays.toString(listForChar.searchElement('c'))); // [2, 4]
			
			listForChar.sort();
			listForChar.print(); //b c c d Z
			System.out.println(listForChar.return_next('b')); // Z
			listForChar.makeEmpty();
			listForChar.print(); // tukss
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("adding t");
		listForChar.add('t');
		try {
			listForChar.print();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("-----------------------------------Integer------------------------------------");
		
		MyList<Integer> listForInt = new MyList<Integer>(3);
		listForInt.add(2);
		listForInt.add(4);
		listForInt.add(10);
		listForInt.add(5);
		try {
			listForInt.print();
			listForInt.add(100, 1); 
			listForInt.print(); // 2 100 4 10 5
			
			listForInt.remove(0);
			listForInt.print(); // 100 4 10 5
			
			System.out.println(listForInt.get(1));
			listForInt.add(4);
			System.out.println(Arrays.toString(listForInt.searchElement(4)));
			
			listForInt.sort();
			listForInt.print(); //b c c d Z
			System.out.println(listForInt.return_next(4)); 
			listForInt.makeEmpty();
			listForInt.print(); // tukss
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("adding 6");
		listForInt.add(6);
		try {
			listForInt.print();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
