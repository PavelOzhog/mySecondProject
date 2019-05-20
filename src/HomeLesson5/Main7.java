package HomeLesson5;

public class Main7 {
    public static void main(String[] args) {
        char[] numb = {'1', '2', '3', '4', '5', '6', '7',};

        int cout = 1;
        for (int i = 0; i < numb.length; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(cout + "");
                cout++;
            }
            System.out.println();
        }
    }
}
