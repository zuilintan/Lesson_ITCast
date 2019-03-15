package learn.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @作者: LinTan
 * @日期: 2019/2/20 10:27
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 * <p>
 * 需求: ArrayList去除集合中字符串重复值
 * 思路: 创建新集合
 * </p>
 */

public class Demo01_ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("e");
        list.add("e");
        list.add("e");

        ArrayList newList = getSingle(list);
        System.out.println(newList);
    }

    /**
     * 创建新集合并将重复元素去掉
     * 1, 明确返回值类型: ArrayList
     * 2, 明确形参列表: ArrayList
     */

    public static ArrayList getSingle(ArrayList oldList) {
        ArrayList newList = new ArrayList();//创建新集合
        Iterator it = oldList.iterator();//根据传入的旧集合获取迭代器
        while (it.hasNext()) {//遍历旧集合
            Object obj = it.next();//记录每一个元素
            if (!newList.contains(obj)) {
                newList.add(obj);
            }
        }
        return newList;
    }
}
