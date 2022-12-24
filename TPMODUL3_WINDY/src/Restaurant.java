public class Restaurant implements Runnable {

    private boolean WaitingForPickup = false;
    private static final Object lock = new Object();
    private static int FoodNumber = 1;
    
    @Override
    public void run(){
        while (true){
            makeFood();
            try{
                Thread.sleep(550);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
    
        }
    }
    public void setWaitingForPickup(boolean WaitingForPickup){
        this.WaitingForPickup = WaitingForPickup;
    }
    public static int getFoodNumber(){
        return FoodNumber;
    }
    public static Object getlock(){
        return lock;
    }
    public void makeFood(){
        synchronized(Restaurant.lock){
            if(this.WaitingForPickup){
                try{
                    System.out.println("Restaurant: Waiting for the Waiter to deliver the Food");
                    Restaurant.lock.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            WaitingForPickup = true;
            System.out.println("Restaurant:  Making Food Number " + FoodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the food\n");
        }
    }
}



  