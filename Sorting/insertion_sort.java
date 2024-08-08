package Sorting;

public class insertion_sort {
    public static void insertionSort(int[]arr){
        for(int i=1;i<arr.length;i++){
int picked=arr[i];
int j=i-1;
while(j>=0&&arr[j]>picked){
    arr[j+1]=arr[j];
    j--;

}
arr[j+1]=picked;
        }
    }
    public static void main(String[] args) {
        int []arr={1,4,-7,56,43};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
        }
    }
}
