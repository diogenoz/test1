package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        InputStreamReader isreader= new InputStreamReader(System.in);
        BufferedReader reader1=new BufferedReader(isreader);
        String s1 = reader1.readLine();
        int n1=Integer.parseInt(s1);//Напишите тут ваш код
        String s2 = reader1.readLine();
        int n2=Integer.parseInt(s2);//Напишите тут ваш код
        String s3 = reader1.readLine();
        int n3=Integer.parseInt(s3);//Напишите тут ваш код

        if (n1>=n2 &&n1<=n3) {System.out.print(n1);}
        if (n1>=n3 &&n1<=n2) {System.out.print(n1);}

        if (n2>=n1 &&n2<=n3) {System.out.print(n2);}
        if (n2>=n3 &&n2<=n1) {System.out.print(n2);}

        if (n3>=n1 &&n3<=n2) {System.out.print(n3);}
        if (n3>=n2 &&n3<=n1) {System.out.print(n3);}
    }
}
