/*
A class for JB 4 assignment 2.
Creates two threads, each of which will lock a variable, wait to be sure the other has done the same,
then try to lock the variable the other has already locked to cause a deadlock.
*/

public class TangledThreads{
    public static void main(String[] args){
        Integer zero = 0;
        Integer one = 1;

        Runnable firstRunnable = new Runnable(){
            public void run(){
                try{
                    synchronized (zero){
                        Thread.sleep(256);
                        synchronized (one){
                            System.out.println("the first thread has concluded, the variables were "+zero+one);
                        }
                    }
                } catch (Exception e){
                    System.out.println("The first thread threw an exception");
                }
            }
        };

        Runnable secondRunnable = new Runnable(){
            public void run(){
                try{
                    synchronized (one){
                        Thread.sleep(256);
                        synchronized (zero){
                            System.out.println("the second thread has concluded, the variables were "+one+zero);
                        }
                    }
                }catch(Exception e){
                    System.out.println("the second thread threw an exception");
                }
            }
        };
        Thread firstThread = new Thread(firstRunnable);
        Thread secondThread = new Thread(secondRunnable);

        firstThread.start();
        secondThread.start();
        System.out.println("the whole program has concluded");
    }
}