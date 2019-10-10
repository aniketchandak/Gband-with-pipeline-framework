package pipes;

import java.util.Observable;

abstract public class Producer<T> extends Filter<T> {
	public abstract T produce();
	//Start method for data driven mode
	public void start(){
		while(true){
			T item=produce();
			Message<T> msg= new Message<T>(item);
			// Set quite flag when msg is null
			if (item==null){
				msg.setQuit(true);
				output.write(msg);
				break;
			}
			output.write(msg);
		}
		
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		T item=produce();
		Message<T> msg= new Message<T>(item);
		// Set quite flag when msg is null
		if (item==null){
			msg.setQuit(true);
		}
		output.write(msg);
	}
	

}
