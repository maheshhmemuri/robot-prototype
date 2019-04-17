package com.xebia.Main.demo;

/*
 * Author: Mahesh Melmuri
 * created date : 4/12/2019
 * Demo class to simulate the prototype robot
 *
 */

import com.xebia.Main.prototype.RobotPrototype;

public class DemoPrototypeRobot {
    public static void main(String[] args) {
        RobotPrototype robotPrototype = new RobotPrototype();
        robotPrototype.walk(4);
        robotPrototype.walkAndCarry(1,3);
        robotPrototype.putCharging(70);
        robotPrototype.carry(5);
        robotPrototype.displayPrice(11);

    }
}
