package com.lanhuigu.design.factory;

/**
 * 具体产品(Concrete Product)角色：实现接口对象为具体对象
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class StudentWork implements Work{

    @Override
    public void doWork() {
        System.out.println("学生做作业");
    }
}
