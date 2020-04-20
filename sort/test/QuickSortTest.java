import quicksort.QuickSort;

import java.util.Arrays;

/**
 * @ClassNmae: QuickSortTest
 * @Description: java类作用描述
 * @Author: zhulin
 * @CreateDate: 2020/4/20$ 17:48$
 * @UpdateUser: zhulin
 * @UpdateDate: 2020/4/20$ 17:48$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class QuickSortTest {
    public static void main(String[] args) {
        int []a=new int[]{8,9,2,5,7,3,6,1};
        QuickSort.quickSort(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
