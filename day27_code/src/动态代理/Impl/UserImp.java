package 动态代理.Impl;

import 动态代理.IUser;

/**
 * @作者: LinTan
 * @日期: 2019/3/14 12:45
 * @版本: 1.0
 * @描述: //
 * 1.0: Initial Commit
 */

public class UserImp implements IUser {
    @Override
    public void add() {
        //System.out.println("权限校验");
        System.out.println("添加功能");
        //System.out.println("日志记录");
    }

    @Override
    public void delete() {
        //System.out.println("权限校验");
        System.out.println("删除功能");
        //System.out.println("日志记录");
    }
}
