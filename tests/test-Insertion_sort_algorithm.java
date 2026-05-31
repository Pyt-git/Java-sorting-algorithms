import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest { 

  @Test
  void testSinglePositiveElementSort() {
    int [] arr = {7};
    assertArrayEquals(new int[]{7}, InsertionSort.insertionSort(arr)); 
  }

  @Test
  void testSingleNegativeElementSort() { 
    int arr = {-2}; 
    assertArrayEquals(new int[]{-2}, InsertionSort.insertionSort(arr));
  }

  @Test
  void testPositiveArraySort() { 
    int arr = {2, 5, 6, 8, 3}; 
    assertArrayEquals(new int[]{2, 3, 5, 6, 8}, InsertionSort.insertionSort(arr));
  }

  @Test
  void testNegativeArraySort() { 
    int arr = {-3, -5, -6, -1, -7}; 
    assertArrayEquals(new int[]{-7, -6, -5, -3, -1}, InsertionSort.insertionSort(arr)); 
  } 

  @Test
  void testMixedSignArraySort() { 
    int arr = {2, 0, -4, 3, -2, -7};
    assertArrayEquals(new int[]{-7, -4, -2, 0, 2, 3}, InsertionSort.insertionSort(arr)); 
  } 

  @Test
  void testEmptyArraySort() { 
    int arr = {};
    assertArrayEquals(new int[]{}, Insertionsort.insertionSort(arr));
  }
}
      
  
