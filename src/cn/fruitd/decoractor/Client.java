package cn.fruitd.decoractor;

import java.util.ArrayList;

/**
 * Created by ll130 on 2017/2/20.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();

        decoratorA.setComponent(component);
        decoratorB.setComponent(decoratorA);
        decoratorB.Operation();
        /**
         * excuted result
         * 具体的对象操作
         *this is A class function
         *this is B class function
         *
         *
         */
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer>[] arrayLists=new ArrayList[]{list1,list2};
    }
}
