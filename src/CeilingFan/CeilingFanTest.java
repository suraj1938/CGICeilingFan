package CeilingFan;

import java.util.Scanner;

public class CeilingFanTest {
    public static void main(String[] args) {
        CeilingFan fan =new CeilingFan();
        while (true) {
            System.out.print("Press 'S' to Change Speed and 'D' to change Direction");
            char input=readLine();
            if(input == 'S'){
                fan.changeSpeed();
            }
            else if (input == 'D'){
                fan.changeDirection();
            }else{
                System.out.println("Please Enter either 'S' or 'D'");
            }
        }
    }

    public static char readLine(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a character: ");
        char c = sc.next().charAt(0);
        return c;
    }


}
