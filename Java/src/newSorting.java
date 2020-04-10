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
        quickSort(arr, 1, arr.length-1);
    }
    private void quickSort(int arr[], int less, int more) {
        //base case: if the array has only one element
        if(arr.length == 1){
            return;
        }
        int pivot = arr[0];
        int start = 1;
        int end = arr.length-1;
        while(less < more){
            if(less <= arr[end] && arr[less] <= pivot){
                less++;
            }
            if(more >= arr[start] && arr[more] > pivot){
                more--;
            }
            if(less > more){
                //swap
                int temp = arr[less];
                arr[less] = arr[more];
                arr[more] = temp;
            }
        }
        int temp = arr[start-1];
        arr[start-1] = arr[more];
        arr[more] = temp;
        //recursive calls on both sides

    }
    private void mergeSortedHalves(int[] arr, int[] left, int[] right){
        int l = 0;
        int r = 0;
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
