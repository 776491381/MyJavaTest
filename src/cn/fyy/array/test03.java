package cn.fyy.array;

/**
 * Created by FYY on 16/6/11.
 */
public class test03 {
    public static void main(String[] args) {
        String str="abc";
        String str2="bbb";
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        String c = str.substring(0,2);//数组的截取
        System.out.println(c);
        String str3=str.replace("b","*");
        System.out.println(str3+"    "+str);
        String d = " aaa,bbb,ccc";
        String []array = d.split(",");//对字符串切割
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]+"  ");
        }
        System.out.println(d.trim());//去除字符串首尾空格
        System.out.println("Abc".equalsIgnoreCase("abc"));//忽略大小写比较
        System.out.println("abc".startsWith("a"));//判断是否以什么开头

    }
}
