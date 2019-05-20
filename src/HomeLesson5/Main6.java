package HomeLesson5;

public class Main6 {
    public static void main(String[] args) {
        String text = "It is great day to do something";
        char [] symb = text.toCharArray();



        String alphabet = "abcdefghijklmnopqrstuvwxyz";
            char []alphChar = alphabet.toCharArray();
        //int t = alphabet.indexOf("It is great day to do something");
       // System.out.println(t);


           for (int i = 0; i < symb.length; i++){
              for (int j = 0; j < alphabet.length(); j++)
                  System.out.println(( alphChar[j] + "-" +  alphabet.indexOf(symb[i])));
           }


            }
        }



