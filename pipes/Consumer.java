package pipes;

import java.util.Observable;

public abstract class Consumer<T> extends Filter<T> {
	public abstract void consume(T content);
	
	//Method to start in demand driven mode
	public void start(){
		do{
			Message<T> msg= input.read();
			if (!msg.getQuit() && !msg.getFail() ){
				consume(msg.getContent());
			}
			if (msg.getQuit()){
				break;
			}
		}while(true);
		
	}
	
@Override
public void update(Observable o, Object arg) {
	// TODO Auto-generated method stub
	
	Message<T> msg=input.read();
	// Validate for quit and fail flags before consuming
	if (!msg.getQuit() && !msg.getFail()){
		consume(msg.getContent());
	}
	
}
}
