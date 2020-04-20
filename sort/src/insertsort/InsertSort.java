package insertsort;

import java.util.Arrays;

/**
 * @ClassNmae: InsertSort
 * @Description: 插入排序：对于下标j元素，将0到j-1看作为有序数组，将下标j与前面的的元素进行比较直到找到a[j]大于数组中元素的位置，
 * 将之后的元素分别向后移动一位
 * @Author: zhulin
 * @CreateDate: 2020/4/20$ 20:51$
 * @UpdateUser: zhulin
 * @UpdateDate: 2020/4/20$ 20:51$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class InsertSort {
    public static int count=0;
    public static void insertSort(int a[]){
        for(int i=1;i<a.length;i++){
            int index=a[i];
            int j=i;
            while(j>0&&a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
            ++count;
            System.out.print("第"+count+"趟排序：");
            System.out.println(Arrays.toString(a));


        }


    }
}
