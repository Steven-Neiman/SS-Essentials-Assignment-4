import java.util.concurrent.BlockingQueue;

class Producer{
    public final BlockingQueue queue;
    String[] intendedOutputs= new String[]{"one", "two", "three", "four", "five"};
    Producer(BlockingQueue q) {
        queue = q;
    }
    Runnable producerRunnable = new Runnable(){
        public void run() {
        try {
            for (Integer i=0; i<5; i++) {
                queue.put(nextOutput(i));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        String nextOutput(Integer index) {
            return intendedOutputs[index];
        }
    };
    Thread producerThread = new Thread(producerRunnable);
}