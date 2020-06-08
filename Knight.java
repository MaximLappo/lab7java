package MyPack;

public class Knight extends Print{
    public String index;
    public Knight(String index){
        this.index=index;
    }

    public String Print_Knight(){
        return "\nРыцарь: " + index + "\nАмуниция: " + print() + "\nВся стоимость амуниции: " + full_price();
    }
}
