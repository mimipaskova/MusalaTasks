package secondTask;

public class MeetingRoom extends Room {

	private boolean hasEquipment;

	public MeetingRoom(String name) {
		super(name);
		this.setHasEquipment(true);
	}
	
	public MeetingRoom(String name, boolean hasEquipment) {
		super(name);
		this.hasEquipment= hasEquipment;
	}

	public boolean getHasEquipment() {
		return this.hasEquipment;
	}

	public void setHasEquipment(boolean hasEquipment) {
		this.hasEquipment = hasEquipment;
	}
	

}


