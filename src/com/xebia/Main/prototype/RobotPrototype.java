package com.xebia.Main.prototype;

/*
 * Author: Mahesh Melmuri
 * created date : 4/12/2019
 * last updated : 4/14/2019
 * Class implement all given cases
 * It is now capable of implementing the actions which required
 */

import com.xebia.Main.service.*;
import com.xebia.Main.utils.Charge;

public class RobotPrototype extends AbstractRobotPrototype implements IWalkService, IWalkAndCarryService, ICarryService {

    public RobotPrototype() {
        super();
    }


    @Override
    public boolean walk(double distance) {
        int requiredCharging = Charge.requiredChargeForWalk(distance);
        if(powerCheck(requiredCharging))
        {
            System.out.println("Robot Walked of "+distance +"km || Charge Utilized "+ requiredCharging +"% || Remaining Charge  "+ robot.getChargingStatus() +"%");
            System.out.println("Head Light Color of Robot : "+ robot.getHeadLightColor());
            return true;
        }
        return false;
    }

    @Override
    public boolean carry(int weight) {

        if(canCarry(weight)){
            int requiredCharging = Charge.requiredChargeForCarryWeight(weight); // its 2% charge consumed for each KG
            if(powerCheck(requiredCharging)){
                System.out.println("Robot Carried "+ weight+"kg || Charge Utilized "+ requiredCharging +"% || Remaining Charge "+ robot.getChargingStatus() +"%");
                System.out.println("Head Light Color of Robot : "+ robot.getHeadLightColor());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean walkAndCarry(double distance, int weight) {
        if(canCarry(weight)){
            int requiredCharging = Charge.requiredChargeForWalk(distance) + Charge.requiredChargeForCarryWeight(weight);
            if(powerCheck(requiredCharging)){
                System.out.println("Robot Walked "+ distance + "km and Carried "+ weight+"kg || Charge Utilized "+ requiredCharging +"% || Remaining Charge  "+ robot.getChargingStatus() +"%");
                System.out.println("Head Light Color of Robot : "+ robot.getHeadLightColor());
                return true;
            }
        }
        return false;
    }

}
