package Advance_sorting;
public class mergeTwoSortedArray {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[]a,int[]b,int []c){
        int i =0,j=0,k=0;
        while(i<a.length && j< b.length){
            if(a[i]<b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
    public static void main(String[] args) {
        int[] a = {10,20,30,50,60,80,90};
        int [] b = {40,70,100};
        print(a);
        print(b);
        int [] c = new int[a.length+ b.length];
        merge(a,b,c);
        print(c);
    }
}
