import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        Tamagochi tamagochi = new Tamagochi();
        System.out.println("Name your Tamogochi!");
        tamagochi.name = sc.nextLine();

        System.out.println(tamagochi.name);

    }



}