package Project_1;

import com.sun.org.apache.xerces.internal.impl.dv.xs.AbstractDateTimeDV;

import java.io.FileNotFoundException;
import java.sql.SQLData;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException{
        String nrzad;
        String zap;

        String test="NEXT";
        Scanner scaner = new Scanner(System.in);

        Sql Check = new Sql();
        Add Addd = new Add();

        while(test.equals("NEXT")) {
            System.out.println("WPISZ NUMER ZADANIA ");
            nrzad = scaner.nextLine();
            System.out.println("WPISZ ZAPYTANIE ");
            zap = scaner.nextLine();

            if(Check.spr(zap)){
                Addd.Add(nrzad,zap);
            }

            System.out.println("WPISZ -NEXT- BY KONTYNUOWAC");
            test=scaner.nextLine();

            test.toUpperCase();

        }
        Addd.execute();
        Addd.closing();
    }
}
