/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheNextDay;
import java.util.Scanner;
/**
 *
 * @author 84943
 */
public class theNextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the day:");
        int day = scanner.nextInt();
        
        System.out.println("Enter the month:");
        int month = scanner.nextInt();
        
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        
        System.out.println("Current date: " + day + "/" + month + "/" + year);
        
        // Calculate the next date
        int[] nextDate = NextDate(day, month, year);
        
        if (nextDate != null) {
            System.out.println("Next date: " + nextDate[0] + "/" + nextDate[1] + "/" + nextDate[2]);
        } else {
            System.out.println("Invalid input");
        }
    }
    
    public static int[] NextDate(int day, int month, int year) {
        int[] nextDate = new int[3];
        
        // Check for invalid input
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1812 || year > 2012) {
            return null;
        }
        
        // Check for leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // Calculate the maximum number of days in the current month
        int maxDaysInMonth;
        if (month == 2) {
            maxDaysInMonth = isLeapYear ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDaysInMonth = 30;
        } else {
            maxDaysInMonth = 31;
        }
        
        // Check for invalid date
        if (day < 1 || day > maxDaysInMonth) {
            return null;
        }
        
        // Calculate the next date
        if (day < maxDaysInMonth) {
            nextDate[0] = day + 1;
            nextDate[1] = month;
            nextDate[2] = year;
        } else if (month < 12) {
            nextDate[0] = 1;
            nextDate[1] = month + 1;
            nextDate[2] = year;
        } else {
            nextDate[0] = 1;
            nextDate[1] = 1;
            nextDate[2] = year + 1;
        }
        
        return nextDate;
    }

}
