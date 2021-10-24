package com.zym.factory.factorymethod;

/**
 * @ClassName LDPizzaFactory
 * @Author 王亮
 * @Date 2021/10/24 18:12
 * @Description TODO
 **/
public class LDPizzaFactory extends PizzaFactory{

    /**
     * 有参构造
     *
     * @param type
     */
    public LDPizzaFactory(String type) {
        super(type);
    }

    @Override
    Pizza createInstance() {
        if(super.type.equalsIgnoreCase("apple")){
            return new LDApplePizza();
        }else if(super.type.equalsIgnoreCase("banana")){
            return new LDBananaPizza();
        }else {
            return null;
        }
    }

}
