package service;
import java.util.Arrays;

import datastr.MyList;

public class MainService {


	public static void main(String[] args) {
		MyList listForChar = new MyList(3);
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
	}
}
