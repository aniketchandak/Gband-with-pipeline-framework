package gband;

import pipes.Transformer;
//Decrease the amplitude of notes above a given amplitude threshold.
public class Limiter extends Transformer<Note> {
	private float amplitudeThreshold;
	public Limiter(float amplitudeThreshold) {
		super();
		this.amplitudeThreshold = amplitudeThreshold;
	}
	
	public Limiter() {
		this(115f);
	}

	@Override
	public Note transform(Note content) {
		// TODO Auto-generated method stub
		if(content.getAmplitude()>amplitudeThreshold){
			
			content.setAmplitude(amplitudeThreshold);
		}
		return content;
	}

}
