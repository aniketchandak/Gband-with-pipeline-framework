package pipes;

import java.util.Observable;

public class Pipe <T> extends Observable{
	public static boolean demandDriven;
	private Message<T> data=null;
	
	public void write(Message<T> msg){
		data=msg;
		//Notify to subscribers on write operation on pipe in data driven mode
		if (!demandDriven){
			setChanged();
			notifyObservers();
			clearChanged();
		}
	}
	
	public Message<T> read(){
		//Notify to subscribers on read operation on pipe in demand driven
		if (demandDriven){
			setChanged();
			notifyObservers();
			clearChanged();
		}
		
		return data;
	}
}
