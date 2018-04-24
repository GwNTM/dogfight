package view;

import java.util.Observable;

import controller.IOrderPerformer;
import model.IDogfightModel;

public class DogfightView implements IViewSystem, Runnable {
	
	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicsBuilder;

	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		
	}

	
	public String displayMessage(String message) {
		return message;
	}
	
	public void closeAll() {
	}


	@Override
	public void run() {
		
	}
	
}
