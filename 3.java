import java.lang.*;
import java.util.*;
class demo{
public static <T>void disp(T l1[]) {
int i;
for(i=0;i<l1.length;i++)
      System.out.println(l1[i]);
  }
public static void main(String a[]){
 Integer l1[] = {10,20,40,60};
    Character l2[]= { 'a','c','a','d','v','i','e','w' };
      System.out.println("INTEGER ARRAY:");
      disp(l1); 
    System.out.println("CHARACTER ARRAY:");
    disp(l2); 
  } 
}