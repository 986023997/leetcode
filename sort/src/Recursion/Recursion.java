package Recursion;

/**
 * @ClassNmae: Recursion
 * @Description: java类作用描述
 * @Author: zhulin
 * @CreateDate: 2020/4/21$ 14:39$
 * @UpdateUser: zhulin
 * @UpdateDate: 2020/4/21$ 14:39$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class Recursion {
    /*
    * @Decription 递归实现n的阶层
    * @author    zhulin
    * @param    [n]
    * @return      int
    * @date        2020/4/21 14:42
    */
    public static int nFactorial(int n){
        if(n==1){
            return 1;
        }
        return n*nFactorial(n-1);
    }
}
