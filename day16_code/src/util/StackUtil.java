package util;

import java.util.LinkedList;

/**
 * @作者: LinTan
 * @日期: 2019/2/20 16:12
 * @版本: 1.0
 * @描述: //封装LinkedList模拟栈操作的工具类
 * 1.0: Initial Commit
 */

public class StackUtil {
    private LinkedList mList = new LinkedList();//显式初始化

    /**
     * 压栈
     */
    public void in(Object obj) {
        mList.addLast(obj);
    }

    /**
     * 弹栈
     */
    public Object out() {
        return mList.removeLast();
    }

    /**
     * 判断栈空
     */
    public boolean isEmpty() {
        return mList.isEmpty();
    }

    @Override
    public String toString() {
        return "StackUtil{" +
                "mList=" + mList +
                '}';
    }
}
