package HomeLesson5;


public class Main8 {
    public static void main(String[] args) {
        String text = "Hit Ledger play goo joker";
        String [] textAfterSplit = text.split(" ");
        for (int i = 0; i < textAfterSplit.length; i++){

        StringBuilder soft =  new StringBuilder(textAfterSplit[i]);
        soft.reverse();
        soft.toString();
            System.out.println(soft);
        }

    }
}
