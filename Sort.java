package MyPack;

public class Sort extends Equip{
    public Sort(){
        try {
            int j = 0;
            while (j < n - 1) {
                if (weight_eq[j + 1] > weight_eq[j]) {
                    int b = weight_eq[j];
                    weight_eq[j] = weight_eq[j + 1];
                    weight_eq[j + 1] = b;

                    b = price_eq[j];
                    price_eq[j] = price_eq[j + 1];
                    price_eq[j + 1] = b;

                    String c = am_eq[j];
                    am_eq[j] = am_eq[j + 1];
                    am_eq[j + 1] = c;

                    j = 0;
                } else j++;
            }
        } catch(Exception e){}


    }

}
