package Taller1_1;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		List<Product> shopping = List.of(new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

//		String filteredList = shopping.stream().filter(entry -> entry.startsWith("C")).collect(Collectors.joining(", ", "[", "]"));

//		System.out.println(filteredList);
	

		
		Double totales =shopping.stream().mapToDouble
				(total->total.price.doubleValue()+(total.tax.percent*total.price.doubleValue()/100)).sum();
		
//		List<Object> shopping = Collections.singletonList(Product);
		//If you want it in a specific datatype, use Stream.of(object):

//		List<String> list = Stream.of(object).map(Object::toString).collect(Collectors.toList());
		//Similarly, you can change the method in the map to convert to the datatype you need.
		
		System.out.println(totales);
//		final List<Product> startsWithN =
//				  shopping.stream()
//				         .filter(name -> name.startsWith("N"))
//				         .collect(Collectors.toList());      
		
//		String variable = shopping.stream().filter(x -> name.startsWith("J"));
//	      System.out.println("Getting strings beginning with letter J ="+stream.collect(Collectors.toList()));
		

//		   Stream<Object> variable = shopping.stream().filter(name -> name.startsWith("C"));

//		    System.out.println(s.collect(Collectors.toList()));
		    
		//solucion
        String lista = shopping.stream()
                .filter(x -> x.name.startsWith("C"))
                .sorted((x,y) -> x.name.compareToIgnoreCase(y.name))
                .map(x-> x.name)
                .collect(Collectors.joining(","));

	}

}
