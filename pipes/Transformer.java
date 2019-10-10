package pipes;

import java.util.Observable;

public abstract class Transformer<T> extends Filter<T> {
public abstract T transform(T content);
@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
			Message <T> msg=input.read();
			if (!msg.getQuit() && !msg.getFail() ){
				msg.setContent(transform(msg.getContent()));
			}
			output.write(msg);
		
		
	}
}
