package strategyPattern2;

/**
 * Created by Administrator on 2018/11/28 0028.
 */
public class BubbleSort implements ISort {
    public int[] sort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
