package pipes;

import java.util.Observable;
import java.util.Observer;

public abstract class Filter<T> implements Observer {
protected Pipe<T> input,output;
public void setInput(Pipe<T> input){
	this.input=input;
	// In data driven mode, filter observes the input pipe for changes
	if (!Pipe.demandDriven){
		input.addObserver(this);
	}
}
public void setOutput(Pipe<T> output){
	this.output=output;
	// In demand driven mode, filter observes the output pipe for changes
	if(Pipe.demandDriven){
		output.addObserver(this);
	}
}

	@Override
	public abstract void update(Observable o, Object arg);

}
