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
		/*List l1=new List();
		Matriz M1=new Matriz(6,6);
		Matriz M2=new Matriz(2,2);
		Linea lia=new Linea(0,1,1,0,M2);
		
		Linea li1=new Linea(0,0,1,0,M1);
		Linea li2=new Linea(1,0,1,1,M1);
		Linea li3=new Linea(1,1,0,0,M1);
		Linea li4=new Linea(0,1,0,0,M1);
		//Linea li5=new Linea(1,3,1,0,M1);
		M1.show2();
		M1.recorrer(l1,0,1,0,lia);*/
		
		Matriz_puntos Mp1=new Matriz_puntos(4);
		Matriz M1=new Matriz(6,6);
		
		Matriz_puntos Mp2=new Matriz_puntos(2);
		Linea lia=new Linea(0,1,1,0,Mp2);
		List l1=new List();
		
		Linea li1=new Linea(0,0,1,1,Mp1);
		Linea li2=new Linea(0,0,2,2,Mp1);
		Linea li3=new Linea(2,2,3,0,Mp1);
		Linea li4=new Linea(3,0,0,0,Mp1);
		Mp1.show2();
		Mp1.recorrido(0,l1,lia,0);
		
	}
}
