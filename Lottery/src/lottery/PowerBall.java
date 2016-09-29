/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

/**
 *
 * @author echarnes
 */
public class PowerBall extends Ticket {
    
    public static final int PURCHASE_PRICE = 2;
    
    public PowerBall()
    {
        whiteBalls = new int[5];
        
        // go set white balls
        
        // set red ball
    }
    
    public int getWinnings( PowerBall winningTicket )
    {
        if ( numberOfWhiteBallMatches( winningTicket.whiteBalls) == 5 && bonusBallMatches(winningTicket.bonusBall ))
        {
            // JACKPOT!!!
        }
        
        ///check other things
        ///
        ///
        
        return 0;
    }
    
}
