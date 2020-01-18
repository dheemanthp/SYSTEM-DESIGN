https://leetcode.com/problems/design-circular-queue/


class Node {
    int val;
    Node link;
    Node(int data) {
        val = data;
        link = null;
    }
}



class MyCircularQueue {
    Node front;//points to the front
    Node rear; // points to the rear
    int totalSize; //total size
    int counter; //how many are currently held
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        front = rear = null;
        totalSize = k;
        //System.out.println("the total size is " + totalSize);
        counter = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        //System.out.println("enQueue Happened " + value);
        if(front == null && rear == null) {
            front = new Node(value);
            rear = front;
        } else {
            if(isFull()) {
                return false;
            }
            rear.link = new Node(value);
            rear = rear.link;
        }
            counter++;
            return true;

    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        //System.out.println("coming here deQueue " +counter);
        //always delete from the front
        if(isEmpty()) return false;
        if(front.link != null) {
            front = front.link;
        } else {
            front = rear = null;
        }
        counter--;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(counter != 0) {
            //System.out.println("the Front is " + front.val);
            return front.val;
        } else{
            return -1;
        }
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(counter != 0) {
            //System.out.println("the Rear is " + rear.val);
            return rear.val;
        } else{
            return -1;
        }
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(counter == 0) return true;
        else return false;
        
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(counter == totalSize) return true;
        else return false;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
