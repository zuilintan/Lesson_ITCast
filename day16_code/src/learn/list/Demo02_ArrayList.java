package learn.list;

import bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo02_ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//创建集合对象
        list.add(new Person("张三", 23));
        list.add(new Person("张三", 20));
        list.add(new Person("张三", 22));
        list.add(new Person("李四", 24));
        list.add(new Person("李四", 24));
        list.add(new Person("王五", 25));
        list.add(new Person("王五", 25));
        list.add(new Person("赵六", 26));

        ArrayList newList = getSingle(list);//调用方法去除重复
        System.out.println(newList);
    }

    private static ArrayList getSingle(ArrayList oldList) {
        ArrayList newList = new ArrayList();
        Iterator it = oldList.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
            if (!newList.contains(obj)) {//contains底层使用equals()判断，默认比较的是地址，需要重写。注意，remove()底层也使用了equals()判断
                newList.add(obj);
            }
        }
        return newList;
    }
}
