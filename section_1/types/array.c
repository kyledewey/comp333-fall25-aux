#include <stdio.h>

void print_elem(int array[], int index) {
  int element = array[index];
  printf("%i\n", element);
}
  
int main() {
  int temp = 89;
  int arr[5] = {3, 2, 5, 7, 8};
  // 3: 1
  // 4: seemingly-random values
  // 1234567: segmentation fault
  // -1: 0
  // -4: seemingly-random values
  // -1234567: 0
  // -123456789: segmentation fault
  print_elem(arr, -1);
  return 0;
}
