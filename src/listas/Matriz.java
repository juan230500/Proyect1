package listas;

import geo.Linea;
import geo.Punto;

public class Matriz extends List{
	private List Lista;
	private int n,m; //filas y columnas
	
	public Matriz(int n,int m) {
		List pred=new List();
		List l1=new List();
		for (int i=0;i<n;i++) {
			List l2=new List();
			for (int j=0;j<m;j++) {
				l2.insert(pred.copy());
			}
			l1.insert(l2.copy());
		}
		
		this.Lista=l1;
		this.n=n;
		this.m=m;
		
	}
	
	public Object get(int i, int j) {
		if (i<=n && j<=m)
			return (Object)((List)Lista.get(i)).get(j);
		return -1;
	}
	
	public void set(Object o,int b, int a) {
		Node temp=Lista.getFirst();
		for (int i=0;i<a;i++) {
			temp=temp.getNext();
		}
		temp=((List)temp.getInfo()).getFirst();
		for (int j=0;j<b;j++) {
			temp=temp.getNext();
		}
		temp.setInfo(o);
	}
	
	public void add(Object o,int b, int a) {
		Node temp=Lista.getFirst();
		for (int i=0;i<a;i++) {
			temp=temp.getNext();
		}
		temp=((List)temp.getInfo()).getFirst();
		for (int j=0;j<b;j++) {
			temp=temp.getNext();
		}
		List temp2=(List)temp.getInfo();
		temp2.insert(o);
		temp.setInfo(temp2);
	}
	
	public void show() {
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.print(this.get(i,j)+"\t");
			}
			System.out.print("\n");
		}
		}
	
	public void show2() {
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				((List)this.get(i,j)).print();
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
	
	public List recorrer(List aco,int a, int b,int cont, Linea orig) {
		List dat=((List)this.get(b, a)).copy();
		dat.extract_o(orig);
		if (1+cont<dat.getSize()) {
			recorrer(aco.copy(),a,b,cont+1,orig);
		}
		Linea prev=(Linea)dat.get(cont);
		Punto act=new Punto(a,b);
		cont=0;
		
		do {
			if (aco.in(a*10+b)) {
				System.out.print("cierra");
				aco.print();
				return aco;
			}
			aco.insert(a*10+b);
			act=prev.conecta(a, b);
			a=act.getX();
			b=act.getY();
			dat=((List)this.get(b, a)).copy();
			if (2<dat.getSize()) {
				recorrer(aco.copy(),a,b,cont+1,prev);
			}
			if (prev==(Linea)dat.get(0) && dat.getSize()>1) {
				prev=(Linea)dat.get(1);}
			else {
				prev=(Linea)dat.get(0);
			}
			cont=0;}while(dat.getSize()!=1);
		
		aco.insert(a*10+b);
		aco.print();
		return null;
	}
	
}
