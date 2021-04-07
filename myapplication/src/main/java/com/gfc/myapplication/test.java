package com.gfc.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2021/4/1 14:55
 * @UpdateUser:
 * @UpdateDate: 2021/4/1 14:55
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class test {

    class Animal{
        private String name;
        private void eat(){
            System.out.println(name+" eat");

        }

    }
    class Cat extends Animal{

        public void work(){

        }

    }
    class Cow extends Animal{

        public void work(){

        }

    }
    class Mgr{
        public void alleat(List<? extends Animal> animals){
            for (Animal s:animals
            ) {
                s.eat();
            }

        }

    }
    public void main(String[] args) {

        Mgr mgr=new Mgr();

    }



}
