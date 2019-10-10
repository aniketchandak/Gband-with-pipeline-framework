package gband;

import pipes.Transformer;
//changes the amplitude of notes in a given frequency band.
public class EQFilter extends Transformer<Note> {
	private float lowerFreq;
	private float upperFreq;
	private float amplitude;
	public EQFilter(float lowerFreq, float upperFreq, float amplitude) {
		super();
		this.lowerFreq = lowerFreq;
		this.upperFreq = upperFreq;
		this.amplitude = amplitude;
	}
	
	public EQFilter() {
		this(40f,60f,80f);
	}

	@Override
	public Note transform(Note content) {
		// TODO Auto-generated method stub
		if(content.getFrequency()>lowerFreq && content.getFrequency()<upperFreq){

			content.setAmplitude(amplitude);
		}
		return content;
	}

}
