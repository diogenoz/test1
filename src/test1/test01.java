package test1;
import java.io.*;
/**
 * Created by diogen on 31.01.15.
 */
public class test01 {
    public static void main(String[] args)
    {
        InputStreamReader isreader1= new InputStreamReader(System.in);
        BufferedReader reader1=new BufferedReader(isreader1);
        String cname = reader1.readLine();
        String slet = reader1.readLine();
        int nlet=Integer.parseInt(slet);
        //String s2="sss";
        //s2.equals(cname);
        System.out.print(cname + "захватит мир через " + nlet + " лет. Му-ха-ха!");//Напишите тут ваш код
    }
}
