package gband;

import java.util.Random;

import pipes.Producer;
//Generates a random sequence of <= 100 notes.
public class Composer extends Producer<Note> {
	private Random randomGenerator = new Random();
	private int noOfNotes,noteLimit;
	public Composer() {
		super();
		this.noteLimit=randomGenerator.nextInt(100);
		this.noOfNotes=0;
	}
	@Override
	public Note produce() {
		// TODO Auto-generated method stub
		if (noOfNotes<noteLimit){
			Note soundNote=new Note(randomGenerator.nextFloat()*127, randomGenerator.nextFloat()*127, randomGenerator.nextFloat()*3000);
			noOfNotes++;
			return soundNote;
		}
		
		return null;
	}

}
