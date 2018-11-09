package com.feeling.proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理总结
 * 虽然相对于静态代理，动态代理大大减少了我们的开发任务，同时减少了对业务接口的依赖，
 * 降低了耦合度。但是还是由一点点小小的遗憾之外，那就是它始终无法保妥仅支持Interface代理
 * 的桎梏。因为它的设计注定了这个遗憾。回想一下那些动态生成的代理类的继承关系图。他们已经注定
 * 有一个共同的弗雷叫Proxy。Java的继承机制注定了这些动态代理类们无法实现对class的动态
 * 代理，原因时多继承在Java中本质上就行不通。由很多条理由，人们可以否定对class代理的必要性，但是同样由
 * 一些理由。相信支持class动态代理会更美好。接口和类的划分。本就不是很明显，只是到了Java
 * 中才变得如此的细化。如果只从方法的声明及是否被定义来考量，由一种两者的混合体，他的名字叫
 * 抽象类。实现对抽象类的动态代理，相信也有其内在的价值。此外，还有一些历史遗留的类，他们将
 * 因为没有实现任何接口而从此与动态代理永世无缘。如此种种，不得不说时一个小小的遗憾。
 * 但是，不完美并不等于不伟大，伟大是一种本质，Java动态代理就是佐例。
 */
public class XiMenQingWithDynamic {
    public static void main(String []args) throws IllegalAccessException, InstantiationException {
        PanJinLian panJinLian = new PanJinLian();

        /**KindWomen panJinLianProxy = (KindWomen) Proxy.newProxyInstance(KindWomen.class.getClassLoader(),
                new Class[]{KindWomen.class},new DynamicProxyHandler(panJinLian));**/


        KindWomen kindWomenProxy = (KindWomen) Proxy.newProxyInstance(KindWomen.class.getClassLoader(),
                new Class[]{KindWomen.class},
                new DynamicProxyHandler(PanJinLian.class.newInstance()));


        kindWomenProxy.makeEyesWithMan();
        kindWomenProxy.happyWithMan();
    }
}
