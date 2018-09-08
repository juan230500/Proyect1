package geo;
import listas.*;

public class Punto {
	 int x;
	 int y;
	 boolean bloqueo;
	 List lineas;
	 Linea precedente;
	 
	 public Punto(int xi,int yi) {
		 this.x=xi;
		 this.y=yi;
		 this.lineas= new List();
		 
	 }
	 /**
	  * Genera un nuevo punto a partir de una instancia "en limpio"
	  * para hacer varios puntos con nuevas coordenadas
	  * sin necesidad de instanciar cada uno por separado.
	  * Especialmente útil para contriur una matriz de puntos
	  * 
	  * @author juan
	  * @param xi La x que se desea en el nuevo punto
	  * @param yi La y que se desea en el nuevo punto
	  * @return p Un nuevo punto instanciado con la (x,y) deseada
	  */
	 public Punto generate(int xi, int yi) {
		 Punto p=new Punto(xi,yi);
		 return p;
	 }
	 
	 /**
	  * Función que servirá para realizar recorridos
	  * al decirle a un recorrido que ignore su linea de origen
	  * y se concentre en las que le falta recorrer en el nuevo punto
	  * 
	  * @author juan
	  * 
	  * @param ig Linea a ignorar
	  * @return lt Lista con todas las líneas del punto
	  * 		menos la linea a ignorar
	  */
	 public List get_rest(Linea ig) {
		 List lt=new List();
		 Node tmp=this.lineas.getFirst();
		 while (tmp!=null) {
			 if ((Linea)tmp.getInfo()!=ig) {
				 lt.insert(tmp.getInfo());
			 }
			 tmp=tmp.getNext();
		 }
		 return lt;
	 }
	 /**
	  * sirve para ver el punto como un entero de dos cifras
	  * @return el par ordenado escrito como un entero de dos cifras
	  */
	 public int getXY() {
		 return this.x*10+this.y;
	 }
	 
	 /**
	  * Simplemente hace un print de un par ordenado (x,y)
	  * @author juan
	  */
	 public void show() {
			System.out.println("("+this.x+","+this.y+")");
		}
	 
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isBloqueo() {
		return bloqueo;
	}
	public void setBloqueo(boolean bloqueo) {
		this.bloqueo = bloqueo;
	}

	public List getLineas() {
		return lineas;
	}

	public void setLineas(List lineas) {
		this.lineas = lineas;
	}
	public Linea getPrecedente() {
		return precedente;
	}
	public void setPrecedente(Linea precedente) {
		this.precedente = precedente;
	}
	}

