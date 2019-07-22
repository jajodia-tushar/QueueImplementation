package com.company;

class Queue{

    private int frontEnd;
    private int rearEnd;
    private int[] arr;

    public Queue(){
        this.arr = new int[10];
        this.frontEnd = -1;
        this.rearEnd = -1;
    }

    public Queue(int capacity){
        this.arr = new int[capacity];
        this.frontEnd = -1;
        this.rearEnd = -1;
    }

    public void add(int value){
        // Checking if this is the first entry in the queue.

        if(this.rearEnd == -1 && this.frontEnd == -1){
            this.frontEnd++;
            this.rearEnd++;
            this.arr[this.rearEnd] = value;
            return;
        }
        if((this.rearEnd) < this.arr.length - 1){
            this.rearEnd++;
            this.arr[this.rearEnd] = value;
            return;
        }

        throw new ArrayIndexOutOfBoundsException("The Queue is Full");
    }

    public int remove(){

        if((this.frontEnd == -1 && this.rearEnd == -1) || (this.frontEnd -1 == this.rearEnd)){
            throw new ArrayIndexOutOfBoundsException("The Queue is Empty");
        }

        int value = this.arr[this.frontEnd];
        this.frontEnd++;
        return value;
    }
}

public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue(10);
        for(int i = 0; i < 5; i++){
            myQueue.add(i*10);
        }

        for(int i = 0; i < 5; i++){
            System.out.println(myQueue.remove());
        }

        for(int i = 0; i < 5; i++) {
            myQueue.add(i * 10);
        }

    }
}
