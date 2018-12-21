package org.alpha.javabase.javase.object;

/**
 * <p>
 *
 * @author liyazhou1
 * @date 2018/12/13
 */
public class Singleton {

    /*

    设计模式：对问题行之有效的解决方式。其实它是一种思想。
    1,单例设计模式。
        解决的问题：就是可以保证一个类在内存中的对象唯一性。
    必须对于多个程序使用同一个配置信息对象时，就需要保证该对象的唯一性。

    如何保证对象唯一性呢？
    1，不允许其他程序用new创建该类对象。
    2，在该类创建一个本类实例。
    3，对外提供一个方法让其他程序可以获取该对象。

    步骤：
    1，私有化该类构造函数。
    2，通过new在本类中创建一个本类对象。
    3，定义一个公有的方法，将创建的对象返回。

     */
}