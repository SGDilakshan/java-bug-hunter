package Week_01.Optional;

public class Q3_ElectricityBillDiscount {
    public static void main(String[] args) {
        double billAmount = 1200.0;
        double finalAmount;

        if (billAmount > 1000) {
            finalAmount = billAmount * 0.9;
        } else if (billAmount >= 500 && billAmount <= 1000) {
            finalAmount = billAmount * 0.95;
        } else {
            finalAmount = billAmount;
        }
        System.out.println("Final amount to be paid: " + finalAmount);
    }
}
