package geo;
import listas.*;

public class Matriz_puntos {
	List Puntos;
	int dim;
	
	 public Matriz_puntos(int dim) {
		 this.dim=dim;
		 this.Puntos=new List();
		 Punto p=new Punto(0,0);
		 for (int i=0;i<this.dim;i++) {
			 for (int j=0;j<this.dim;j++) {
				 Puntos.insert(p.generate(i, j));
			 }
		 }
		}


 
 public Punto get(int ub) {
	 return (Punto)Puntos.get((ub/10)%10+ub%10*this.dim);
 }
 
 public void add(int ub,Linea l1) {
	 Punto tmp= this.get(ub);
	 List l_tmp=tmp.getLineas();
	 l_tmp.insert(l1);
 }
 
 public void show() {
	 for (int i=0;i<this.dim;i++) {
		 for (int j=0;j<this.dim;j++) {
			 System.out.print(this.get(i*10+j)+"\t");
		 }
		 System.out.print("\n");
	 }
 }
 
 public void show2() {
	 for (int i=0;i<this.dim;i++) {
		 for (int j=0;j<this.dim;j++) {
			 List tmp=this.get(i*10+j).getLineas();
			 tmp.print();
		 }
		 System.out.print("\n");
	 }
 }
}
