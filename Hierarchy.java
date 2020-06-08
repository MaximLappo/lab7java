package MyPack;

import java.util.Scanner;

public class Hierarchy{

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int m;
        String[] am;
        int[] price;
        int[] weight;

    public Hierarchy() {
        try {
            //System.out.println("\nУкажите количество возможной амуниции: ");
            this.m = 4;
            this.am = new String[]{"Шлем", "Нагрудник", "Перчатки", "Кольчуга"};
            this.price = new int[]{230, 350, 150, 200};
            this.weight = new int[]{200, 450, 65, 125};

            /*for (int i = 0; i < m; i++) {
                //System.out.println("\nУкажите название амуниции: ");
                this.am[i] = sc1.nextLine();
                //System.out.println("Укажите цену: ");
                this.price[i] = sc.nextInt();
                //System.out.println("Укажите вес: ");
                this.weight[i] = sc.nextInt();
            }*/
        } catch(Exception e){}
    }
}
