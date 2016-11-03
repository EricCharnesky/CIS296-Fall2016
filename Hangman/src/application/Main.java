package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class Main extends Application {
	Label secretWordLabel = new Label("Enter the secret word ");
	TextField secretWordTextField = new TextField();
	Button playButton = new Button("Start Game!");
	
	Label guessALetterLabel = new Label("Guess a letter ");
	TextField guessALetterTextField = new TextField();
	Button guessButton = new Button("Guess");
	
	Label hiddenWordLabel = new Label();
	Label lettersGuessedLabel = new Label();
	
	Hangman hangman;
	VBox centerPane;
	
	String secretWord;
	int guesses = 0;
	int maxWrongGuesses = Hangman.MAX_LINES;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			playButton.setOnAction(e -> {
				if ( secretWordTextField.getText().length() > 0 )
				{
					guesses = 0;
					hangman = new Hangman();
					centerPane.getChildren().clear();
					centerPane.getChildren().addAll(hangman, hiddenWordLabel, lettersGuessedLabel);
					
					secretWordLabel.setVisible(false);
					playButton.setVisible(false);
					secretWord = secretWordTextField.getText().toUpperCase();
					secretWordTextField.setText("");
					secretWordTextField.setVisible(false);
					
					guessALetterLabel.setVisible(true);
					guessALetterTextField.setVisible(true);
					guessButton.setVisible(true);
					lettersGuessedLabel.setText("Letters Guessed:");
					lettersGuessedLabel.setVisible(true);
					hiddenWordLabel.setText("");
					for ( int letterCount = 0; letterCount < secretWord.length(); letterCount++ )
					{
						hiddenWordLabel.setText(hiddenWordLabel.getText() + "_ ");
					}
					hiddenWordLabel.setText(hiddenWordLabel.getText().substring(0, secretWord.length() * 2));
					hiddenWordLabel.setVisible(true);
					hangman.drawGallows();
					guessALetterTextField.setText("");
					guessALetterTextField.setEditable(true);
				}
			});
			
			guessButton.setOnAction( e-> {
				if ( guessALetterTextField.getText().length() > 0 )
				{
					String guessString = guessALetterTextField.getText().substring(0, 1).toUpperCase();
					char guessChar = guessString.toCharArray()[0];
					if ( !lettersGuessedLabel.getText().substring(16).contains( guessString ) )
					{
						guessALetterTextField.setText("");
						lettersGuessedLabel.setText( lettersGuessedLabel.getText() + " " + guessString );
						if ( secretWord.contains(guessString) )
						{
							char[] hiddenWordDisplay = hiddenWordLabel.getText().toCharArray();
							char[] secretWordCharArray = secretWord.toCharArray();
							for ( int index = 0; index < secretWord.length(); index++ )
							{
								if ( secretWordCharArray[index] == guessChar )
								{
									hiddenWordDisplay[index*2] = guessChar;
								}
							}
							hiddenWordLabel.setText( new String(hiddenWordDisplay) );
						}
						else
						{
							guesses++;
							hangman.addLine();
						}
						if ( guesses == Hangman.MAX_LINES  )
						{
							guessALetterTextField.setText("YOU LOSE!");
							playAgain();
						}	
						if ( !hiddenWordLabel.getText().contains("_"))
						{
							guessALetterTextField.setText("YOU WIN!");
							playAgain();
						}
					}
				}
				guessALetterTextField.requestFocus();
			});
			
			HBox topPane = new HBox();
			topPane.setAlignment(Pos.CENTER);
			topPane.getChildren().addAll(secretWordLabel, secretWordTextField, playButton);
			
			HBox bottomPane = new HBox();
			bottomPane.setAlignment(Pos.CENTER);
			bottomPane.getChildren().addAll(guessALetterLabel, guessALetterTextField, guessButton);
			guessALetterLabel.setVisible(false);
			guessALetterTextField.setVisible(false);
			guessButton.setVisible(false);
			lettersGuessedLabel.setVisible(false);
			
			centerPane = new VBox();
			
			centerPane.setAlignment(Pos.CENTER);
			
			BorderPane root = new BorderPane();
			root.setTop(topPane);
			root.setBottom(bottomPane);
			root.setCenter(centerPane);
			
			hiddenWordLabel.setVisible(false);
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void playAgain()
	{
		guessALetterTextField.setEditable(false);
		guessButton.setVisible(false);
		secretWordLabel.setVisible(true);
		secretWordTextField.setVisible(true);
		playButton.setVisible(true);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
