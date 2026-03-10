
package javaassignment3;

public class FirstLast {

    static int first(int[] arr,int x){
        for(int i=0;i<arr.length;i++)
            if(arr[i]==x)
                return i;
        return -1;
    }

    static int last(int[] arr,int x){
        for(int i=arr.length-1;i>=0;i--)
            if(arr[i]==x)
                return i;
        return -1;
    }

    public static void main(String[] args) {

        int[] arr={1,2,2,2,3,4};

        System.out.println(first(arr,2));
        System.out.println(last(arr,2));
    }
}
