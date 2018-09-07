package pruebas;
import listas.*;
import geo.*;

public class principal {
	
	public static void prueba(int a,boolean pass) {
		if (a<3 && pass!=true) {
			System.out.println(a);
			prueba(a+1,true);
		}
		System.out.println("fin");
	}
	
	
	
	public static void main(String[] args) {
		List l1=new List();
		/*Matriz M1=new Matriz(6,6);
		Matriz M2=new Matriz(2,2);
		Linea lia=new Linea(0,1,1,0,M2);
		Linea li1=new Linea(0,1,1,0,M1);
		Linea li2=new Linea(1,0,1,2,M1);
		Linea li3=new Linea(1,2,0,1,M1);
		Linea li4=new Linea(1,2,1,3,M1);
		M1.show2();
		M1.recorrer(l1,1,2,0,lia);*/
		l1.insert(4);
		l1.insert(2);
		l1.insert(2);
		l1.print();
		l1.extract_o(2);
		l1.print();
		
	}
}
