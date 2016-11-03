package application;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Hangman extends Pane {
	public static int MAX_LINES = 6;
	
	private int currentLines = 0;
	private Circle head;
	private Line body;
	private Line leftLeg;
	private Line rightLeg;
	private Line leftArm;
	private Line rightArm;
	private Line gallowBase;
	private Line gallowPillar;
	private Line gallowArm;
	private Line gallowRope;
	
	public Hangman()
	{
		setWidth(400);
		setHeight(200);
		setPrefWidth(400);
		setPrefHeight(200);
		head = new Circle();
		body = new Line();
		leftLeg = new Line();
		rightLeg = new Line();
		leftArm = new Line();
		rightArm = new Line();
	}
	
	public void drawGallows()
	{
		gallowBase = new Line(0, getHeight() - 10, getWidth(), getHeight() - 10 );
		getChildren().add( gallowBase );
		gallowPillar = new Line(getWidth() - 20, getHeight() - 10, getWidth() - 20, 10 );
		getChildren().add( gallowPillar );
		gallowArm = new Line(getWidth() - 20, 10, getWidth() / 2, 10 );
		getChildren().add( gallowArm );
		gallowRope = new Line( getWidth() / 2, 10, getWidth() / 2, 20 );
		getChildren().add( gallowRope );
	}
	
	public void addLine()
	{
		switch(currentLines++)
		{
		case 0:
			head = new Circle(gallowRope.getEndX(), gallowRope.getEndY() + 20, 20);
			head.setFill(null);
			head.setStroke(Color.BLACK);
			getChildren().add(head);
			break;
		case 1:
			body = new Line(head.getCenterX(), head.getCenterY() + 20, head.getCenterX(),head.getCenterY() + 100 );
			getChildren().add(body);
			break;
		case 2:
			leftLeg = new Line(body.getEndX(), body.getEndY(), body.getEndX() - 30, body.getEndY() + 30 );
			getChildren().add(leftLeg);
			break;
		case 3:
			rightLeg = new Line(body.getEndX(), body.getEndY(), body.getEndX() + 30, body.getEndY() + 30 );
			getChildren().add(rightLeg);
			break;
		case 4:
			leftArm = new Line( body.getStartX(), ( body.getEndY() + body.getStartY() ) / 2, body.getEndX() - 30, ( body.getEndY() + body.getStartY() ) / 2 - 30 );
			getChildren().add(leftArm);
			break;
		case 5:
			rightArm = new Line( body.getStartX(), ( body.getEndY() + body.getStartY() ) / 2, body.getEndX() + 30, ( body.getEndY() + body.getStartY() ) / 2 - 30 );
			getChildren().add(rightArm);
			break;
		}
		
	}
}
