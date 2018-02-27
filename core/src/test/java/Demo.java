/**
 * Created by siye on 2016/10/27.
 */
public class Demo {
    public static void main(String[] args) {
        int a = 12321;
        String str = Integer.toString(a);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse() ;
        String str1 = sb.toString();
        if (str.equals(str1)){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }

}
