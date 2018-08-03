package com.aircraft.app.AirCraftManagementApp;

import java.util.Comparator;

class PriorityComp implements Comparator<AirCraftQueuingLogic>{
@Override
public int compare(AirCraftQueuingLogic o1, AirCraftQueuingLogic o2) {

return o1.compareTo(o2);
}
}