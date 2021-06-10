public class ForwordLeft extends State{

    public ForwordLeft(Roboot r) {
        super(r);
    }

    public void MoveDown(){
    R.changestate(new ForwordDown(R));
    }
    public void MoveUp(){
     R.changestate(new ForwordUp(R));
    }
    public void MoveRight(){
       R.changestate(new ForwordRight(R));
    }
    public void MoveLeft(){
        //do nothing
    }
}
