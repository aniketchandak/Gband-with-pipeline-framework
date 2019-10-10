package gband;

import pipes.Tester;
// Removes noise from notes
public class NoiseFilter extends Tester<Note> {
	private Note prevNote;
	private float ampThreashold;
	private float freqThreashold;
	private float durationThreashold;
	
	public NoiseFilter(float amp,float freq, float dur) {
		super();
		this.ampThreashold = amp;
		this.freqThreashold=freq;
		this.durationThreashold=dur;
	}
	
	public NoiseFilter() {
		this(40f,30f,1500f);
	}
	@Override
	public boolean test(Note content) {
		// TODO Auto-generated method stub
		if (!similar(content)){
			return false;
		}
		prevNote=content;
		return true;
		
	}
	private boolean similar(Note content) {
		// TODO Auto-generated method stub
		if(prevNote==null){
			return true;
		}
		else{
			
			if (Math.abs(content.getAmplitude()-prevNote.getAmplitude()) > ampThreashold ||
					Math.abs(content.getFrequency()-prevNote.getFrequency()) > freqThreashold ||
							Math.abs(content.getDuration()-prevNote.getDuration())> durationThreashold
							){
				return false;
				
			}
		}
		return true;
		
	}

}
