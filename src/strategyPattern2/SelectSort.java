package strategyPattern2;

/**
 * Created by Administrator on 2018/11/28 0028.
 */
public class SelectSort implements ISort {
    public int[] sort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int temp = a[i];
            int selectIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (a[j] < temp) {
                    temp = a[j];
                    selectIndex = j;
                }
            }
            a[selectIndex] = a[i];
            a[i] = temp;

        }
        return a;
    }
}
