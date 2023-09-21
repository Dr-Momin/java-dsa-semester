package Queue;

public class QueueUsingArray {

    static class Queue{
        int arr[];
        int size;
        int front, rear = -1;

        Queue(int size){
            arr = new int[size];
            this.size = size;
        }


        public void enqueue(int data){
            if(isFull()){
                throwError("full");
                return;
            }

            arr[++rear] = data;
        }

        public int dequeue(){
            if (isEmpty()){
                throwError("empty");
                return -1;
            }

            int data = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;

            return data;
        }

        public int peek(){
            if (isEmpty()){
                throwError("empty");
                return -1;
            }

            return arr[0];
        }


        // ? Utility Functions
        public boolean isEmpty(){
            return rear == -1;
        }

        public boolean isFull(){
            return rear == size-1;
        }

        public void throwError(String error){
            if (error.equals("empty"))
                System.out.println("Queue is Empty");
            else
                System.out.println("Queue is full");
        }

        public void display(){
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        Queue q = new Queue(4);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);


        q.display();

        System.out.println(q.dequeue());
        q.display();

        System.out.println(q.peek());
        q.display();

    }
}
