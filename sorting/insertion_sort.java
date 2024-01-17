public class insertion_sort{
    public static void main(String[]args){

int[]arr={3,5,2,4,6};
insertion_sort(arr);
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+" ");
}
    }
    public static void insertion_sort(int []arr){
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
}