package applicationTr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetandPutCorrect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDouble = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDouble, myObjs);
		printList(myObjs);
	}
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number n : source) {
			destiny.add(n);
		}//
		
	}
	
	//Imprimindo lista qualquer
	
		public static void printList(List<?> list) {
			for (Object l : list) {
				System.out.print(l + " ");
			
			}
			System.out.println();
		}
}
