package com.Aixtor.Training.Java.Krish_Moradiya.Collection_Framework.List;
import java.util.*;
class ArrayListOperations{
	List<Object> l = new ArrayList<Object>();
	public boolean insert(int element) {
		return l.add(element);
	}
	public void showData() {
		System.out.println(l);
	}
	public List<Object> getObject(){
		return l;
	}
	public void update(int old,int newValue){
		int index = l.indexOf(old);
		l.set(index,newValue);
	}
	public Object delete(int number){
		int index = l.indexOf(number);
		return l.remove(index);
	}
	public int getIndex(int number){
		return l.indexOf(number);
	}
	public int getNumber(int index){
		return (Integer)l.get(index);
	}
}
class ArrayList_Crud {
	public static void main(String[] args) {
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		List<Object> lst = new ArrayListOperations().getObject();
		ArrayListOperations arrayOperation = new ArrayListOperations();
		
		do {
			System.out.println("1. Insert element");
			System.out.println("2. Read all element");
			System.out.println("3. Update element");
			System.out.println("4. Delete element");
			System.out.println("5. Search index by Value");
			System.out.println("6. Search Value by index");
			System.out.println("7. Exit");
			
			System.out.println("Enter your choice...");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					{
						System.out.println("Enter number which you want to insert..");
						int num = sc.nextInt();
						arrayOperation.insert(num);
					}
					break;
				case 2:
						arrayOperation.showData();
					break;
				case 3:
					{
						System.out.println("Enter old number..");
						int oldValue = sc.nextInt();
						System.out.println("Enter new number..");
						int newValue = sc.nextInt();
						arrayOperation.update(oldValue,newValue);
					}
					break;
				case 4:
					{
						System.out.println("Enter number which you want to delete..");
						int num = sc.nextInt();
						arrayOperation.delete(num);
					}
					break;
				case 5:
					{
						System.out.println("Get index number by enter number...");
						int num = sc.nextInt();
						int index = arrayOperation.getIndex(num);
						System.out.println("index is: "+index);
					}
					break;
				case 6:
					{
						System.out.println("Get Value by enter index...");
						int index = sc.nextInt();
						int value = Integer.valueOf(arrayOperation.getNumber(index));
						System.out.println("value is: "+value);
					}
					break;
				default:
					System.out.println("Sorry Wrong choice...");
			}
		}while(ch<=6);
	}
}
