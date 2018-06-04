/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimos;

/**
 *
 * @author Helio
 */




public class BuscaBinaria {
    
static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.print("\n");
    }    
    
// busca um elemento (parametro key) em um array de inteiros ORDENADO
static int buscaBinaria(
  int[] sortedArray, int key, int low, int high) {
    int index = Integer.MAX_VALUE;
     
    while (low <= high) {
        int mid = (low + high) / 2;
        if (sortedArray[mid] < key) {
            low = mid + 1;
        } else if (sortedArray[mid] > key) {
            high = mid - 1;
        } else if (sortedArray[mid] == key) {
            index = mid;
            break;
        }
    }
    // Se achou o elemento retorna o indice dele, caso nao tenha achado retorna -1
    if(index >= low && index <= high)
    return index;
    else
    return -1;    
}
    

public static void main(String[] args) {
        // Se o array nao estiver ordenado, é preciso ordenar antes de chamar a função buscaBinaria
        int array[] = {2,5,10,15,20,50,60};
        
        int answer = buscaBinaria(array,60,0,array.length-1);
        System.out.println(answer);

        
    }
    
}


