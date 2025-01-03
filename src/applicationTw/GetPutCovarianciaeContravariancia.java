package applicationTw;

import java.util.ArrayList;
import java.util.List;

public class GetPutCovarianciaeContravariancia {

	// Covariancia
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> list = intList;
		Number x = list.get(0);
		/* list.add(20) ;  erro de compilacao pois o tipo number é um tipo 
		// um pouco genérico por isso n deixa adicionar, pois o tipo Number
		 tem Byte, long, Integer, Double e etc */
		
		// get - ok
		// put - ERRO
		
	// Contravariância
		
	List<Object> myObjs = new ArrayList<Object>();
	myObjs.add("Maria");
	myObjs.add("Ale");
	
	List<? super Number> myNums = myObjs; // Aqui a lista de number
	// está recendos os valores da lista de Object
	// isso funciona por conta do super, pois o number está permitindo
	// alem de valores tipos number, os valores da classe super( que é sua classe mae)
	//  a classe object
	
	
	// Nesse caso acima, eu consigo adicionar valores tipo number abaixo
	myNums.add(10);
	myNums.add(3.14);
	
	// Porém eu não consigo acesar os valores
	//Number x = myNums.get(0); // erro de compilacao, porque o tipo dessa lista
	// pode ser um tipo que seja um super tipo de number (da mae de number) que é o object
	// isso é a contravariancia
	
	// get - ERRO
	// put  - Ok
	
	}

}
