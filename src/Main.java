public class Main implements Runnable{

    public void run(){
        System.out.println("Threads are created Successfully");
    }
    public static void main(String[] args) {
        Runnable r1=new Main();
     Thread t= new Thread(r1,"My Thread");
     t.start();
     String str=t.getName();
     System.out.println(str);


    }


}