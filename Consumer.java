public class Consumer {
    Producer source;
    public Consumer(Producer producer){
        this.source = producer;
    }
    Runnable consumerRunnable = new Runnable(){
        public void run(){
            for(Integer i=0; i<5; i++){
                try{
                    System.out.println(source.queue.take());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    };
    Thread consumerThread = new Thread(consumerRunnable);
}
