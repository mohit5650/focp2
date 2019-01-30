import java.util.*;
class arraycw2{
   public static void main(String args[])
   {int array[],i,position;
   array = new int[10];
   Scanner s1 = new Scanner(System.in);
   System.out.print("Input number of elements in array\n");
   int n = s1.nextInt();
   System.out.println("Input the numbers", n);
 
   for (i = 0; i < n; i++)
      array[i]= s1.nextInt();
 
  System.out.print("Input a number to search\n");
   int search = s1.nextInt();
   position = linear_search(array, n, search);
 
   if (position == -1)
      System.out.println(+search+ "isn't present in the array");
   else
      System.out.println(+search+"is present at location" +position+1);
 }
 
  void Array2(int a[], int n, int find) {
   int i;
 
   for (i = 0 ;i < n ; i++ ) {
      if (array[i] == find)
         System.out.print(+i);
   }
 
  return -1;
}}