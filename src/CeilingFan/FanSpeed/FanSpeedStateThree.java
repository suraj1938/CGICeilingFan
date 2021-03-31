package CeilingFan.FanSpeed;

import CeilingFan.CeilingFan;

public class FanSpeedStateThree implements IFanSpeedState {

    public static FanSpeedStateThree Instance;

    private FanSpeedStateThree(){

    }

    public static FanSpeedStateThree getInstance(){
        if(Instance == null){
            Instance= new FanSpeedStateThree();
        }
        return Instance;
    }

    @Override
    public void changeFanSpeed(CeilingFan ceilingFan) {
        IFanSpeedState oldFanSpeedState = ceilingFan.getCurrentSpeedState();
        ceilingFan.setCurrentSpeedState(FanSpeedStateOff.getInstance());
        System.out.println("Fan Speed Changed from " + oldFanSpeedState.toString() +" to " + ceilingFan.getCurrentSpeedState().toString());
        System.out.println("Fan Direction is :" +ceilingFan.getCurrentFanDirection().toString());
    }

    @Override
    public String toString() {
        return "State Three";
    }
}
