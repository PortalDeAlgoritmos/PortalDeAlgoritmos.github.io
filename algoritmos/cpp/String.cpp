#include <iostream>
#include <string.h>
#define N 20
using namespace std;

void StrRead(char []);
void StrPrint(char []);

int main() {
  char Str[N];

  StrRead(Str);
  //printf("%s ",Str);
  StrPrint(Str);
  
  return 0;  
}


void StrRead(char Str[]){
  fgets(Str,N,stdin);
  if(Str[strlen(Str)-1]=='\n'){
    Str[strlen(Str)-1]='\0';
  }
}

void StrPrint(char Str[]){
  int i;
  for(i=0;i<strlen(Str);i++){
    printf("%c",Str[i]);
  }
}