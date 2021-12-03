import javax.swing.*;
import java.util.Locale;

public class MovieTicket {

    /*
    The local Movie Theater has the following price structure:

    All movies after 5pm on Friday and Saturday are $10.00
    All movies after 5pm on Mon, Tues, Wed, Thurs and Sunday are $8.00
    All movies before 5pm on any day are $7.00.

    Children receive half off of all tickets.
    Senior Citizens receive half off on any movie before 5 pm.

    Create a program that will allow a user to enter the number of child, adult, and senior citizen tickets, the day
    and the time of their movie and accurately display the total ticket cost.


     */
    public static void main(String[] args) {

            int time = 2000;
            int numChild,numAdult,numSeniors;
            String day= "Saturday";
            int age = 21;
            double  price = 0;

            day =day.toLowerCase();



        System.out.println(price);




    }

        public static double findAdultPrice(int time, String day, int numChild, int numSeniors){
            double  price = 0;

            if (time >= 1700 && (day.equals("friday") || day.equals("saturday"))){
                price = 10.00;
            } else if (time >=1700){
                price = 8.00;
            }else{
                price = 7.00;

            }

            if (numChild > 0){
                price *= 0.50;
            }else if (numSeniors > 0 && time <= 1700){
                price *= 0.50;
            }

            return price;

        }


        public static double findChildPrice(int time, String day){
            double  price = 0;

            if (time >= 1700 && (day.equals("friday") || day.equals("saturday"))){
                price = 10.00;
            } else if (time >=1700){
                price = 8.00;
            }else{
                price = 7.00;

            }
            return price * 0.50;
        }



        public static double findSeniorPrice(int time, String day){
            double  price = 0;

            if (time >= 1700 && (day.equals("friday") || day.equals("saturday"))){
                price = 10.00;
            } else if (time >=1700){
                price = 8.00;
            }else{
                price = 7.00;

            }

            if (time <= 1700){
                price *= 0.50;
            }

            return price;
    }
}
