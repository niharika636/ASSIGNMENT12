
import java.util.*;
 class Collectionsorting
{
    public static void main(String a[])
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ACADVIEW");
        al.add("JAVA");
        al.add("PROGRAMMING");
        Collections.sort(al);
        System.out.println("LIST AFTER SORTING:" + al);
  ArrayList<Integer> al1=new ArrayList<Integer>();
  al1.add(40);
     al1.add(50);
     al1.add(10);
     al1.add(30);
al1.add(15);
     Collections.sort(al1);
     System.out.println("LIST AFTER SORTING:"+al1);

    }
}