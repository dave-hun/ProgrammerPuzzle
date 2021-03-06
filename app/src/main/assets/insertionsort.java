void insertionSort(int arr[]) {//1
    int n = arr.length;//2
    for (int i=1; i<n; ++i) {//3
        int key = arr[i];//4,5
        int j = i-1;//4,5
        while (j>=0 && arr[j] > key) {//6
            arr[j+1] = arr[j];//7
            j = j-1;//8
        }//9,11,12
        arr[j+1] = key;//10
    }//9,11,12
}//9,11,12
//DESCRIPTION:
Create a Java method that implements insertion sort on an array.
Algorithm:
Loop from i = 1 to n-1.
	Pick element arr[i] and insert it into sorted sequence arr[0…i-1]