#include <iostream> 

using namespace std; 

int main() { 

int B,K; 

printf("Digite o valor de B: "); 
scanf("%i", &B); 
printf("Digite o valor de K: "); 
scanf("%i", &K); 

while (K < B){  // Repete ate se tornar verdadeiro   
  K = K + 1; 
  printf("K recebeu + 1\n"); 
} 

return 0; 

} 