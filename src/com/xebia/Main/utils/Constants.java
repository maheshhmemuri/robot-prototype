package com.xebia.Main.utils;

/*
 * Author: Mahesh Melmuri
 * created date : 4/14/2019
 * Constants to set all the constants
 */

public class Constants {
    public static final int CHARGE_REQUIRED_1KM_WALK = 1000 / 50; // as max walk capacity is 5KM for 100% charge calc: (1000 / 50) / KM
    public static final int CHARGE_REQUIRED_1KG_CARRY = 2; // 2% given for 1KG carry
    public static final int MAX_WEIGHT_CAPACITY = 10; // given input, Max Weight robot can carry 10KG
    public static final int MAX_WALK_CAPACITY = 5; // given input, Max walk distance per 1005 charge is 5KM
    public static final int FULL_CHARGE_CAPACITY = 100; // will never get changed in case if change needed
    public static final int MIN_CHARGE_REQUIRED = 15; // given input,Min charge required to decide head light color
}
