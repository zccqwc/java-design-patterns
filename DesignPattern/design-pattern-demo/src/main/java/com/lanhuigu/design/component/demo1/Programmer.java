package com.lanhuigu.design.component.demo1;

/**
 * Leaf: 组合对象的叶节点对象，叶节点对象没有字节点对象，并且定义了叶节点对象的行为
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Programmer
 * @Package: com.lanhuigu.design.component.demo1
 * @date 2018/3/21 15:50
 */
public class Programmer extends Employer {

    public Programmer(String name) {
        setName(name);
        // 码农，没有下属，也就是没有子节点
        employers = null;
    }

    @Override
    public void add(Employer employer) {
        System.out.println("添加码农叶节点对象");
    }

    @Override
    public void delete(Employer employer) {
        System.out.println("删除码农叶节点对象");
    }

}
