package instaceof;

import textblocks.TextBlocks;

public class Instaceof {

    public Instaceof(Object o){
        newInstanceOf(o);
    }

    public void oldInstanceOf(Object o){
        if((o instanceof Integer)){
            if((Integer)o >=10){
                Integer integerNew = (Integer) o;
                System.out.println(integerNew);
            }
        }
        if(o instanceof String){
            String string = (String) o;
            System.out.println(string.toUpperCase());
        }
    }

    public void newInstanceOf(Object o){
        if((o instanceof Integer integerNew) && integerNew>=10){
            System.out.println(integerNew);
        }
        if(o instanceof String s){
            System.out.println(s.toUpperCase());
        }
    }

    public static void main(String[] args) {
        new Instaceof(10);
//        new Instaceof(9);
    }
}
