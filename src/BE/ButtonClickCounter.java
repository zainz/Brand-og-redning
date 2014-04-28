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
    public void reset() {
        this.counterVariable = 0;
    }

    /**
     *  
     * @return counter value
     */
    public int value() {
        return this.counterVariable;
    }

    /**
     * adds 1 to the counter value
     */
    public void up() {
        ++this.counterVariable;
    }

    /**
     * subtracts 1 from the counter value
     */
    public void down() {
        --this.counterVariable;
    }
    }