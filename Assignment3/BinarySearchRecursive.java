
package javaassignment3;

public class BinarySearchRecursive {

    static int search(int[] arr,int low,int high,int key){

        if(low>high)
            return -1;

        int mid=(low+high)/2;

        if(arr[mid]==key)
            return mid;

        if(arr[mid]>key)
            return search(arr,low,mid-1,key);

        return search(arr,mid+1,high,key);
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};

        System.out.println(search(arr,0,arr.length-1,4));
    }
}
