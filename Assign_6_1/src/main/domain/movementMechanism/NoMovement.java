package movementMechanism;
import org.junit.Assert;
/**
 * Created by Suzanne Effendi on 2017/08/07.
 */
public class NoMovement extends MovementHandler{
    @Override
    public String handleCall(String call){
        if(call.equalsIgnoreCase("No movement")) {
            return "No movement";
        }else{
            return handler.handleCall(call);
        }
    }
}
