package Lec24;

public class Queue {

	protected int[] data;
	protected int front;
	protected int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		data = new int[5];
		front = 0;
		size = 0;
	}

	public Queue(int cap) {
		// TODO Auto-generated constructor stub
		data = new int[cap];
		front = 0;
		size = 0;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public boolean isfull() {
		return this.size == this.data.length;
	}

	public int size() {
		return this.size;
	}

	public void Enqueue(int item) throws Exception {
		if(isfull()) {
			throw new Exception("Queue full hai ");
		}
         int i= (this.size+this.front)%this.data.length;
		this.data[i] = item;
		this.size++;
	}

	public int Dequeue() throws Exception {
		if(isempty()) {
			throw new Exception("Queue khaali hai ");
		}
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front+1)%this.data.length;
		this.size--;
		return rv;

	}

	public int GetFront() throws Exception {
		if(isempty()) {
			throw new Exception("Queue khaali hai ");
		}
		int rv = this.data[this.front];
		return rv;

	}
	public void Display() {
		for (int i = 0; i <this.size; i++) {
			
			int idx= (this.front+i)%this.data.length;
			System.out.print(this.data[idx]+" ");
		}
		System.out.println();
	}
}
