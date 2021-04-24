package user;

import java.util.Scanner;

public class Shop {
    private double expenses, income;
    private Article[] articles = new Article[100];
    static Scanner input = new Scanner(System.in);

    public Article createNewArticle() {
        String articleName = null;
        double buyPrice = 0, sellPrice = 0;
        //controler s'il y a un nom ,un prix d'achat et un prix de vente
        //si pas on recommence.
        while (articleName == null || buyPrice == 0 || sellPrice == 0) {
            System.out.print("Nom d'article:");
            articleName = input.nextLine();
            System.out.println("prix d'achat");
            buyPrice = input.nextDouble();
            System.out.println("Prix de vente:");
            sellPrice = input.nextDouble();
            input.nextLine();
            System.out.println();
        }
        //creer et retourne un nouvelle article avec les information
        return new Article(articleName, buyPrice, sellPrice);
    }

    //Ajouter des article
    public void addToArticle() {
        for (int i = 0; i < articles.length; i++) {
            if (articles[i] == null) {
                articles[i] = createNewArticle();
                i = articles.length;
            }
        }
    }

    //Imprimer Article
    public void printAll() {
        for (int i = 0; i < articles.length; i++) {
            if (articles[i] != null) {
                System.out.println("Numero:" + (i + 1) + "Nom:" + articles[i].getName() + "stock:" + articles[i].getStock());

            }
        }


    }

    public void buyArticle() {
        int articleNumber = -1, qty = 0;
        //creer une boucle tant que le numero d'article n'es pas valide
        //la validation verifie aussi si l'article existe ou pas
        while (articleNumber < 0 || articles[articleNumber] == null) {
            System.out.println("numero darticle acheter:");
            articleNumber = input.nextInt() - 1;
            input.nextLine();
        }
        System.out.println();
        //creer boucle tant que la quantite est <1
        while (qty < 1) {
            System.out.println("Nombre d'articles acheter:");
            qty = input.nextInt();
            //augmente le stock
            articles[articleNumber].setStock(articles
                    [articleNumber].getStock() + qty);
            //Augmente les dépenses par le nombre d'articles acheter
            expenses += articles[articleNumber].getBuyPrice() * qty;
        }
    }

    //verifiant cela ajoutant et afficher resultat retourner linge  42publi
    public void result() {
        System.out.println(income - expenses + "Dinar");
    }

    //vendre Article
    public void sellArticle() {
        int articleNumber = -1, qty = 0;
        //creer une boucle tant que le numero d'article n'es pas valide
        //la validation verifie aussi si l'article existe ou pas
        while (articleNumber < 0 || articles[articleNumber] == null) {
            System.out.println("numero darticle vendue:");
            articleNumber = input.nextInt() - 1;
            input.nextLine();
        }
        System.out.println();
        //creer boucle tant que la quantite est <1
        while (qty < 1 || articles[articleNumber].getStock() < qty) {
            System.out.println("Nombre d'articles acheter:");
            qty = input.nextInt();
            //si la qty>le stock on informe l'utilisateur
            if (qty > articles[articleNumber].getStock()) {
                System.out.println("La quantité en vente est plus grande que la quantité en stock");
                System.out.println();
            }
        }
        //diminue le stock
        articles[articleNumber].setStock(articles[articleNumber].getStock() - qty);
        //augmente les entrees par le nombre d'article vendue
        income += articles[articleNumber].getSellPrice() * qty;
    }
}
