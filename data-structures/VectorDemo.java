
import java.util.Vector;
import DataStructure.GetMethods;
public class VectorDemo{
	public static void main(String[] args){
		Vector v = new Vector(3,2);
		System.out.println("Initial size"+v.size());
		System.out.println("Initial capacity"+v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("Capacity after 4 additions "+v.capacity());
		v.addElement(new Double(5.45));
		System.out.println("new capacity "+v.capacity());
		System.out.println("Other methods are following");
		GetMethods m = new GetMethods(v);
		m.ListMethods();
		
	}
}
