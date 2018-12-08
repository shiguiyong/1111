public class demo01 {
    /* public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getMonth()+"+"+date.getDate());
        }*/
  /* public  static String output="";
   public static void foo(int i){
       try{
           if(i==1){
               throw  new Exception();
           }
           output+="1";
       } catch (Exception e) {
          output+="2";
          return;
       }
       finally {
           output+="3";
       }
       output+="4";

   }

    public static void main(String[] args) {
        foo(0);
        foo(1);
        System.out.println(output);
    }*/

    /*public static void add3(Integer i) {
        int val = i.intValue();
        val += 3;
        i = new Integer(val);

    }

    public static void main(String[] args) {
        Integer i = new Integer(0);
        add3(i);

        System.out.println(i.intValue());
    }*/
    public static void stringRcplace(String text) {
        text=text.replace("i","1");
    }
    public static void bufferRcplace(StringBuffer text) {
        text=text.append("c");
    }

    public static void main(String[] args) {
        String textString=new String("java");
        StringBuffer textBuffer=new StringBuffer("java");
        stringRcplace(textString);
        bufferRcplace(textBuffer);
        System.out.println(textString+textBuffer);
    }
}
