package com.lanhuigu.design.adpter.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: TurkeyAdapter
 * @Package: com.lanhuigu.design.adpter.demo2
 * @date 2018/3/19 12:05
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}