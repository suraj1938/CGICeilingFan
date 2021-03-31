package CeilingFan.FanDirection;

import CeilingFan.CeilingFan;
import CeilingFan.FanSpeed.FanSpeedStateOne;

public class FanDirectionReverse implements IFanDirection {
    public static FanDirectionReverse Instance;

    private FanDirectionReverse(){

    }

    public static FanDirectionReverse getInstance(){
        if(Instance == null){
            Instance= new FanDirectionReverse();
        }
        return Instance;
    }
    @Override
    public void changeDirection(CeilingFan ceilingFan) {
        IFanDirection fanOldDirection = ceilingFan.getCurrentFanDirection();
        ceilingFan.setCurrentFanDirection(FanDirectionForward.getInstance());
        System.out.println("Fan Direction Changed from " + fanOldDirection.toString() +" to " + ceilingFan.getCurrentFanDirection().toString());
        System.out.println("Current Speed is :"+ceilingFan.getCurrentSpeedState().toString());
    }

    @Override
    public String toString() {
        return "Reverse Direction";
    }
}
