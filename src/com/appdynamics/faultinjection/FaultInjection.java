package com.appdynamics.faultinjection;

import java.util.List;

public interface FaultInjection {

    public String injectFault();

    public String injectFault(List<String> params);

    public void test();
}
