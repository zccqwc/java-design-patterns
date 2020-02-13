package com.jpeony.design.patterns.facade;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: LightServiceImpl
 * @Package: com.lanhuigu.design.facade.demo1
 * @date 2018/3/19 16:17
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class LightServiceImpl implements LightService {
    @Override
    public void openLight() {
        // TODO Auto-generated method stub
        System.out.println("天黑了，开灯");
    }

    @Override
    public void offLight() {
        // TODO Auto-generated method stub
        System.out.println("天亮了，关灯");
    }
}