package Sorting;

public class Selection_sort {
    public static void selectionSort(int[]arr){
        for(int i=0;i<arr.length;i++){
int mini=i;
for(int j=i+1;j<arr.length;j++){
    if(arr[j]<arr[mini]){
        mini=j;
    }
}
int temp=arr[i];
arr[i]=arr[mini];
arr[mini]=temp;

        }
    }
    public static void main(String[] args) {
        int []arr={1,4,-7,56,43};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
        }
    }
}
