package gband;

public class Note {
	private float frequency;
	private float amplitude;
	private float duration;
	
	public Note(float frequency, float amplitude, float duration) {
		super();
		this.frequency = frequency;
		this.amplitude = amplitude;
		this.duration = duration;
	}
	public float getFrequency() {
		return frequency;
	}
	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}
	public float getAmplitude() {
		return amplitude;
	}
	public void setAmplitude(float amplitude) {
		this.amplitude = amplitude;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	

}
