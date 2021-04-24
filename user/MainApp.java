package user;

import java.util.Scanner;

public class MainApp {
    static Shop shop = new Shop();

    public static void main(String[] args) {
        while (true) {
            runShop();
        }
    }

    public static int selection() {
        Scanner input = new Scanner(System.in);
        int result = 0;
        while (result < 1 || result > 6) {
            System.out.println();
            System.out.println("***********selection***********");
            System.out.println("1 pour ajouter un nouvelle article");
            System.out.println("2 pour acheter un  article");
            System.out.println("3 pour vendre un  article");
            System.out.println("4 pour afficher les articles du magasin");
            System.out.println("5 pour afficher le resultat");
            System.out.println("6 pour fermer le programme");
            System.out.print("votr sélection");
            result = input.nextInt();
            System.out.println();
        }
        return result;
    }

    public static void runShop() {
        switch (selection()) {
            case 1:
                shop.addToArticle();
                break;
            case 2:
                shop.buyArticle();
                break;
            case 3:
                shop.sellArticle();
                break;
            case 4:
                shop.printAll();
                break;
            case 5:
                shop.result();
                break;
            case 6:
                System.exit(0);
                break;
        }
    }
}
