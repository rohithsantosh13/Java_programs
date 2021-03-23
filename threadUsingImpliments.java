public class threadUsingImpliments {
    public static void main(String args[]){
        MultiTasking ob = new MultiTasking("Thread-A");
        Thread t1 = new Thread(ob);
        t1.start();
    }
}
class MultiTasking implements Runnable{
    String name;
    public MultiTasking(String name){
        this.name = name;
    }
    public void run(){
        Thread.currentThread().setName(this.name);
        for(int i =0;i<6;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
            try{
                Thread.sleep(750);
            }
            catch(Exception e){
                System.out.println();
            }
         }
    }
}