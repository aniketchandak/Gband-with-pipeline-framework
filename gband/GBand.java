package gband;

import pipes.Pipe;

public class GBand {
	public static boolean demandDriven = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pipe<Note> p1 = new Pipe<Note>();
		Pipe<Note> p2 = new Pipe<Note>();
		Pipe<Note> p3 = new Pipe<Note>();
		Pipe<Note> p4 = new Pipe<Note>();
		Pipe<Note> p5 = new Pipe<Note>();
		Pipe<Note> p6 = new Pipe<Note>();
		
		Pipe.demandDriven = demandDriven;
		
		Composer f1=new Composer(); 
		Amplifier f2=new Amplifier(2f); //  amplifier which doubles amplitude
		DurationFilter f3=new DurationFilter(2000f, 10f); // Filters duration less than 10ms and greater than 1000ms
		EQFilter f4=new EQFilter(70f, 90f, 69f); // Changes amplitude to 69 for freq band 70-90
		Limiter f5=new Limiter(115f); //Limits amplitude above 115
		NoiseFilter f6=new NoiseFilter(30f,40f,2000f); //Filters noise notes
		Player f7=new Player();
		
		f1.setOutput(p1);
		f2.setInput(p1);
		f2.setOutput(p2);
		f3.setInput(p2);
		f3.setOutput(p3);
		f4.setInput(p3);
		f4.setOutput(p4);
		f5.setInput(p4);
		f5.setOutput(p5);
		f6.setInput(p5);
		f6.setOutput(p6);
		f7.setInput(p6);
		
		if (demandDriven) {
			f7.start();
		} else {
			f1.start();
		}
		
		
		
		
		

	}

}
