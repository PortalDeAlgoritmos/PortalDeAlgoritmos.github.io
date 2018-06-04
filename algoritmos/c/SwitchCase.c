#include <iostream>
using namespace std;

int main() {
  char D;
    scanf("%c",&D);
  switch(D){
    case 'w':
      printf("up");
      break;
    case 's':
      printf("down");
      break;
    case 'a':
      printf("left");
      break;
    case 'd':
      printf("right");
      break;
  }


  return 0;
}