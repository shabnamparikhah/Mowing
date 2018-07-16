import java.util.Scanner;

public class MowingTimeClass {
    public static void main(String[] args)
    {
        Scanner keybord = new Scanner(System.in);
        int length;
        int width;
        double calculate;
        double time;


        System.out.println("Please enter the length:");
        length = keybord.nextInt();

        System.out.println("Please enter the width:");
        width  = keybord.nextInt();
        calculate = calculateArea(length,width);

        System.out.println(calculate);

        time = calculateTime(calculate);
        System.out.println(time);
    }
    public static int calculateArea(int length,int width)
    {
        int area = length * width;
        return area;
   }
    public static double calculateTime(double calculate)
    {
        double time = (calculate / 40) * 2;
        return time;
    }
}
