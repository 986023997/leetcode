package shellsort;

/**
 * @ClassNmae: ShellSort
 * @Description: 希尔排序：插入排序的改进，是一种缩小增量排序
 * @Author: zhulin
 * @CreateDate: 2020/4/21$ 14:16$
 * @UpdateUser: zhulin
 * @UpdateDate: 2020/4/21$ 14:16$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class ShellSort {
    /*
    * @Decription
    * @author    zhulin
    * @param    [a]
    * @return      void
    * @date        2020/4/21 14:16
    */
    public static void shellSort(int []a){
        int h=1;//增量
        while(h<a.length/2){
            h=2*h+1;
        }
        while(h>=1) {
            for (int i = h; i < a.length; i++) {//找到需要排序的元素
                for(int j=i;j>=h;j-=h){//每一组进行排序
                    if(a[j]<a[j-h]){
                        int temp=a[j];
                        a[j]=a[j-h];
                        a[j-h]=temp;
                    }
                }
            }
            h=h/2;
        }

    }
}
