package com.xebia.Test;

/*
 * Author: Mahesh Melmuri
 * date : 4/12/2019
 * Test Cases
 *
 */

import com.xebia.Main.prototype.RobotPrototype;
import org.junit.Assert;
import org.junit.Test;

public class ProtoTypeRobotTest {

    private RobotPrototype robotPrototype = new RobotPrototype();


    /*
     * Case : 1
     * Robot can walk upto 5 Kms with initial battery charge
     * below test case we test by passing <5 and >5 to check
     */
    @Test
    public void walkTestSuccess()
    {
        Assert.assertEquals(true, robotPrototype.walk(6));
    }

    /*
     * Case : 2
     * To Test max weight that robot can carry
     * if input is more than 10 test case fails as aserting to true
     */
    @Test
    public void carryTest()
    {
        Assert.assertEquals(true, robotPrototype.carry(10));
    }

    /*
     * Case : 3
     * To Test max weight and distance.
     * if combining both weight and distance robot requires more than 100% charge
     * It will fail
     * success case : input parameters 2,3
     * failure case : input parameters 5,2
     */
    @Test
    public void walkAndCarryTest()
    {
        Assert.assertEquals(true, robotPrototype.walkAndCarry(5,2));
    }



}
