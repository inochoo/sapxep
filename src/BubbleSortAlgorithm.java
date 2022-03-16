public class BubbleSortAlgorithm {
    static void bubbleSort(int array[]){
        int size = array.length;
        // loop to access each array element
        for (int i=0;i<size-1; i++){
            // loop to compare array elements
            for (int j=0; j<size-i-1;j++){
                // swapping occurs if elements
                // are not in the intended order
                if(array[j] > array[j+1]){
                    int index = array[j];
                    array[j] = array[j+1];
                    array[j+1] = index;
                }

            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {-2,0,6,11,-9};
        BubbleSortAlgorithm.bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
