package pipes;

public class Message <T> {
	public Message(T item) {
		// TODO Auto-generated constructor stub
		
		content=item;
		
	}
	private T content;
	private boolean quit;
	private boolean fail;
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}
	public Boolean getQuit() {
		return quit;
	}
	public void setQuit(boolean quit) {
		this.quit = quit;
	}
	public Boolean getFail() {
		return fail;
	}
	public void setFail(boolean fail) {
		this.fail = fail;
	}
	

}
