#include <stdio.h>

void print_element(int array[], int index) {
  int element = array[index];
  printf("%i\n", element);
}

int main() {
  int arr[3] = {2, 5, 7};
  int temp = 8;
  // -123456789: segmentation fault
  // -5: 1
  // -1: 0
  // 3: 1
  // 4: random-looking numbers
  // 123456789: random-looking numbers OR segmentation fault
  print_element(arr, 3);
  return 0;
}
