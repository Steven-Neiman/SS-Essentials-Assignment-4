/*
A class for JB 4 assignment 1
this class has a private constructor, but a public method called "instance" which will construct an object
only if one is not present, and then return the object
*/

public class Singleton {
    volatile public static Singleton singleton=null;
    private Singleton(){}
    public Singleton instance(){
        if (singleton==null){
            synchronized(singleton){
                singleton= new Singleton();
            }
        }
        return singleton;
    }
}
