package interfaceTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FunctionalTest {

	public static void main(String[] args) {

		Predicate<Integer> lessThan10 = i -> i < 10;
		Predicate<Integer> greaterThan10 = i -> i > 10;
		Predicate<Integer> lessThan20 = i -> i < 20;
		
		System.out.println("5 Less than 10 : "+lessThan10.test(5));
		
		System.out.println("10 Less than 10 : "+lessThan10.test(10));
		
		System.out.println("15 Less than 20 and greaterthan 10 : "+lessThan20.and(greaterThan10).test(15));
		
		System.out.println("15 Less than 20 and greaterthan 10 : "+lessThan20.or(greaterThan10).negate().test(-15));
		predicate_negate();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		System.out.println("Sum of all :" + sumWithCondition(list, n -> true));
		System.out.println("Sum of even :"+ sumWithCondition(list, n -> n % 2 == 0));
		System.out.println("Sum of odd :"+ sumWithCondition(list, n -> n % 2 != 0));
		
		//-----------------------------------------
		System.out.println(findSquareOfMaxOdd(list));
		
		System.out.println(findSquareOfMaxOdd2(list));
		
	}

	public static Predicate<String> hasLengthOf10 = new Predicate<String>() { 
        @Override
        public boolean test(String t) 
        { 
            return t.length() > 10; 
        } 
    }; 
    
    public static void predicate_negate() 
    { 
  
        String lengthGTThan10 = "Thunderstruck is a 2012 children's "
                                + "film starring Kevin Durant"; 
  
        boolean outcome = hasLengthOf10.negate().test(lengthGTThan10); 
        System.out.println(outcome); 
        
        String lengthGTThan101 = "Thunder"; 

        boolean outcome1 = hasLengthOf10.negate().test(lengthGTThan101); 
        System.out.println(outcome1); 
    } 
    
    public static int sumWithCondition(List <Integer> list, Predicate<Integer> predicates)
    {
    	return list.parallelStream().filter(predicates).mapToInt(i -> i).sum();
    }
    public static int findSquareOfMaxOdd(List<Integer> list)
    {
    	int max=0;
    	
    	for (Integer integer : list) {
			if(integer > 0 && integer < 5 && integer%2 != 0)
			{
				max = integer;
			}
		}
    	
    	return max*max;
    }
    public static int findSquareOfMaxOdd2(List<Integer> list)
    {
    	return list.stream().filter(FunctionalTest::isLessThan5)
    				 .filter(FunctionalTest::isGreaterThan1)
    				 .filter(FunctionalTest::isEven)
    				 .max(Comparator.naturalOrder())
    				 .map(j -> j*j).get();
    }
    public static boolean isEven( int i)
    {
    	return i%2 ==0;
    }
    public static boolean isGreaterThan1( int i)
    {
    	return i > 1;
    }
    public static boolean isLessThan5( int i)
    {
    	return i < 5;
    }
}
