package geo;
import listas.*;

public class Matriz_puntos {
	List Puntos;
	int dim;
	
	 public Matriz_puntos(int dim) {
		 this.dim=dim;
		 this.Puntos=new List();
		 Punto p=new Punto(0,0);
		//como se agrega al inico de una lista se
		// debe sacar el complemento para que las x,y
		// más altas se agregen primero
		 for (int i=dim-1;i>=0;i--) {
			 for (int j=dim-1;j>=0;j--) {
				 Puntos.insert(p.generate(j,i)); 
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
 
 public List recorrido(int ubi) { //,List aco, Linea ig
	 this.show();
	 List aco=new List();
	 Punto Pact=this.get(ubi);
	 List L_rest=Pact.getLineas();
	 Linea Lact=(Linea)L_rest.get(0);
	 
		 System.out.println("#");
		 aco.insert(Pact.getXY());
		 System.out.println(Pact.getXY());
		 Pact=Lact.conecta(ubi);
		 Pact=this.get(11);
		 System.out.println(Pact.getX());
		 
		 /*Linea ig=Lact;
		 L_rest=(Pact.get_rest(ig));
		 if (!L_rest.isEmpty()) 
		 Lact=(Linea)L_rest.get(0);*/
	 
	aco.insert(Pact.getXY());
	aco.print();
	return aco;
 }
 
 
}
