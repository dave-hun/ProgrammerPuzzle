bool hasArrayTwoCandidates(int A[], int arr_size, int sum) {//1
    int left, right;//2
    sort(A, A + arr_size);//-3
    left = 0;//4,5
    right = arr_size - 1;//4,5
    while (left < right) {//6
        if(A[left] + A[right] == sum) {//7
			return 1;//8
		}//9,12,15,16,18
        else if(A[left] + A[right] < sum) {//10
			left++;//11
		}//9,12,15,16,18
        else {//13
			right--;//14
		}//9,12,15,16,18
    }//9,12,15,16,18
    return 0;//17
}//9,12,15,16,18

// Function to check if array has 2 elements 
// whose sum is equal to the given value