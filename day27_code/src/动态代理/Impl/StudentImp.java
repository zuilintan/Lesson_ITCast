package 动态代理.Impl;

import 动态代理.IStudent;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 15:42
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 */

public class StudentImp implements IStudent {

    @Override
    public void login() {
        System.out.println("登录");
    }

    @Override
    public void submit() {
        System.out.println("提交");
    }
}
