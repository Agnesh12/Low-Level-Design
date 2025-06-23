package VendingMachine;

class CashPayment implements Payment{
   public boolean pay(double amount) {
       System.out.println("Paid ₹" + amount + " using cash");
       return true;
   }

}
