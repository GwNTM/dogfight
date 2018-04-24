package view;

public class DogfightView implements IViewSystem, Runnable {
	
	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicsBuilder;

	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		
	}
	
	private void run() {
		
	}
	
	public String displayMessage(String message) {
		return message;
	}
	
	public void closeAll() {
	}
	
}
