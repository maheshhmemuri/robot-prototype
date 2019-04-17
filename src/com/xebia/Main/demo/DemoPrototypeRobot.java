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
        RobotPrototype robotService = new RobotPrototype();
        robotService.walk(4);
        robotService.walkAndCarry(1,3);
        robotService.putCharging(70);
        robotService.carry(5);
        robotService.displayPrice(11);

    }
}
