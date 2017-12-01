import java.util.Vector;
import java.util.Enumeration;
public class Enumerate{
    public static void main(String[] args){
        Vector v = new Vector();
        Enumeration e;
        v.add("Sunday");
        v.add("Monday");
        v.add("Tuesday");
        v.add("Wednesday");
        v.add("Thursday");
        v.add("Friday");
        v.add("Saturday");
        e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}