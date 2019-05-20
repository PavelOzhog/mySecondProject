package HomeLesson6;

public class Builder {
    public static void main(String[] args) {
        String text = "fasterr faster easy clever immidealelly";
       char [] afterText = text.toCharArray();
      char [] oops = new char[afterText.length];
       for (int x = 0; x < afterText.length; x ++){
           for (int j = afterText.length-1 ; j >= 0; j--){
               oops [x] = afterText[j];
               x++;
           }
           //System.out.println(afterText[x]);

       }
        System.out.println(oops);
   String z = String.valueOf(oops);
        System.out.println(z);

      //int index = z.indexOf(a);
        System.out.println(z.indexOf("l"));

  String asd = "djdksdld";
  String qwe = "dcskdkfk";
  if (asd.equals(qwe)){
      System.out.println("петр");
  }
else {
      System.out.println("yfcnty,rf");
  }

    }
}
