package geo;

public class Punto {
	 int x;
	 int y;
	 boolean bloqueo;
	 
	 public Punto(int xi,int yi) {
		 this.x=xi;
		 this.y=yi;
	 }
	 
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
	}

