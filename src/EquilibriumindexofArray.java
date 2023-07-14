import java.util.Scanner;

public class EquilibriumindexofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(equilibriumValue(array,size));
    }
    public static int equilibriumValue(int[] array,int size)
    {
        int p[] = new int[size];
        p[0] = array[0];// -7 -6 -1 1 -3 0 0

        for(int i=1;i<size;i++)
        {
            p[i] = p[i-1] + array[i];
        }
        for(int i=1;i<size;i++)
        {
            if(p[i-1] == p[size-1]-p[i]){// -7==0-6..-6==0-1...-1==0-1
                return i;
            }
        }
        return -1;
    }
}
//The equilibrium index of an array is an index such that
// the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
//Input
//A = [-7, 1, 5, 2, -4, 3, 0]
//Output
//3
