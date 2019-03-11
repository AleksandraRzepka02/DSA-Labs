package gmit;

public class QueueTest {
	public static void main(String[] args) {
		new QueueTest(); 
	}
	
	public QueueTest(){

		
	}
	
	
	public void init(Queue<Element> queue){
		queue.add(new Element("Tom Riddle", 89));
		queue.add(new Element("Kingsley Shacklebolt", 341));
		queue.add(new Element("Severus Snape", 46));
		queue.add(new Element("Draco Malfoy", 4));
		queue.add(new Element("Cassandra Trelawney", 367));
		queue.add(new Element("Nymphadora Tonks", 432));
		queue.add(new Element("Rubeus Hagrid", 3));
		queue.add(new Element("Bathilda Bagshot", 456));
		queue.add(new Element("Remus Lupin", 107));
		queue.add(new Element("Hermione Granger", 13));
		queue.add(new Element("Bellatrix Lestrange", 356));
		queue.add(new Element("Sirius Black", 231));
	}
}
