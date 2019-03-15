package test;

/**
 * @作者: LinTan
 * @日期: 2019/2/16 14:51
 * @版本: 1.0
 * @描述: //数组按指定格式拼接成字符串
 * 1.0: Initial Commit
 */

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String string = array2String(arr);
        System.out.println(string);
    }

    public static String array2String(int[] arr) {//2与To发音相似，eg：dom4j是domForJ
        StringBuffer sb = new StringBuffer();//创建字符串缓冲区对象
        sb.append("[");//将[添加到缓冲区
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i == arr.length - 1) {
                sb.append("]");
            } else {
                sb.append(",");
            }
        }
        return sb.toString();
    }//注意: 不推荐sb.append(arr[i]+"");这样的写法，因为每写一个+，底层都会新new一个StringBuilder或StringBuffer对象，浪费内存
}
