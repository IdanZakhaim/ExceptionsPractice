import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        divisionCalculator();
        fileWriting();
        nullValue ();
        indexOfBounds ();


    }

    public static void divisionCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Enter a second number");
        int num2 = scanner.nextInt();
        try {
            int sum = num1 / num2;
            System.out.println(sum);//אם num2 = 0 התכנית תדלג על השורה הזו ישר לשורה הבאה
        } catch (ArithmeticException e) {
            e.printStackTrace(); // מדפיס למה השגיאה קרתה (by zero)
            //System.out.println("num 2 = 0");
        }
    }

    public static void fileWriting (){
        File test = new File("C:\\Users\\Lenovo\\OneDrive\\שולחן העבודה\\תואר\\מונחה עצמים\\מצגות שי\\2023");
        try {
            FileWriter fileWriter = new FileWriter(test);//מנסה לכתוב לקובץ שלא קיים ומדלג על השורה הבאה
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File not exist!!");
        }
    }

    public static void nullValue (){
        String str = null;
        try {
            System.out.println("The length of the string is" + str.length());//מדלג על השורה כי הסטרינג null
        } catch (NullPointerException e) {
            System.out.println("The string is Null!");
        }
    }

    public static void indexOfBounds (){
        ArrayList <Integer> arrayList = new ArrayList<>();
        try {
            System.out.println(arrayList.get(10));
            }catch (IndexOutOfBoundsException e){
            System.out.println("HELP!!!!");

        }

    }

}