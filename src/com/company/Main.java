package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("ENTER THE NUMBER \"A\"");
        Scanner cc=new Scanner(System.in);
        int A=cc.nextInt();

        System.out.println("ENTER THE NUMBER \"B\"");
        Scanner ss=new Scanner(System.in);
        int B=ss.nextInt();

        System.out.println("THE NUMBERS BEFORE SWAPPING ARE \nA="+A+"\nB="+B);
        A+=B;    //A=A+B
        B=A-B;   //B=A-B
        A=A-B;   //A=A-B
        System.out.println("THE NUMBERS BEFORE SWAPPING ARE \nA="+A+"\nB="+B);
    }
}
