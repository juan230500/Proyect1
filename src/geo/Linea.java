package geo;
import listas.*;

public class Linea{
private Punto inicio;
private Punto fin;

public Linea( int x1,  int y1,  int x2,  int y2, Matriz mat) {
	this.inicio= new Punto(x1,y1);
	this.fin=new Punto(x2,y2);
	mat.add(this,x1,y1);
	mat.add(this,x2,y2);
}

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
