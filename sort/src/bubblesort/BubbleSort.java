package bubblesort;

import java.util.Arrays;

/**
 * @ClassNmae: BubbleSort
 * @Description: 冒泡排序
 * @Author: zhulin
 * @CreateDate: 2020/4/20$ 17:05$
 * @UpdateUser: zl
 * @UpdateDate: 2020/4/20$ 17:05$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class BubbleSort {
    public static int count=0;


 /*
 * @Decription 冒泡排序
 * @author    zhulin
 * @param    [a]
 * @return      int[]
 * @date        2020/4/20 17:05
 */
    public static int[] sort(int []a){
       //特殊情况,若数组长度小于1则直接返回
        if(a.length<=1){
            return a;
        }
        //外循环控制趟数,内循环控制每趟需要比较的次数
        for(int i=0;i<a.length-1;i++){
            int temp=0;
           for(int j=0;j<a.length-i-1;j++){
               if(a[j]>a[j+1]){
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }
            ++count;
           System.out.print("第"+count+"排序：");
          /* for (int x=0;x<a.length;x++){
              System.out.print(a[x]+",");
           }*/
            System.out.println(Arrays.toString(a));
        }
      return a;
    }
}
