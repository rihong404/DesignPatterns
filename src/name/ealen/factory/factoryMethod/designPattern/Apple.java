package name.ealen.factory.factoryMethod.designPattern;

/**
 * Created by EalenXie on 2018/10/22 9:58.
 * 具体工厂
 */
public class Apple implements Fruit {
    @Override
    public void get() {
        System.out.println("苹果");
    }
}
