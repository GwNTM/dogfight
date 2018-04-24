package controller;

import model.IDogfightModel;
import model.Missile;
import view.IViewSystem;

public class DogfightController implements IOrderPerformer{
	private static int TIME_SLEEP =30;
	private IDogfightModel dogfightModel;
	private IViewSystem viewSystem;
	
	public DogfightController(IDogfightModel dogfightModel){
		
	}
	
	public void orderPerform(UserOrder userOrder){
		
	}
	
	public void play(){
		
	}
	
	public void setViewSystem(IViewSystem viewSstem){
		
	}
	
	private void lauchMissile(int player){
		Missile missile = new Missile(null, null);
	}
	
	private void gameLoop(){
		
	}
}
