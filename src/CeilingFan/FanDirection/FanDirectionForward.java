package CeilingFan.FanDirection;

import CeilingFan.CeilingFan;
import CeilingFan.FanSpeed.FanSpeedStateOff;
import CeilingFan.FanSpeed.IFanSpeedState;

public class FanDirectionForward implements IFanDirection {

    public static FanDirectionForward Instance;

    private FanDirectionForward(){

    }

    public static FanDirectionForward getInstance(){
        if(Instance == null){
            Instance= new FanDirectionForward();
        }
        return Instance;
    }
    @Override
    public void changeDirection(CeilingFan ceilingFan) {
        IFanDirection fanOldDirection = ceilingFan.getCurrentFanDirection();
        ceilingFan.setCurrentFanDirection(FanDirectionReverse.getInstance());
        System.out.println("Fan Direction Changed from " + fanOldDirection.toString() +" to " + ceilingFan.getCurrentFanDirection().toString());
        System.out.println("Current Speed is :"+ceilingFan.getCurrentSpeedState().toString());
    }

    @Override
    public String toString() {
        return "Forward Direction";
    }
}
