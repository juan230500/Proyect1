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


 /**
  * Función que obtiene el punto dadas sus coordenadas
  * como un entero de dos cifras de la forma xy
  * @author juan
  * @param ub la ubicación del punto deseado en forma xy
  * @return un cálculo para sacar de la lista interna de puntos
  * el punto con las coordenadas deseadas
  */
 public Punto get(int ub) {
	 return (Punto)Puntos.get((ub/10)%10+ub%10*this.dim);
 }
 
 /**
  * Este método añade una lista l1 a un punto en una posición ub
  * @param ub ubicación del punto
  * @param l1 linea a agregar al punto
  */
 public void add(int ub,Linea l1) {
	 Punto tmp= this.get(ub);
	 List l_tmp=tmp.getLineas();
	 l_tmp.insert(l1);
 }
 
 /**
  * Hace un print de los puntos que componen la matriz
  */
 public void show() {
	 for (int i=0;i<this.dim;i++) {
		 for (int j=0;j<this.dim;j++) {
			 System.out.print(this.get(j*10+i).getLineas()+"\t");
		 }
		 System.out.print("\n");
	 }
 }
 
 /**
  * Hace un print del contenido de los puntos de la matriz
  */
 public void show2() {
	 for (int i=0;i<this.dim;i++) {
		 for (int j=0;j<this.dim;j++) {
			 List tmp=this.get(j*10+i).getLineas();
			 tmp.print();
		 }
		 System.out.print("\n");
	 }
 }
 
 /**
  * Este método es el principal de la clase matriz_puntos
  * Busca realizar un recorrido por todos los puntos posibles
  * para identificar áreas cerradas siguiendo trayectorias lineales.
  * Realiza recursividad de pila en caso de bifurcaciones
  * 
  * @param ubi ubicación inicial del recorrido
  * @param aco Puntos acomulados en rocorridos pasados
  * @param ig Linea a ignorar en caso de recursión
  * @param cont Contador para ver que elemento tomar al inicio
  * @return lista con los puntos acomulados que formen un area cerrada
  */
 public List recorrido(int ubi,List aco, Linea ig,int cont) {
	 Punto Pact=this.get(ubi);
	 List L_rest=Pact.get_rest(ig);
	 
	 if (L_rest.getSize()>1+cont) {
		 recorrido(ubi,aco.copy(),ig,cont+1);
	 }
	 
	 
	 if ((Linea)L_rest.get(cont)==Pact.getPrecedente()) {
		 Pact.setPrecedente(null);
		 return null;
	 }
	 
	 
	 Linea Lact=(Linea)L_rest.get(cont);
	 Linea tp=Lact; //Lleva la línea anterior a cerrar un área
	 
	 while(L_rest.getSize()>0) {
		 
		 int tmp=aco.find(Pact.getXY());
		 if (tmp!=-1){ //Caso de área cerrada
			aco.print();
			Pact.setPrecedente(tp);
			return aco;
		 }
		 aco.insert(Pact.getXY());
		 
		 tp=Lact;
		 Pact=Lact.conecta(Pact.getXY());
		 ig=Lact;
		 L_rest=(Pact.get_rest(ig));
		 
		 if (!L_rest.isEmpty())
		 Lact=(Linea)L_rest.get(0);}
	
	aco.insert(Pact.getXY());
	aco.print();
	return aco;
 }
 
 
}
