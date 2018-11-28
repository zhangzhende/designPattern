package strategyPattern2;

/**
 * Created by Administrator on 2018/11/28 0028.
 */
public class InsertSort implements ISort {
    public int[] sort(int[] a) {
        int len = a.length;
        for (int i = 1; i < len; i++) {
            int temp = a[i];
            int j;
            for (j = i; j > 0; j--) {
                if (a[j - 1] > temp) {
                    a[j] = a[j - 1];//数据后移
                } else {
                    break;
                }
            }
            a[j] = temp;
        }
        return a;
    }
}
