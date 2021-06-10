public class ForwordDown extends State{


    public ForwordDown(Roboot r) {
        super(r);
    }

    public void MoveDown(){
       //do nothing
    }
    public void MoveUp(){
       //not autorisation
    }
    public void MoveRight(){
        R.changestate(new ForwordRight(R));
    }
    public void MoveLeft(){
        R.changestate(new ForwordLeft(R));

    }

}
