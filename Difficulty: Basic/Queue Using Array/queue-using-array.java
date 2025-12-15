class myQueue {

    // Constructor
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public myQueue(int n) {
        // Define Data Structures
        capacity=n;
        queue=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return size==0;
    }

    public boolean isFull() {
        // Check if queue is full
        
        return size==capacity;
    }

    public void enqueue(int x) {
        // Enqueue
        if(size==capacity){
            return;
        }
        rear=(rear+1)%capacity;
        queue[rear]=x;
        size++;
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()){
            return;
        }
        int val=queue[front];
        front=(front+1)%capacity;
        size--;
    }

    public int getFront() {
        // Get front element
        if(isEmpty()){
            return -1;
        }
        return queue[front];
    }

    public int getRear() {
        // Get last element
        if(isEmpty()){
            return -1;
        }
        return queue[rear];
    }
}
