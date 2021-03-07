import java.util.Scanner;
class Enqueue
{ 

  int size = 5;
  int items[] = new int[size];
  int front, rear;
	
Enqueue()
{
	front=-1;
	rear=-1;

}



	public boolean isEmpty()
	{
		if (front==-1 && rear==-1) {
			return true;
		}
		return false;
	}

public boolean isFull()
{
	if (front==0 && rear==size-1) {
		return true;
		
	}
	else
	{
		return false;
	}

}
public void enqueue( int element)
{
	if (isFull()) {
		System.out.println("Queue Is full,you can't add more element in Queue");
	}
	else{
		if (front==-1) {
			front=0;
		}
		rear++;

		items[rear]=element;
		 System.out.println("element Inserted is " + element+" in Queue");
		 System.out.println();
	}
	 
}
public int dequeue()
{
	  int element;
	if (isEmpty()) {
		  System.out.println("Queue is Already empty");
      return -1;
	}
	else{

		element=items[front];

		if (front >= rear) {
        front = -1;
        rear = -1;
      }
      else {
        
        front++;
      }
      System.out.println( element + " Deleted from Queue");
      return element;
	}

}
public void  traverse()
{
	if (isEmpty()) {
		
		System.out.println("Empty Queue");
	}
	else{
		System.out.println("*****traverse element******");
		System.out.println();
		for (int i=front;i<=rear; i++ ) {
			System.out.print(items[i]+",");
		}


	}
}
public int peek( int getelment)
{
	  int element;
	if (isEmpty()) {
		  System.out.println("Queue is Already empty");
      return -1;
	}
	else{

		element=items[front];

		if (front >= rear) {
        front = -1;
        rear = -1;
      }
      else {
        
        front++;
      }
      System.out.println( element + " Deleted from Queue");
      return element;
	}

}
public int size()
{
	int size=0;
	if (isEmpty()) {
		
		System.out.println("Empty Queue");
	}
	else{

		for (int i=front;i<=rear; i++ ) {
			size=i;
		}
	}
	
return (size+1);
}

public void  reverse()
{
	if (isEmpty()) {
		
		System.out.println("Empty Queue");
	}
	else{
		System.out.println("*****reverse element******");
		System.out.println();
		for (int i=rear;i>=front; i-- ) {
			System.out.print(items[i]+",");
		}


	}
}
public boolean contains(int element)
{
	boolean sts=false;
	if (isEmpty()) {
		
		System.out.println("Empty Queue");
	}
	else{
		System.out.println("*****reverse element******");
		System.out.println();
		for (int i=front;i<=rear; i++ ) {
			if (items[i]==element) {
			sts=true;
				
			}
			
		}
		if (sts) {
			System.out.println("element is present in Queue");
		}
		else{
			System.out.println("element does not present in Queue ");
		}


	}
return sts;}


	public static void main(String[] args) {

 Enqueue enq=new Enqueue();

// isEmpty is boolean type method check queue empty or not 
 System.out.println("isEmpty=====>"+enq.isEmpty()); 
 // isFull method also boolean type method  for check full or not
 System.out.println("isFull=====>"+enq.isFull()); 	
 // dequeue for delete elemt 
System.out.println(" dequeue element==>"+ enq.dequeue());

// insert elemtn in queue
 enq.enqueue(9);
 enq.enqueue(19);
 enq.enqueue(29);
 enq.enqueue(93);
 enq.enqueue(94);
 // travserse element from the queue
 enq.traverse();
 // chcek size of queue
System.out.println( "Size==>"+enq.size());
// reverse the elemmt of the queue
enq.reverse();
// check wheater elemt contains or not 
enq.contains(92);

}
	
}