package com.example.bachk.testapp.dip;

import com.example.bachk.testapp.dip.myinterface.IChicken;
import com.example.bachk.testapp.dip.myinterface.IPig;

/**
 * Created by bachk on 1/27/2018.
 */

public class Animal {
    private Chicken chicken;
    private Pig pig;

    private IChicken chickenDip;
    private IPig pigDip;

    public Animal(Chicken chicken, Pig pig) {
        this.chicken = chicken;
        this.pig = pig;
    }

    public Animal(Chicken chicken, Pig pig, IChicken chickenDip, IPig pigDip) {
        this.chicken = chicken;
        this.pig = pig;
        this.chickenDip = chickenDip;
        this.pigDip = pigDip;
    }

    public void action(){
        chicken.eat();
        pig.sleep();
        chickenDip.eat();
        pigDip.sleep();
    }
}
