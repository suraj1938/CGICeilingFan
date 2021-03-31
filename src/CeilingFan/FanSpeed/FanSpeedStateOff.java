package CeilingFan.FanSpeed;

import CeilingFan.CeilingFan;

public class FanSpeedStateOff implements IFanSpeedState{
    public static FanSpeedStateOff Instance;

    private FanSpeedStateOff(){

    }
    public static FanSpeedStateOff getInstance(){
        if(Instance == null){
            Instance= new FanSpeedStateOff();
        }
        return Instance;
    }


    @Override
    public void changeFanSpeed(CeilingFan ceilingFan) {
        IFanSpeedState oldFanSpeedState = ceilingFan.getCurrentSpeedState();
        ceilingFan.setCurrentSpeedState(FanSpeedStateOne.getInstance());
        System.out.println("Fan Speed Changed from " + oldFanSpeedState.toString() +" to " + ceilingFan.getCurrentSpeedState().toString());
    }

    @Override
    public String toString() {
        return "Off State";
    }

}

