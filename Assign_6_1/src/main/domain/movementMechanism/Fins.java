package movementMechanism;

/**
 * Created by Suzanne Effendi on 2017/08/07.
 */
public class Fins extends MovementHandler{
    @Override
    public String handleCall(String call){
        if(call.equalsIgnoreCase("Fins")){
            return "Used Fins to retrieve food";
        }else{
            return handler.handleCall(call);
        }
    }
}
