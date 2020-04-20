package quicksort;

/**
 * @ClassNmae: QuickSort
 * @Description: 快速排序
 * @Author: zhulin
 * @CreateDate: 2020/4/20$ 17:37$
 * @UpdateUser: zhulin
 * @UpdateDate: 2020/4/20$ 17:37$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class QuickSort {
    /*
    * @Decription
    * @author    zhulin
    * @param    [a]
    * @return      int[]
    * @date        2020/4/20 17:38
    */
    public  static  void quickSort(int []a,int left,int right){
        int index=a[left];
        int i=left;
        int j=right;
        int temp=0;
        if(i>=j) {//递归推出条件
            return;
        }
        while(i<j){
            while(i<j&&a[j]>=index) j--;//遍历找到从右边开始的第一个比基准小的
            while(i<j&&a[i]<=index) i++;//遍历找到从左边开始第一个比基准大的下标
            if(i<j) { //若存在i<j,说明左边存在大于基准的，右边存在小于基准的 ，交换
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }//推出之后i==j或者i>j，交换基准和a[i]的值此时a[i]左边为小于基准的值，右边为大于基准的值，
        a[left]=a[i];
        a[i]=index;
        //递归排序基准左边的数组和基准右边的数组
            quickSort(a, left, i - 1);
            quickSort(a, i + 1, right);
    }

}
