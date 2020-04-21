import jdk.nashorn.tools.Shell;
import shellsort.ShellSort;

import java.util.Arrays;

/**
 * @ClassNmae: ShellSortTest
 * @Description: java类作用描述
 * @Author: zhulin
 * @CreateDate: 2020/4/21$ 14:23$
 * @UpdateUser: zhulin
 * @UpdateDate: 2020/4/21$ 14:23$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class ShellSortTest {
    public static void main(String[] args) {
        int []a=new int[]{8,9,2,5,7,3,6,1,10};
        ShellSort.shellSort(a);
        System.out.println("最终排序："+ Arrays.toString(a));
    }
}
