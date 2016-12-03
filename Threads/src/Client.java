// Modified from http://www.cs.armstrong.edu/liang/intro11e/html/TicTacToeClient.html
import java.io.*;
import java.net.*;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Client extends Application 
 {
 
  // Input and output streams from/to server
  private DataInputStream fromServer;
  private DataOutputStream toServer;

  private TextArea taLog;

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Pane to hold cell
	 
    
	  taLog = new TextArea();

	    // Create a scene and place it in the stage
	    
	    Button button = new Button("ClickMe");
	    button.setOnAction( e-> {
	    	try {
				toServer.writeUTF("test");
			} catch (IOException e1) {
				taLog.appendText(e1.toString());
			}
	    } );
	    BorderPane root = new BorderPane();
		root.setTop(new ScrollPane(taLog));
		root.setBottom(button);
		Scene scene = new Scene(root);
	    primaryStage.setTitle("Client"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
    // Connect to the server
    connectToServer();
  }

  private void connectToServer() {
    try {
      // Create a socket to connect to the server
      Socket socket = new Socket("localhost", 8000);

      // Create an input stream to receive data from the server
      fromServer = new DataInputStream(socket.getInputStream());

      // Create an output stream to send data to the server
      toServer = new DataOutputStream(socket.getOutputStream());
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }

    // Control the game on a separate thread
    new Thread(() -> {
      try {
        while(true)
        {
        	taLog.appendText(fromServer.readUTF() + "\n");
        }
      }
      catch (Exception ex) {
        ex.printStackTrace();
      }
    }).start();
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}