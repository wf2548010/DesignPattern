package com.feeling.proxy;

/**
 * JDK实现动态代理需要实现类通过接口定义业务方法，对于没有接口的类，
 * 如何实现动态代理呢，这就需要CGLib了。CGLib采用了非常底层的字节码
 * 技术，其原理是通过字节码结束为一个类创建子类，并在子类中采用方法拦截的技术
 * 拦截所有父类方法的调用，顺势织入横切逻辑。或因为采用的是继承，
 * 所以不能对final修饰的类进行代理。JDK动态代理与CGLib动态代理均是实现
 * Spring AOP的基础
 *
 * CGLib代理总结
 *  CGLib创建的动态代理对象比JDK创建的动态代理对象的性能更高，但是CGLib创建
 *  代理对象所花费的事件却比JDK多得多。所以对于单例对象，因为无需频繁创建对象
 *  用CGLib合适，繁殖使用JDK方式要更为合适一些。同时由于CGLib由于是采用动态
 *  创建子类的方法，对于final修饰的方法无法进行代理。
 */
public class XiMenQingWithCGLIB {
    public static void main(String []args){
        KindWomen kindWomen = new PanJinLian();

        CGLIBProxy cglibProxy = new CGLIBProxy();

        PanJinLian panJinLianProxy = (PanJinLian) cglibProxy.getInstance(kindWomen);

        panJinLianProxy.makeEyesWithMan();
        panJinLianProxy.happyWithMan();
    }
}
