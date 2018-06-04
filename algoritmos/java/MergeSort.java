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




public class MergeSort {
    
     
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.print("\n");
    }
    
   static void merge(int arr[], int l, int m, int r)
    {
        // Armazena o tamanho dos subarrays
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Cria os subarrays
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Preenche os arrays temporarios com os dados*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge (junta) os arrays temporarios */
 
        // Indices iniciais dos subarrays
        int i = 0, j = 0;
 
        // Indice inicial do array resultado 
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        // Copia os elementos restantes de L[], caso haja* /*
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
    // Copia os elementos restantes de L[], caso haja* 
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
     static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Encontra o ponto medio, para dividir o array em 2 arrays (subarrays)
            int m = (l+r)/2;
 
            // Ordena os subarrays
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge os subarrays
            merge(arr, l, m, r);
        }
    }
    
      public static void main(String[] args) {
        int array[] = {10, 5, 2, 8, 11};
        // antes de ordenar
        printArray(array);
        // ordenando o array
        sort(array, 0, array.length - 1);
        // depois de ordenar
        printArray(array);
    }
  
    
    
    
    
    
}
