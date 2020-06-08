package MyPack;

import java.util.Scanner;

public class Equip extends Hierarchy{
    Scanner sc = new Scanner(System.in);
    public int n;
    public String []am_eq;
    public int []price_eq;
    public int []weight_eq;

    public Equip(){
        try {

           // System.out.println("\nУкажите количество амуниции у Рыцаря: ");
            this.n = 4;
            this.am_eq = new String[n];
            this.price_eq = new int[n];
            this.weight_eq = new int[n];

            //for (int i = 0; i < m; i++) {
            //    System.out.println(i + ": " + am[i] + " " + price[i]);
            //}

            //System.out.println();

            for (int i = 0; i < n; i++) {
                //System.out.println("Выберите амуницию по индексу: ");
                //int j = sc.nextInt();
                am_eq[i] = am[i];
                price_eq[i] = price[i];
                weight_eq[i] = weight[i];
            }
        } catch(Exception e){}
    }


}
