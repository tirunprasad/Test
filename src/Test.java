import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
List<Object[]> z = List.of(
				
				new Object[] {12,"AA"},
				new Object[] {11,"BB"},
				new Object[] {13,"CC"}
				
				);
		
		Map<Integer,String> s = 
				z
				.stream()
				.collect(Collectors.toMap(
				ob->Integer.valueOf(ob[0].toString()), 
				ob->ob[1].toString()));
		
		
		/*
		 * Object[] o = {12}; Integer i = o[0]. ; // Integer i =Integer.valueOf(30);
		 */	
		System.out.println("Iam New Line from git");
		
	
	}
	
}
