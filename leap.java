import java.io.*;
import java.util.*;
public class leap

    {

        public static void main(String args[])

        {

            Scanner s = new Scanner(System.in);

            System.out.print("Enter any year:");
           int year=s.nextInt();
           Boolean flag=false;
           if(year % 400==0)
           {
         flag = true;
         }
         else if(year % 100==0)
         {
         flag = false;
         }
         else if(year % 4==0)
         {
         flag = true;
         }
         if(flag)

            {

                System.out.println("Year "+year+" is a Leap Year");

            }

            else

            {

                System.out.println("Year "+year+" is not a Leap Year");

            }

        }

    }
