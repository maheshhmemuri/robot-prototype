package com.xebia.Main.service;
/*
 * Author: Mahesh Melmuri
 * crated date : 4/12/2019
 * last updated : 4/14/2019
 * Abstract class ensure the health check methods abstracted out
 * It also has min robot initialization steps
 * Also includes the basic methods which every robot should have
 */

import com.xebia.Main.model.Color;
import com.xebia.Main.model.Robot;
import com.xebia.Main.utils.Constants;

import java.util.Random;

public abstract class AbstractRobotPrototype {

    protected Robot robot;

    public AbstractRobotPrototype()
    {
        robot = new Robot();
        System.out.println("**---- Robot is ready with initial setup ----**");
    }

    public boolean canCarry(int weight) {
        if(weight > Constants.MAX_WEIGHT_CAPACITY)
        {
            System.out.println("OverWeight");
            return false;
        }
        return true;
    }


    public boolean powerCheck(int requiredCharging)
    {
        int availableCharging = robot.getChargingStatus();
        if(availableCharging < requiredCharging)
        {
            System.out.println("Charge is not enough to do this task");
            return false;
        }else {
            int remainingCharge = availableCharging - requiredCharging;
            // updating the robots charge for next
            robot.setChargingStatus(remainingCharge);
            if (remainingCharge < Constants.MIN_CHARGE_REQUIRED) {
                robot.setHeadLightColor(Color.RED);
            }
            return true;
        }
    }

    public void putCharging(int batteryPercentage) {
        //It wont have negative charging as no task getting started if there is no enough remaining charge
        // as the power check is called before starting next task
        int currentCharging = robot.getChargingStatus();
        robot.setHeadLightColor(Color.GREEN);
        if(currentCharging + batteryPercentage > Constants.FULL_CHARGE_CAPACITY)
        {
            robot.setChargingStatus(Constants.FULL_CHARGE_CAPACITY);
        }else
        {
            robot.setChargingStatus(currentCharging + batteryPercentage);
        }
        System.out.println("Robot is recharged!!! available charge : "+ robot.getChargingStatus() +"%");
    }

    public void displayPrice(int scanBarCode) {

        //Assuming even bar codes are valid to display price.
        if(scanBarCode % 2 == 0)
        {
            System.out.println("Price is " + new Random().nextInt());
        }else
        {
            System.out.println("Scan Failure");
        }

    }

}
