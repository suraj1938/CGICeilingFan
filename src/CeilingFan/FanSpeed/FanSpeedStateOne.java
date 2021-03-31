package CeilingFan.FanSpeed;

import CeilingFan.CeilingFan;

public class FanSpeedStateOne implements IFanSpeedState {

    public static FanSpeedStateOne Instance;

    private FanSpeedStateOne(){

    }
    public static FanSpeedStateOne getInstance(){
        if(Instance == null){
            Instance= new FanSpeedStateOne();
        }
        return Instance;
    }

    @Override
    public void changeFanSpeed(CeilingFan ceilingFan) {
        IFanSpeedState oldFanSpeedState = ceilingFan.getCurrentSpeedState();
        ceilingFan.setCurrentSpeedState(FanSpeedStateTwo.getInstance());
        System.out.println("Fan Speed Changed from " + oldFanSpeedState.toString() +" to " + ceilingFan.getCurrentSpeedState().toString());
        System.out.println("Fan Direction is :" +ceilingFan.getCurrentFanDirection().toString());
    }

    @Override
    public String toString() {
        return "State One";
    }
}
