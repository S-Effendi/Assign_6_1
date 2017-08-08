package movementMechanism;

/**
 * Created by Suzanne Effendi on 2017/08/07.
 */
public abstract class MovementHandler {
    MovementHandler handler;

    public void setHandler(MovementHandler handler){
        this.handler = handler;
    }

    public abstract String handleCall(String call);
}
