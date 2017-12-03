package DataStructure;
import java.lang.reflect.*;
public class GetMethods{
  Object o;
  public GetMethods(Object v){
    this.o=v;
  }
  
  public void ListMethods(){
  Class clazz = o.getClass();
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods){
			System.out.print(method.getName()+" ");
			Parameter[] parameterTypes = method.getParameters();
			for(Parameter parameter:parameterTypes){
				System.out.println("\t"+parameter);
			}
			
		}
	}
}
  
