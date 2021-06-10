import java.awt.*;

public class ForwordRight extends State{


    public ForwordRight(Roboot robot) {
        super(robot);
    }

    public void MoveDown(){
      R.changestate(new ForwordDown(R));
    }
    public void MoveUp(){
        R.changestate(new ForwordUp(R));
    }
    public void MoveRight(){
      //DO NOTHING
    }
    public void MoveLeft(){
      R.changestate(new ForwordLeft(R));
    }
}
