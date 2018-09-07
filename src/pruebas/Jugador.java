package pruebas;
import listas.*;

public class Jugador {
private String nombre;
public List lineas=new List();


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public List getLineas() {
	return lineas;
}
public void setLineas(List lineas) {
	this.lineas = lineas;
}
}
