class GenericPrint <E>{
	public E[] t;
	public void GenericPrint(E[] t){
		this.t=t;
	}
	public void set(E[] t){
		this.t=t;
	}
	void print(){
		for(E i:t){
			System.out.println(i);
			}
	}
		}



public class GenericDemo{
public static void main(String[] args){
	Integer[] i = new Integer[5];
	i[0]=1;
	i[1]=2;
	i[2]=3;
	i[3]=4;
	i[4]=5;
	GenericPrint g = new GenericPrint();
	Double[] d = new Double[5];
	d[0]=.02;
	d[1]=.03;
	d[2]=.04;
	d[3]=.05;
	d[4]=.06;
	
	g.set(i);
	g.print();
	g.set(d);
	g.print();
	}
	}
	
	
