package Week_01;

/*
2. The Bank Balance
A bank system needs to show the status of a customer’s account balance.

Input Format
• An integer balance

Output Format
• "Positive Balance" if balance > 0
• "Overdraft" if balance < 0
• "Zero Balance" if balance == 0

Sample Test Cases
Input 1:
250
Output 1:
Positive Balance

Input 2:
0
Output 2:
Zero Balance

Input 3:
-120
Output 3:
Overdraft
*/

public class Q2_BankBalance {
    public static void main(String[] args) {
        int balance = -120;
        if(balance > 0){
            System.out.println("Positive Balance");
        }else if(balance < 0){
            System.out.println("Overdraft");
        }else{
            System.out.println("Zero Balance");
        }
    }
}
