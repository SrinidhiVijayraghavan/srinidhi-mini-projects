Matrix multiplicatoin :
1 import java.util.Scanner;
 2  
 3 public class MatixMultiplication
 4 {
 5     public static void main(String args[])
 6     {
 7         int n;
 8         Scanner input = new Scanner(System.in);
 9         System.out.println("Enter the base of squared matrices");
10         n = input.nextInt();
11         int[][] a = new int[n][n];
12         int[][] b = new int[n][n];
13         int[][] c = new int[n][n];
14         System.out.println("Enter the elements of 1st martix row wise \n");
15         for (int i = 0; i < n; i++)
16         {
17             for (int j = 0; j < n; j++)
18             {
19                 a[i][j] = input.nextInt();
20             }
21         }
22         System.out.println("Enter the elements of 2nd martix row wise \n");
23         for (int i = 0; i < n; i++)
24         {
25             for (int j = 0; j < n; j++)
26             {
27                 b[i][j] = input.nextInt();
28             }
29         }
30         System.out.println("Multiplying the matrices...");
31         for (int i = 0; i < n; i++)
32         {
33             for (int j = 0; j < n; j++)
34             {
35                 for (int k = 0; k < n; k++)
36                 {
37                     c[i][j] = c[i][j] + a[i][k] * b[k][j];
38                 }
39             }
40         }
41         System.out.println("The product is:");
42         for (int i = 0; i < n; i++)
43         {
44             for (int j = 0; j < n; j++)
45             {
46                 System.out.print(c[i][j] + " ");
47             }
48             System.out.println();
49         }
50         input.close();
51     }
52 }

Matrix addition:
  1 import java.util.*;
  2 class Sum_first_matrix
  3 {
  4 Scanner obj;
  5 int m,n,i,j;
  6 int [][] a;
  7 int [][] b;
  8 int [][] c;
  9 public void matrix_create()
 10 {
 11  obj=new Scanner(System.in);
 12 System.out.println("Enter The rows and columns");
 13  m=obj.nextInt();
 14  n=obj.nextInt();
 15 System.out.println("Enter the array elements");
 16  a=new int[m][n];
 17  b=new int [m][n];
 18  c=new int[m][n];
 19 for(i=0;i<m;i++)
 20 {
 21 for(j=0;j<n;j++)
 22 {
 23 a[i][j]=obj.nextInt();
 24 }
 25 }
 26 }
 27  void display()
 28 {
 29 System.out.println("The array is");
 30 for(int i=0;i<m;i++)
 31 {
 32 for(int j=0;j<n;j++)
 33 {
 34 System.out.print("\t" + a[i][j]);
 35 }
 36 System.out.println();
 37 }
 38 }
 39 public void second_matrix_create()
 40 {
 41  
 42 System.out.println("Enter the Second array elements");
 43  
 44 for(i=0;i<m;i++)
 45 {
 46 for(j=0;j<n;j++)
 47 {
 48 b[i][j]=obj.nextInt();
 49 }
 50 }
 51 }
 52  void second_display()
 53 {
 54 System.out.println("The array is");
 55 for(int i=0;i<m;i++)
 56 {
 57 for(int j=0;j<n;j++)
 58 {
 59 System.out.print("\t" + b[i][j]);
 60 }
 61 System.out.println();
 62 }
 63 }
 64 }
 65 class Second_matrix extends Sum_first_matrix
 66 {
 67 public void add()
 68 {
 69  
 70 for(int i=0;i<m;i++)
 71 {
 72 for(int j=0;j<n;j++)
 73 {
 74 c[i][j]= a[i][j] + b[i][j];
 75 }
 76 }
 77 }
 78 void add_display()
 79 {
 80 System.out.println("The Summed array is");
 81 for(int i=0;i<m;i++)
 82 {
 83 for(int j=0;j<n;j++)
 84 {
 85 System.out.print("\t" + c[i][j]);
 86 }
 87 System.out.println();
 88 }
 89 }
 90 }
 91 class Main
 92 {
 93 public static void main(String args[])
 94 {
 95 Second_matrix obj1=new Second_matrix();
 96 obj1.matrix_create();
 97 obj1.display();
 98 obj1.second_matrix_create();
 99 obj1.second_display();
100 obj1.add();
101 obj1.add_display();
102 }
103 }
