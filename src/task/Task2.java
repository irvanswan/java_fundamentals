package task;

import java.util.Scanner;

public class Task2 {
    public static void setPatterns(int number) {
        int count = number / 2;
        int star = number;
        // decrease
        for (int i = 0; i < count; i++) {
            String whitespace = "";
            int j = i;
            while (j >= 0) {
                whitespace += " ";
                j--;
            }
            String strStar = "";
            int k = 0;
            while (k <= star) {
                strStar += "*";
                k++;
            }
            star -= 2;
            System.out.println(whitespace + strStar);
        }
        star = 1;
        int space = count;
        for (int i = count; i <= number; i++) {
            String whiteSpace = "";
            String strStar = "";
            int j = i;
            if (j == count) {
                while (j >= 0) {
                    whiteSpace += " ";
                    j--;
                }
                System.out.println(whiteSpace + "*");
            } else {
                star += 2;
                int k = 0;
                while (k < star) {
                    strStar += "*";
                    k++;
                }
                int l = space;
                while (l > 0) {
                    whiteSpace += " ";
                    l--;
                }
                space -= 1;
                System.out.println(whiteSpace + strStar);
            }
        }
        System.out.println(star);
    }
}
