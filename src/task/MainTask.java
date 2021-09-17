package task;

import java.util.Scanner;

public class MainTask {
    Task tsk1 = new Task();
    Task2 tsk2 = new Task2();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan pilih menu 1 / 2 :");
        System.out.println("1. Informasi Biodata");
        System.out.println("2. Patterns");
        char decission = sc.next().charAt(0);
        sc.nextLine();
        Task tsk1 = new Task();
        Task2 tsk2 = new Task2();
        System.out.println(decission);

        switch (decission) {
            case '1':
                System.out.println("Biodata");
                System.out.println("Masukkan nama depan anda :");
                String firtsName = sc.nextLine();
                System.out.println("Masukkan nama belakang anda :");
                String lastName = sc.nextLine();
                System.out.println("Masukkan jenis kelamin P / L :");
                char jns_kelamin = sc.next().charAt(0);
                sc.nextLine();
                tsk1.Biodata(firtsName, lastName, jns_kelamin);
                break;
            case '2':
                System.out.println("Patterns");
                System.out.println("Masukkan angka");
                int n = sc.nextInt();
                sc.nextLine();
                tsk2.setPatterns(n);
                break;
            default:
                System.out.println("Tidak ada menu yang dipilih");
                break;
        }
    }
}
