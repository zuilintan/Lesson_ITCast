package learn.list;

import bean.Person;

import java.util.ArrayList;

/**
 * @作者: LinTan
 * @日期: 2019/2/22 20:38
 * @版本: 1.0
 * @描述: ArrayList嵌套ArrayList
 * 1.0: Initial Commit
 */

public class Demo05_ArrayListInArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Person>> list = new ArrayList<>();
        ArrayList<Person> classFirst = new ArrayList<>();
        classFirst.add(new Person("杨幂", 30));
        classFirst.add(new Person("李冰冰", 33));
        classFirst.add(new Person("范冰冰", 20));

        ArrayList<Person> classSecond = new ArrayList<>();
        classSecond.add(new Person("黄晓明", 31));
        classSecond.add(new Person("赵薇", 33));
        classSecond.add(new Person("陈坤", 32));

        //将班级添加到学科集合中
        list.add(classFirst);
        list.add(classSecond);

        for (ArrayList<Person> classP : list) {
            for (Person person : classP) {
                System.out.println(person);
            }
        }
    }
}
