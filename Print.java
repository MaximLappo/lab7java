package MyPack;

public class Print extends Sort{
    public String print(){
            String s = "";
            try{
            for (int i = 0; i < n; i++) {
                s += "\n" + am_eq[i] + " Цена: " + String.valueOf(price_eq[i]) + " Вес: " + String.valueOf(weight_eq[i]);
                s += " ";
            }
        } catch(Exception e){}

            return s;
    }

    public String full_price(){
            int full_price = 0;
            try {
                for (int i = 0; i < n; i++) {
                    full_price += price_eq[i];
                }
            }catch(Exception e){}

            return String.valueOf(full_price);
    }
}
