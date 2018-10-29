/**
 * 建造者模式(生成器模式)
 * <p>
 * 声明 : 对象的创建型模式,采取隐藏复合对象的创建过程，把复合对象的创建过程加以抽象，通过子类继承和重载的方式，进行动态的创建具有复合属性的对象
 * 建造者角色(Builder)：定义生成实例所需要的所有方法；并且定义获取最终生成实例的方法
 * 具体的建造者角色(ConcreteBuilder)：具体的建造者，负责实现生成实例所需要的所有方法；
 * 监工角色(Director)：负责选择建造者，并可控制一个复杂的构建过程，调用建造者本身实现构建过程中所用到的所有构建步骤
 * <p>
 * 作用 : 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示
 */
package name.ealen.builder;