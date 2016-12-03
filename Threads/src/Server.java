
// Modified from http://www.cs.armstrong.edu/liang/intro11e/html/TicTacToeServer.html
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Server extends Application 
{
	private int playerNumber = 1;
	private TextArea taLog;
	private ArrayList<Socket> players;
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    taLog = new TextArea();
    players = new ArrayList<Socket>();

    Button button = new Button("ClickMe");
    button.setOnAction( e-> {
    	try {
			for ( Socket player : players )
			{
				new DataOutputStream(player.getOutputStream()).writeUTF("test");	
			}
    		
		} catch (IOException e1) {
			taLog.appendText(e1.toString());
		}
    } );
    BorderPane root = new BorderPane();
	root.setTop(new ScrollPane(taLog));
	root.setBottom(button);
	Scene scene = new Scene(root);
    primaryStage.setTitle("Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    new Thread( () -> {
      try {
        // Create a server socket
        ServerSocket serverSocket = new ServerSocket(8000);
        Platform.runLater(() -> taLog.appendText(new Date() +
          ": Server started at socket 8000\n"));
  
        // Ready to create a session for every player
        while (true) {
          Platform.runLater(() -> taLog.appendText(new Date() +
            ": Wait for players to join \n") );
  
          // Connect to player
          Socket player = serverSocket.accept();
          players.add(player);  
  
          Platform.runLater(() -> {
            taLog.appendText(new Date() + ": Player " + playerNumber + " joined session '\n");
          });
  
          // Display this session and increment player number
          Platform.runLater(() -> 
            taLog.appendText(new Date() + 
              ": Start a thread for player " + playerNumber++ + '\n'));
  
          // Launch a new thread for this player session
          new Thread(new HandleASession(player)).start();
        }
      }
      catch(IOException ex) {
        ex.printStackTrace();
      }
    }).start();
  }

  // Define the thread class for handling a new session
  class HandleASession implements Runnable {
    private Socket player;
  
    private DataInputStream fromPlayer;
  
    /** Construct a thread */
    public HandleASession(Socket player) {
      this.player = player;
    }
  
    /** Implement the run() method for the thread */
    public void run() {
      try {
        // Create data input and output streams
        fromPlayer = new DataInputStream(
          player.getInputStream());
  
  
  
        // Continuously wait for player input
        while (true) {
          // Receive input from the player
        	taLog.appendText(fromPlayer.readUTF());
        	taLog.appendText("\n");
        }
      }
      catch(IOException ex) {
        ex.printStackTrace();
      }
    }
  }
 
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}