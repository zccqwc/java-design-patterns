package com.jpeony.design.patterns.iterator.demo1;

/**
 * 抽象聚合类
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: List
 * @Package: com.lanhuigu.design.iterator
 * @date 2018/3/21 10:45
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public interface List {
    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object obj);
}