package strategyPattern2;

/**
 * Created by Administrator on 2018/11/28 0028.
 */
public class Handle {
    private ISort sort;

    public void setSort(ISort sort) {
        this.sort = sort;
    }

    public int[] sort(int[] a) {
        return sort.sort(a);
    }
}
