public class threading
{
	public static void main(String[] args) {
		
		Task ob = new Task("A");
		ob.start();
        Task ob1 = new Task("B");
		ob1.start();
		System.out.println("Hello World");
		for(int i=0;i<250000;i++){
		    if(i==249999)
		        System.out.println("++");
		}
		
	}
}

class Task extends Thread{
    String name;
    Task(String name){
        this.name = name;
    }
    public void run(){
        Thread.currentThread().setName(name);
        for(int i=0;i<10;i++){
            System.out.println("val:-> "+ i +" "+"Thread-"+ Thread.currentThread().getName());
        }
    }
}
