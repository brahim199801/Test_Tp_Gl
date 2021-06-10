package org.emp.gl.guigamer;

import jdk.dynalink.linker.support.Lookup;


import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.util.LinkedList;
import java.util.Queue;

public class guigamerserviceimpl extends JavaFrame implements guigamerservicr {
    boolean left,right,up,down;
     Roboot player ;
    final int[][] matrix = {
            { 1, 0, 1,0,0,0,1,0,0,1},
            { 1, 0, 1,0,0,1,0,0,0 },
            { 1, 0, 1,0,0,1,0,0,0 },
            { 1, 0, 1,0,0,1,0,0,0 },
            { 1, 0, 1,0,0,1,0,0,0 },
            { 1, 0, 1,0,0,1,0,0,0 },
            { 1, 0, 1,0,0,1,0,0,0 },
            { 1, 0, 0,0,0,1,0,0,0 },
            { 1, 1, 1,1,1,1,1,1,1 },
    };
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        this.printBord();

        if(left==true)
        {
          player.Moveleft();

        }else if(right==true)
        {
          player.MoveRight()
        }else if(up == true)
        {
          player.Moveup();
        }else if(down == true)
        {
           player.MoveDown();
        }





    }

    private void printBord() {
        for(int i=0 ;i<10;i++)
            for(int j=0 ;j<10 ;j++)
            {
                System.out.print(matrix+" ");
            }
        System.out.println("");
    }
}
