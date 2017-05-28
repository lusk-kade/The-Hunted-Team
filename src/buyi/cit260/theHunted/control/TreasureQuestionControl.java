/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.theHunted.control;

import static java.lang.Math.round;

/**
 *
 * @author Justin
 */
public class TreasureQuestionControl {


    
    public double calcTreasureQuestion (double freq, double amplitude) {
    

        
	if (freq < 17) {
            return -1;
        }
                    
        if (freq > 25) {
            return -1;
        }
        
	if (amplitude < .1) {
            return -1;
        }
        
        if (amplitude > .18) {
            return -1;
        }
        
        double speed = (6* freq * amplitude) /2;
            return speed;

        }    
    
    
}
