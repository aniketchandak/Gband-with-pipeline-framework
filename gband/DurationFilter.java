package gband;

import pipes.Tester;
//Remove noise notes from the stream, note that's suspiciously different from its predecessor 
public class DurationFilter extends Tester<Note> {
	private float upperLimitDuration;
	private float loweLimitDuration;
	public DurationFilter(float upperLimitDuration, float loweLimitDuration) {
		super();
		this.upperLimitDuration = upperLimitDuration;
		this.loweLimitDuration = loweLimitDuration;
	}
	
	
	
	public DurationFilter() {
		this(1000f,800f);
	}



	@Override
	public boolean test(Note content) {
		// TODO Auto-generated method stub
		if(content.getDuration()>upperLimitDuration || content.getDuration()<loweLimitDuration){
			return false;
		}
		
		return true;
	}

}
