
package javaassignment3;
public class RotatedSearch {

    public static void main(String[] args) {

        int[] arr={4,5,6,7,0,1,2};
        int target=0;

        int l=0,h=arr.length-1;

        while(l<=h){

            int mid=(l+h)/2;

            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }

            if(arr[l]<=arr[mid]){
                if(target>=arr[l] && target<arr[mid])
                    h=mid-1;
                else
                    l=mid+1;
            }
            else{
                if(target>arr[mid] && target<=arr[h])
                    l=mid+1;
                else
                    h=mid-1;
            }
        }
    }
}
