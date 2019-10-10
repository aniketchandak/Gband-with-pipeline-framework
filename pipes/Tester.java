package pipes;

import java.util.Observable;

public abstract class Tester<T> extends Filter<T> {
public abstract boolean test(T content);
@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
			Message <T> msg=input.read();
			
			// Validate msg and run test on valid msg. If test fails then set fail flag
			if (!msg.getQuit() && !msg.getFail() ){
				boolean result=test(msg.getContent());
				if(!result){
					msg.setFail(true);
				}
			}
			output.write(msg);
		
		
	}
}
