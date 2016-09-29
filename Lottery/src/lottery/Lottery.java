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
public class Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int totalPurchased = 0;
        int netLoss = 0;
        int totalWon = 0;
        
        // inside some loop that lets our user lose money
        int numberOfTicketsToBuy;
        //get some input
        //totalPurchased += PowerBall.PURCHASE_PRICE * whatever number of tickets
        PowerBall winningTicket = new PowerBall();    
        for ( int ticketNumber = 0; ticketNumber < numberOfTicketsToBuy; ticketNumber ++)
        {
            PowerBall newTicket = new PowerBall();
            totalWon += newTicket.getWinnings( winningTicket );
        }
        
        // calc net loss
    }
    
}
