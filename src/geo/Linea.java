package geo;
import listas.*;

public class Linea{
private Punto inicio;
private Punto fin;

public Linea( int x1,  int y1,  int x2,  int y2, Matriz mat, Matriz_puntos mp) {
	this.inicio= new Punto(x1,y1);
	this.fin=new Punto(x2,y2);
	mat.add(this,x1,y1);
	mat.add(this,x2,y2);
	mp.add(x1*10+y1,this);
	mp.add(x2*10+y2,this);
}
/**
 * Dado un extremo de una línea este método
 * retorna el otro extremo tipo Punto
 * 
 * @author juan
 * @param x1
 * @param y1
 * @return El otro extremo de la línea o un null 
 * si el punto dado no pertenece a la línea
 */
public Punto conecta(int x1,int y1) {
	if (x1==this.inicio.getX() && y1==this.inicio.getY()) {
		return this.fin;
	}
	else if (x1==this.fin.getX() && y1==this.fin.getY()) {
		return this.inicio;
	}
	else {
		return null;
	}
}
/**
 * Hace un print del inicio y final de la linea
 */
public void show() {
	System.out.print("incio:("+inicio.getX()+","+inicio.getY()+")"+
	"final:("+fin.getX()+","+fin.getY()+")");
}
public Punto getInicio() {
	return inicio;
}
public void setInicio(Punto inicio) {
	this.inicio = inicio;
}
public Punto getFin() {
	return fin;
}
public void setFin(Punto fin) {
	this.fin = fin;
}

}
