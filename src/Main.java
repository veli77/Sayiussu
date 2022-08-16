import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi;
        sayi= giris.nextInt();

        for (int i=4,j=5;i<=sayi;j=j*5){


            System.out.print(" "+i+"   ");
            i=i*4;
            if (j>sayi){
                System.out.print(" \n");
                continue;
            }
            System.out.print(" "+j+"\n");


        }
    }
}
