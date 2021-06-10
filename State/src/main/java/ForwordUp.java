

public class ForwordUp extends State{

    public ForwordUp(Roboot r) {
        super(r);
    }

    public void MoveDown(){
      //no autorisation
    }
    public void MoveUp(){
       R.changestate(new ForwordUp(R));
    }
    public void MoveRight(){
       R.changestate(new ForwordRight(R) );
    }
    public void MoveLeft(){
      R.changestate(new ForwordLeft(R));
    }
}
