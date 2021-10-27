/*
The main class for JB 4 assignment 3
Creates a LinkedBlockingQueue and then one each of the consumer and producer objects, and runs their threads
*/


import java.util.concurrent.LinkedBlockingQueue;

public class ProductionManager {
    public static void main(String[] args){
        LinkedBlockingQueue queue= new LinkedBlockingQueue<String>(3);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(producer);
        producer.producerThread.start();
        consumer.consumerThread.start();
    }
}
