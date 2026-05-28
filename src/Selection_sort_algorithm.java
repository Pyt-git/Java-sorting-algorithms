public static void selectionSort(int [] array) {
  for (int index = 0; index < array.length - 1; i++) {
    int minIndex = index;

    for (int j = index + 1; j < arr.length; j++) {
      if (array[j] < arr[minIndex]) {
        minIndex = j;
      }
    }

    int temp = array[index]; 
    array[index] = array[minIndex];
    array[minIndex] = temp; 
  }
}
