package Ex14String;

import org.w3c.dom.ls.LSOutput;

public class LastStringprint {

    public static void main(String[] args) {
        String str="Aeroplane";
        /*LastStringprint obj=new LastStringprint();
        System.out.println(obj.str.charAt(obj.str.length()-1));
        System.out.println(obj.str.substring(obj.str.length()-1));
        for(int i=obj.str.length()-1;i>=obj.str.length()-3;i--)
        {
            System.out.print(obj.str.charAt(i));


        }*/
        String lastthree=str.substring(str.length()-3);
        System.out.println(lastthree);

    }

}
