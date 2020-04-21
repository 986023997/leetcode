import selectionsort.SelectionSort;

import java.util.Arrays;

/**
 * @ClassNmae: SelectionSortTest
 * @Description: java类作用描述
 * @Author: zhulin
 * @CreateDate: 2020/4/20$ 20:25$
 * @UpdateUser: zhulin
 * @UpdateDate: 2020/4/20$ 20:25$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class SelectionSortTest {
    public static void main(String[] args) {
        int []a=new int[]{8,9,2,5,7,3,6,1};
        SelectionSort.selectionSort(a);
        System.out.println("最终排序："+Arrays.toString(a));
    }
}
