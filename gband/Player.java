package gband;



import javax.sound.midi.*;


import pipes.Consumer;
//Play the notes through the computer's sound system.
public class Player extends Consumer<Note> {
	Synthesizer synth;
	MidiChannel channel;
	
	public Player()  {
		super();
		try {
			this.synth = MidiSystem.getSynthesizer();
			this.synth.open();
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
		
		this.channel =  synth.getChannels()[0];
		
	}

	@Override
	public void consume(Note content) {
		
		
		try {
			channel.noteOn((int)content.getFrequency(), (int)content.getAmplitude());
			Thread.sleep( (long)content.getDuration());
			channel.noteOff((int)content.getFrequency());
		}  catch (InterruptedException e) {

			e.printStackTrace();
		}
		
	}

	

}
