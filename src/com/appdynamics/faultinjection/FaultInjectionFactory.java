package com.appdynamics.faultinjection;

/**
 * Created by shiv.loka on 6/12/15.
 */
public class FaultInjectionFactory {

    String faultType = null;

    public String getFaultInjection(String faultType){
        this.faultType = faultType;

        return "null";
    }
}
