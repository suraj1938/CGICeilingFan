package CeilingFan.FanSpeed;

import CeilingFan.CeilingFan;

public class FanSpeedStateTwo implements IFanSpeedState {

    public static FanSpeedStateTwo Instance;

    private FanSpeedStateTwo(){

    }

    public static FanSpeedStateTwo getInstance(){
        if(Instance == null){
            Instance= new FanSpeedStateTwo();
        }
        return Instance;
    }

    @Override
    public void changeFanSpeed(CeilingFan ceilingFan) {
        IFanSpeedState oldFanSpeedState = ceilingFan.getCurrentSpeedState();
        ceilingFan.setCurrentSpeedState(FanSpeedStateThree.getInstance());
        System.out.println("Fan Speed Changed from " + oldFanSpeedState.toString() +" to " + ceilingFan.getCurrentSpeedState().toString());
        System.out.println("Fan Direction is :" +ceilingFan.getCurrentFanDirection().toString());
    }

    @Override
    public String toString() {
        return "State Two";
    }
}
