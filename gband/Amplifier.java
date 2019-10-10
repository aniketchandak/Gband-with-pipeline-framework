package gband;

import pipes.Transformer;
//Increases or decreases the volume of each note
public class Amplifier extends Transformer<Note>{
	private float amount;
	public Amplifier( float amount) {
		super();
		
		this.amount = amount;
	}
	public Amplifier() {
		this(50f);
	}

	

	@Override
	public Note transform(Note content) {
		// TODO Auto-generated method stub	
		content.setAmplitude(content.getAmplitude()*amount);
		return content;
	}



	

}
