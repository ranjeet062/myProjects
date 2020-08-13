import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class CheckParanthesis {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		//l.forEach(arg0);

		for(int i=0 ;i<10;i++)
		{
			l.add(i);
		}
		
		Iterator<Integer> iterator = l.iterator();
		while(iterator.hasNext())
		{
			Integer next = iterator.next();
			System.out.println("iterator values "+ next);
		}
		
		l.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("ForEach value "+t);
			}
		});
		
		l.forEach(new myConsumer());
	}

}

class myConsumer implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		System.out.println("forEach for custom consumer "+t);
	}
	
}
