public class newSorting {
    public void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
       newSorting(arr, 4);
    }
    public void newSorting(int[] arr, int size){
        //base case
        if(arr.length <= size){
            //do quickSort
            quickSort(arr);
            return;
        }
        int middle = arr.length/2;
        int[] left = new int[middle];
        int[] right = new int[arr.length-middle];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            //populate both arrays
            if(i < middle){
                left[i] = arr[i];
            }else{
                right[k] = arr[i];
                k++;
            }
        }
        newSorting(left, size);
        newSorting(right,size);
        //MERGE
        mergeSortedHalves(arr, left, right);
    }
    private void quickSort(int[] arr){
        quickSort(arr, 0, arr.length);
    }
    private void quickSort(int[] arr, int less, int more) {
        //base case: if the array has only one element
        if(arr.length <= 1){
            return;
        }
        if(less < more && less >= 0){
            //call partition method
            int partition = partitionArray(arr, less, more);

            //recursive calls on both sides
            //left side
            quickSort(arr, less, partition-1);
            //right side
            quickSort(arr, partition+1, more);
        }
    }
    public int partitionArray(int[] arr, int begin, int end){
        int pivot = arr[begin];
        for(int k = begin; k < end; k++){
            if(arr[k] > pivot){
                int temp = pivot;
                pivot = arr[k];
                arr[begin] = temp;
                begin++;
            }else if(arr[k] < pivot){
                int temp = arr[k];
                arr[k] = pivot;
                arr[begin] = temp;
                begin++;
            }
        }
        return end;
    }
    private void mergeSortedHalves(int[] arr, int[] left, int[] right){
        int l = 0;
        int r = 0;
        //boolean variable to check if both halves still have elements to merge
        boolean end = false;
        for(int k = 0; k < arr.length; k++) {
            if(l < left.length && r < right.length){
                end = true;
            }
            if (end) {
                if (right[r] >= left[l]) {
                    arr[k] = left[l];
                    l++;
                } else {
                    arr[k] = right[r];
                    r++;
                }
            }else{
                //if there is a half that has no elements left, populate the rest of the array with the other half
                if(l >= left.length){
                    arr[k] = right[r];
                    r++;
                }else if(r >= right.length){
                    arr[k] = left[l];
                    l++;
                }
            }
            end = false;
        }

    }


}
