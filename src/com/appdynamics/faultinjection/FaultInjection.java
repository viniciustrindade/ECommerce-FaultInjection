package com.appdynamics.faultinjection;

public interface FaultInjection {

    public String injectFault();

    public String injectFault(String params);

    public void test();
}
