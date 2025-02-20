package datastr;

public class MyList {

	//mainīgie
	private char[] list;
	private final int DEFAULT_SIZE = 7;
	private int size = DEFAULT_SIZE;
	private int counter = 0;
	
	//noklusētais konstruktors
	public MyList() {
		list = new char[size];
	}
	
	//argumenta konstruktors
	public MyList(int inputSize) {
		if(inputSize > 0) {
			size = inputSize;
		}
		list = new char[size];		
	}
	
	private boolean isFull() {
		//garais if pieraksts ar pārbaudi
		/*if(size == counter) {
			return true;
		}
		else
		{
			return false;
		}
		*/
		
		//īsais if pieraksts ar pārbaudi
		//return (size == counter) ? true : false;
		
		//pavisam īsa forma, ja ir true vai false
		return (size == counter);
	}
	
	private boolean isEmpty()
	{
		//garais if pieraksts ar pārbaudi
		/*if(counter == 0) {
			return true;
		}
		else
		{
			return false;
		}*/
		
		//īsais if pieraksts ar pārbaudi
		//return (counter == 0) ? true : false;
		
		//pavisam īsa forma, ja ir true vai false
		return (counter == 0);
	}
	
	public int lenght()
	{
		return counter;
	}
	
	
	private void resize() {
		if(size < 100)
		{
			size = size * 2;
		}
		else
		{
			size = (int)(size * 1.5); //135.7 -> 135
		}
		
		char[] listNew = new char[size];
		
		for(int i = 0 ; i < counter; i++) {
			listNew[i] = list[i];	
		}
		
		//nomainam referenci uz jauno masivu
		list = listNew;
		//garbage collector, izdzes ieprieksejo list masivu
		System.gc();
			
	}
	
	public void add(char element) {
		if(isFull()) {
			resize();
		}
		list[counter++] = element;
		//vai 
		//list[counter] = element;
		//counter++
	}
	public void add(char element, int index) throws Exception {
		if(index < 0 || index > counter) {
			//Exception myExc = new Exception("The index is not excepted");
			//throw myExc;
			//vai 
			throw new Exception("The index is not excepted");
		}
		if(isFull()) {
				resize();
		}
		
		for(int i = counter; i > index; i--) {
			list[i] = list[i-1];
		}
		list[index] = element;
		counter++;
	}
	public void remove(int index) throws Exception {
		if(isEmpty()) {
			throw new Exception("The list is empty");
		}
		if(index < 0 || index >= counter) {
				throw new Exception("The index is not excepted");
		}
		for(int i = index; i < counter-1; i++) {
			list[i] = list[i+1];
		}
		counter--;
		list[counter]= ' ';
	}
	public char get(int index) throws Exception {
		if(isEmpty()) {
			throw new Exception("The list is empty");
		}
		if(index < 0 || index >= counter) {
			throw new Exception("The index is not excepted");
		}
		return list[index];
	}
	public int[] searchElement(char element) throws Exception {
		if(isEmpty()) {
			throw new Exception("The list is empty");
		}
		int skaititajs = 0;
		for(int i = 0; i < counter; i++) {
			if(list[i] == element) {
				skaititajs++;
			}
		}
		if(skaititajs == 0) {
			throw new Exception("Element not found");
		}
		int[] indexes = new int[skaititajs];
		int counterForIndexes = 0;
		for(int i = 0; i < counter; i++) {
			if(list[i] == element) {
				indexes[counterForIndexes] = i;
				counterForIndexes++;
			}
		}
		return indexes;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
