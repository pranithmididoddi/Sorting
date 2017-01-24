/**
 * Created by Pranith on 1/23/17.
 */
public class Solutions {

    public static void main(String[] args){
        int[] array={2,1,7,4,9};
        selectionSort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void selectionSort(int[] array){
        int min=0;
        for(int i=0;i<array.length-2;i++){
            for(int j=i+1;j<array.length-1;j++){
                if(array[j]<array[i]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
