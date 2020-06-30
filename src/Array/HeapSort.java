package Array;

import java.util.Arrays;

/**堆排序
 * @author grady
 * @date 20-6-29 下午3:38
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        //构建大顶堆
        for (int i = arr.length/2 - 1; i >= 0; i--) {
            adjustHeap(arr,i,arr.length);
        }
        //调整堆结构+交换堆顶元素和末尾元素
        for (int j = arr.length-1; j > 0; j--) {
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }
    }


    private static void adjustHeap(int[] arr, int i, int length) {
        //把当前元素取出来
        int temp = arr[i];
        //让k先指向子节点中最大的节点
        for (int k = 2*i+1; k < length; k=2*k+1) {//如果有右子树并且右子树大于左子树
            if (k+1 < length && arr[k]<arr[k+1]){
                k++;
            }
            if (arr[k] > temp){
                swap(arr,i,k);
                i = k;
            }else {
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置

    }

    /**
     * 交换元素
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
