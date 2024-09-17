package HeapSort;

public class OrdenaHeapSort {
    public void heapSort(int arr[]) {
        int n = arr.length;
        // n é o tamanho do array

        // Passo 1: Construindo o heap máximo
        // O último nó pai é no índice n/2 - 1
        // Só precisamos ir até a metade do vetor para conseguir definir todos os elementos da árvore binária
        for (int i = n / 2 - 1; i >= 0; i--) {
            aplicarHeap(arr, n, i);
            // Aqui devemos considerar o tamanho do vetor (arr). O tamanho do array (n). E a posição "i" que irá passar por cada nó e os seus respectivos filhos.

            // Agora vamos para a função aplicarHeap
        }

        // Passo 2: Diminuir os elementos do heap, um a um
        // Após aplicar a propriedade Heap em todos os elementos temos certeza que o maior número esta na raíz, portando só precisamos pega-lo e coloca-lo no final do vetor
        for (int j = n - 1; j > 0; j--) {
            // Move a raiz atual (o maior valor) para o final do array
            int aux = arr[0];
            arr[0] = arr[j];
            arr[j] = aux;

            // Toda vez que fizermos isso devemos aplicar a heapificação no heap reduzido
            aplicarHeap(arr, j, 0);
        }
    }

    // Função para manter a propriedade do heap
    void aplicarHeap(int arr[], int n, int i) {
        int raiz = i; // Inicialmente, o maior valor é a raiz.
        int left = 2 * i + 1; // Filho esquerdo
        int right = 2 * i + 2; // Filho direito

        // Se o filho esquerdo for maior que a raiz
        if (left < n && arr[left] > arr[raiz]) {
            raiz = left;
        }

        // Se o filho direito for maior que o maior valor até agora
        if (right < n && arr[right] > arr[raiz]) {
            raiz = right;
        }

        // Se o maior valor não for a raiz
        if (raiz != i) {
            // Troca a raiz com o maior valor encontrado
            int aux = arr[i];
            arr[i] = arr[raiz];
            arr[raiz] = aux;

            // Se houve uma troca, necessáriamente precisamos aplicar Recursivamente na subárvore afetada, para conseguirmos ordenar a árvore
            aplicarHeap(arr, n, raiz);
        }
    }



    // Função para imprimir o array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
