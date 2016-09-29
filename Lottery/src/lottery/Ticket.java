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
public class Ticket {
    protected int[] whiteBalls;
    protected int bonusBall;
    
    public Ticket()
    {
        whiteBalls = new int[5];
        bonusBall = 0;
    }
    
    public int numberOfWhiteBallMatches( int[] otherWhiteBalls )
    {
        int matches = 0;
        for ( int ball : whiteBalls )
        {
            for ( int otherBall : otherWhiteBalls )
            {
                if ( ball == otherBall )
                {
                    matches++;
                }
            }
        }
        return matches;
    }
    
    public boolean bonusBallMatches( int otherBonusBall )
    {
        return bonusBall == otherBonusBall;
    }
}
