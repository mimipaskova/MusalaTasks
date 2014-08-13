package secondTask;

public class OfficeRoom extends Room {
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OfficeRoom){
			if(this.getName().equals(((OfficeRoom) obj).getName()))
				return true;
		}
		return false;
		//return super.equals(obj);
	}


	private int floor;
	private boolean meetingRoom;
	private int numberOfPeople;
	
		
	public OfficeRoom(int floor, String name,  boolean meetingRoom, int numberOfPeople) {
		super(name);
		this.setFloor(floor);
		this.meetingRoom = meetingRoom;
		this.setNumberOfPeople(numberOfPeople);
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	
	public boolean isMeetingRoom() {
		return meetingRoom;
	}


	public void setMeetingRoom(boolean meetingRoom) {
		this.meetingRoom = meetingRoom;
	}

}
