package learn.list;

import java.util.Enumeration;
import java.util.Vector;

public class Demo05_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("a");
        v.addElement("b");
        v.addElement("c");
        v.addElement("d");

        Enumeration en = v.elements();//获取枚举
        while (en.hasMoreElements()) {//判断集合中是否有元素
            Object o = en.nextElement();//获取集合中的元素
            System.out.println(o);
        }
    }
}
