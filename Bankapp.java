import java.util.Scanner;

class InvalidInputException extends Exception
{
    public String getMessage(){
        return "youre a fool, you have entered a negative number";
        }
}
class NegativeException extends Exception{
    public String getMessage(){
        return "Youre a bigger fool,the amount entered is greater than balance";
    }
}
class Bank{
    int amt,bal;
    Bank(int bal){
        this.bal=bal;
    }
    void input(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter an amount");
        amt=in.nextInt();
    }
    void dispatchAmt(){
        try{
            if(amt<0){
                throw new InvalidInputException();
            }
            else if(amt>bal){
                throw new NegativeException();
            }
            else{
                bal=bal-amt;
                System.out.println("collect your cash");
                System.out.println("bal is"+bal);
            }
        }
    
        catch(InvalidInputException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NegativeException e)
        {
            System.out.println(e.getMessage());
        }
            }
            }
            class Bankapp {
                public static void main(String[] args) {
                    Bank b=new Bank(5000);
                    b.input();
                    b.dispatchAmt();
                }
            }
