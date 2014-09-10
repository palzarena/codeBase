public class HelloWorld{

     public static void main(String []args){
        String str = "Haaavvvv";
        char[] charac = str.toCharArray();
        removeDuplicates(charac);
        System.out.println(charac);
     }


     public static void removeDuplicates(char[] str) {
         if (str == null) return;
         int len = str.length;
         if (len < 2) return;
             
         for(int a=1; a< len; a++)
         {
           int b;
           for(b=0; b< a; b++)
          {
              if(str[b]==str[a])
                break;
          }
          if(b != a)
            str[a] = 0;
             
         }

     }

}