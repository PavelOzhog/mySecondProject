package HomeLesson6;

public class Calculations {
    public static double triangleArea(double storonaA, double storonaB, double storonaC) {
        double polyPerimetr = (storonaA + storonaB + storonaC) * 0.5;
        double doKvadratnogoKornya = polyPerimetr * (polyPerimetr - storonaA) * (polyPerimetr - storonaB) * (polyPerimetr - storonaC);
        double ploshadTreygolniga = Math.sqrt(doKvadratnogoKornya);
        return ploshadTreygolniga;
    }

    //    public static int chetn (char f, char b){
//        System.out.println(f);
//    return f;
//    }
    public static int chetnoe(int[] numb) {
        int chetnoeNumber = 0;

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] % 2 == 0) {
                chetnoeNumber = numb[i];
                System.out.println(numb[i]);
            }
        }
        return chetnoeNumber;
    }

    public static char metod(char[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 'i') {
                System.out.println("настенька");
            }
        }
    char h = 0;
        return h;
}
 public static double summaDrobei (int chislitel1, int chislitel2, int znamenatel1, int znamenatel2){
//       double drob1 = chislitel1 / znamenatel1;
//       double drob2 = chislitel2 / znamenatel2;
//       double summa = drob1 + drob2;


        double summDrob = 0;
        double vivod = 0;
       if (znamenatel1 != znamenatel2 && znamenatel1 != 0 && znamenatel2 != 0){
       double chislitelNew1 =  chislitel1  * znamenatel2;
       double chislitelNew2 = chislitel2  * znamenatel1;
       double znamenatelNew = znamenatel1 * znamenatel2;
       double chislitSumm = chislitelNew1 + chislitelNew2;
       vivod = chislitSumm / znamenatelNew;
       summDrob = vivod;

           System.out.println(chislitSumm + '/' + znamenatelNew );
       }


     System.out.println(summDrob);
        return summDrob;

 }



}
