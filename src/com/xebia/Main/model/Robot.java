package com.xebia.Main.model;

import com.xebia.Main.utils.Constants;

/*
 * Author: Mahesh Melmuri
 * created date : 4/12/2019
 * This is prototype Robot Model Class
 *
 */
public class Robot {

    private int chargingStatus;
    private Color headLightColor;
    private int walkCapacity;
    private int weightCapacity;

    public Robot() {
        this.chargingStatus = Constants.FULL_CHARGE_CAPACITY;
        this.headLightColor = Color.GREEN;
        this.walkCapacity = Constants.MAX_WALK_CAPACITY;
        this.weightCapacity = Constants.MAX_WEIGHT_CAPACITY;
    }


    public int getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public Color getHeadLightColor() {
        return headLightColor;
    }

    public void setHeadLightColor(Color headLightColor) {
        this.headLightColor = headLightColor;
    }

    public int getWalkCapacity() {
        return walkCapacity;
    }

    public void setWalkCapacity(int walkCapacity) {
        this.walkCapacity = walkCapacity;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
}
