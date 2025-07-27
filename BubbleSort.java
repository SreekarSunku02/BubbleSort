package Institute;

import java.util.*;
class BubbbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int i,j;
        int a[] = new int[n];

        System.out.println("enter num: ");
        for(i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        
        for(i = 0;i < n - 1; i++){
            for(j = 0;j < n -1;j++){
                if(a[j] > a[j + 1]){
                    int k = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = k;
                }
            }
        }
        System.out.println("the output is: ");
        for(i = 0;i < n; i++){
           
            System.out.println(a[i] + " ");
        }
        
        System.out.println();
        sc.close();
    }
}