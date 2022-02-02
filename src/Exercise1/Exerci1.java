package Exercise1;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Exerci1 {
    public static void main(String[] args){
        System.out.println("hello world");

      Date date = new Date();
        System.out.println(date);
        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime= LocalDateTime.now();
        String s = new String();
        System.out.println(s);
        System.out.println(localDateTime);
        System.out.println((int) Math.sqrt(49));
        System.out.println(Math.PI);

        char [] letters= {'A','B','C','A','A','A'};

      int  count= countOccurrences(letters, 'A');
        System.out.println(count);


    }


    public  static int countOccurrences( char [] names, char searchletter){
        System.out.println("you have succeeded");
        System.out.println(Arrays.toString(names));
        System.out.println(searchletter);
        int count= 0;
        for( char name: names){
          if(  name == searchletter){
              count++;
          }

        }
        return count;
    }


}

 

