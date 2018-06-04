#include <iostream>
using namespace std;

int Min(float a,float b);
int Max(float a,float b);

int main() {
  float a, b, c;
  
  scanf("%f%f",&a,&b);
  
  c=Min(a,b);
  printf("Min: %.2f\n",c);

  c=Max(a,b);
  printf("Max: %.2f\n",c);
  
  return 0;
}

int Min(float a, float b) {
  return (a<b)?a:b;
}

int Max(float a, float b) {
  return (a>b)?a:b;
}