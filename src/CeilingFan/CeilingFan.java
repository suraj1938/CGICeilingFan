package CeilingFan;

import CeilingFan.FanDirection.FanDirectionForward;
import CeilingFan.FanDirection.IFanDirection;
import CeilingFan.FanSpeed.FanSpeedStateOff;
import CeilingFan.FanSpeed.IFanSpeedState;

public class CeilingFan {
    private IFanSpeedState currentSpeedState;
    private IFanDirection currentFanDirection;

    public CeilingFan(){
        this.currentSpeedState = FanSpeedStateOff.getInstance();
        this.currentFanDirection = FanDirectionForward.getInstance();
        System.out.println("Ceiling Fan Created");
    }

    public IFanSpeedState getCurrentSpeedState() {
        return currentSpeedState;
    }

    public void setCurrentSpeedState(IFanSpeedState currentSpeedState) {
        this.currentSpeedState = currentSpeedState;
    }

    public IFanDirection getCurrentFanDirection() {
        return currentFanDirection;
    }

    public void setCurrentFanDirection(IFanDirection currentFanDirection) {
        this.currentFanDirection = currentFanDirection;
    }

    public void changeSpeed(){
        this.currentSpeedState.changeFanSpeed(this);
    }

    public void changeDirection(){
        this.currentFanDirection.changeDirection(this);
    }
}
