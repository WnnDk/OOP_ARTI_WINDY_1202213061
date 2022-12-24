public class Waiters implements Runnable {

    private final int CustomerID;
    private final int OrderQty;
    static int FoodPrice = 30000;

    public Waiters(int CustomerID, int OrderQty){
        this.OrderQty = OrderQty;
        this.CustomerID = CustomerID;
    }

    @Override
    public void run(){
        while(true){
            getFood();
            try{
                Thread.sleep(550);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
    public void orderinfo(){
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.CustomerID);
        System.out.println("Number of Food: " + this.OrderQty);
        System.out.println("Total Price: " + this.OrderQty * FoodPrice);
        System.out.println("==========================================================");
    }
    public void getFood(){
        synchronized(Restaurant.getlock()){
            System.out.println("Waiter: Food is ready to deliver!");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            if(Restaurant.getFoodNumber() == this.OrderQty + 1){
                orderinfo();
                System.exit(0);
            }
            Restaurant.getlock().notifyAll();
            System.out.println("Waiter: Tell the Restaurant to make another Food\n");
                
        }
            
    }

}


