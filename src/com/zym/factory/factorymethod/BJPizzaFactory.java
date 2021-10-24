package com.zym.factory.factorymethod;

/**
 * @ClassName BJPizzaFactory
 * @Author 王亮
 * @Date 2021/10/24 18:12
 * @Description TODO
 **/
public class BJPizzaFactory extends PizzaFactory{

    /**
     * 有参构造
     *
     * @param type
     */
    public BJPizzaFactory(String type) {
        super(type);
    }

    @Override
    Pizza createInstance() {
        if(super.type.equalsIgnoreCase("apple")){
            return new BJApplePizza();
        }else if(super.type.equalsIgnoreCase("banana")){
            return new BJBananaPizza();
        }else {
            return null;
        }
    }

}
