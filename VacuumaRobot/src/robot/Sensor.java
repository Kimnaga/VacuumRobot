package robot;

public abstract class Sensor {
	@SuppressWarnings("unused")
	private SensorType type = null;
	
	public Sensor (SensorType type){
		setType (type);
		
	}
	
	public SensorType getType (SensorType model){
		return model;
	}
	
	public void setType (SensorType model){
		if (model == null){
			//error message;
		}
	    else
			this.setType(model);
	}
	
	
	public abstract void detect ();
	
	public abstract void sendSignal ();

	
	
}
