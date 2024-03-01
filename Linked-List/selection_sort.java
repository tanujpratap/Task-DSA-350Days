public class selection_sort {
    public static void main(String[]args){
int []arr={6,7,4,5};
sort(arr);
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
    }
    public static void sort(int[]arr){
    
        for(int i=0;i<arr.length;i++){
            int min=i;
for(int j=i+1;i<arr.length;i++ ){
   

if(arr[j]<arr[i]){
    min=j;
    int temp=arr[min];
    arr[min]=arr[j];
    arr[j]=temp;
}
}
        }
    }
    
}
