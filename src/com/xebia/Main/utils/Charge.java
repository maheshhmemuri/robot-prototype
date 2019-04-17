package com.xebia.Main.utils;

/*
 * Author: Mahesh Melmuri
 * created date : 4/14/2019
 * Class for Class calculation, it has only static methods
 * So methods can be accessed without creating new object
 */

public class Charge {

    // calculation of required charge is here
    public static int requiredChargeForWalk(double distance)
    {
        return (int) (Constants.CHARGE_REQUIRED_1KM_WALK * distance);
    }


    // required charge for weight
    public static int requiredChargeForCarryWeight(int weight)
    {
        return Constants.CHARGE_REQUIRED_1KG_CARRY * weight;
    }
}
