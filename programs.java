// Example no 2
// import java.util.*;
// class Test
// {
//     public static void main(String[] args) {
//         Scanner pd = new Scanner(System.in);
//         System.out.println("Enter the No:");
//         int p = pd.nextInt();
//         int reverseno = 0;
//         int remainder;
//         while (p!=0) {
//             remainder  = p%10;
//             reverseno = reverseno*10+remainder;
//             p = p /10;
//         }
//         System.out.println(reverseno);
//     }
// }

// import java.util.Scanner;

// class Pd{
//     public static void main(String[] args) {
//         Scanner pd  = new Scanner(System.in);
//         System.out.println("Enter the character:");
//         char c = pd.next().charAt(0);
//         // if(c >=32 && c <=47 || c >=58 && c <= 64 )
//         // {
//         //     System.out.println("It is special character");
//         // }
//          if(c >=48 && c <= 57)
//         {
//             System.out.println("It is integer");
//         }
//         else if(c >= 65 && c <=90 || c >= 97 && c <= 122)
//         {
//             System.out.println("It is Character");
//         }
//         else
//         {
//             System.out.println("It is Special Character");
//         }
//     }
// }

import java.util.*;
class Pd
{
    public static void main(String[] args) {
        int p[] = new int[5];
        Scanner pd = new Scanner(System.in);
        System.out.println("Enter the value:");
        for(int i = 0 ; i < p.length ; i++)
        {
            p[i] = pd.nextInt();
        }

        System.out.println("Display array:");
        for(int i = 0 ; i < p.length ; i++)
        {
           System.out.println(p[i]);
        }

        System.out.println("=============================");
        for(int i = 0 ; i < p.length ; i++)
        {
        int dep = p[i];
        for(int j = 0 ; j < p.length ; j++)
        {
           if (p[i]==p[j]) {
            System.out.println("Duplicate is:"+p[i]);
        }
        break;
          
        }
       
        }
        
    }
}
// i want to add this file on my repo
// Hello im abhii bro 