 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BE;

import GUI.ResetableCounter;

/**
 *
 * @author Disco
 */
public class ButtonClickCounter implements ResetableCounter
    {
      int counterVariable;
      public ButtonClickCounter(){
          counterVariable = 0;
    }

    /**
     * reset counter value to 0
     */
      @Override
    public void reset() {
        this.counterVariable = 0;
    }
      
     /**
     * reset counter value to 0
     */
    public void resetTo1() {
        this.counterVariable = 1;
    }

    /**
     *  
     * @return counter value
     */
      @Override
    public int value() {
        return this.counterVariable;
    }

    /**
     * adds 1 to the counter value
     */
      @Override
    public void up() {
        ++this.counterVariable;
    }

    /**
     * subtracts 1 from the counter value
     */
      @Override
    public void down() {
        --this.counterVariable;
    }
    }