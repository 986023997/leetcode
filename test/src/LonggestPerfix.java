/*
* 寻找字符串数组的最大前缀，
*string1.indexOf(string2)的作用首先要判断string2是否是string1的字串若不是直接返回-1，若是则返回string2在string1的开始位置。
* */
public class LonggestPerfix {
     public static void main(String[] args) {
         String[] strs = new String[]{"flower", "flos", "flight"};
         longestCommonPrefix(strs);
     }
     public static String longestCommonPrefix (String[]strs){
             if (strs.length == 0)
                 return "";
             String prefix = strs[0];
             for (int i = 1; i < strs.length; i++)
                 while (strs[i].indexOf(prefix) != 0) {//判断是否是公共前缀,若等于0说明是公共字串且为前缀，若不等于零说明不是是否为零为零说明没有公共字串，
                     // 或不是前缀即位置不从零开始；将公共子串从后面开始减长度同时判断是否为零，为零说明没有公共前缀，返回"",若有则进行下一步的判断
                     prefix = prefix.substring(0, prefix.length() - 1);
                     if (prefix.isEmpty())
                         return "";
                 }
             return prefix;
         }

}
