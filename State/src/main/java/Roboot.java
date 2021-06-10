

public class Roboot {
    int Xpos ;
    int Ypos ;
    protected  State state =new ForwordLeft(this);


    public void changestate(State s)
    {
        this.state =s ;

    }
    public void MoveDown(){
        state.MoveDown();
    }
    public void MoveUp(){
        state.MoveUp();
    }
    public void MoveRight(){
        state.MoveRight();
    }
    public void MoveLeft(){
        state.MoveLeft();
    }
    public void MoveNormaly()
    {
        if( Xpos-1 ==0){
            Xpos--;

        }

    }

}
