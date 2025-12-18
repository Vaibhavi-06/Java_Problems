import java.util.*;

class QueueDemo
{
	public static void main(String args[])
	{
		PriorityQueue<String> pq=new PriorityQueue<String>();
	
		pq.add("Apple");
		pq.add("Banana");
		pq.add("Grapes");
		pq.add("Guva");

		pq.offer("Orange");

		System.out.println("PriorityQueue: "+pq);

		System.out.println("Head of Queue: "+pq.peek());
	
		System.out.println("Head of Queue: "+pq.element());

		pq.poll();
		System.out.println(pq);

		pq.remove();
		System.out.println(pq);

		ArrayDeque<String> ad=new ArrayDeque<String>();

		ad.add("Vaibhavi");
		ad.add("Vaishanvi");
		ad.add("Dhanashri");
		ad.add("Shital");
		ad.add("Akshada");

		System.out.println("ArrayDeque: "+ad);

		ad.offer("Savita");
		System.out.println("After Offer: "+ad);
		
		ad.offerFirst("Rutika");
		System.out.println("Offer First: "+ad);

		ad.offerLast("Diksha");
		System.out.println("Offer Last: "+ad);

		ad.remove();
		System.out.println("After Remove: "+ad);

		ad.poll();
		System.out.println("After Poll: "+ad);

		ad.pollLast();
		System.out.println("After Poll Last: "+ad);


	
	}
}