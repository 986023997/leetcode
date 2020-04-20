package selectionsort;

import java.util.Arrays;

/**
 * @ClassNmae: SelectionSort
 * @Description: 选择排序：每一次循环找到最小数的下标并记录，结束后将最小值和最开始的基准值进行交换，与冒泡相比只需要交换一次
 * @Author: zhulin
 * @CreateDate: 2020/4/20$ 19:23$
 * @UpdateUser: zhulin
 * @UpdateDate: 2020/4/20$ 19:23$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class SelectionSort {
    public static int count=0;
    public static void  selectionSort(int a[]){
        for(int i=0;i<a.length-1;i++){//外循环控制循环的趟数
            int min=i;
            for(int j=i+1;j<a.length;j++){//内循环控制比较的次数
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
            ++count;
            System.out.print("第"+count+"趟排序：");
            System.out.println(Arrays.toString(a));
        }

    }

}
