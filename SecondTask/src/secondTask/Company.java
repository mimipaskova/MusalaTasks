package secondTask;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private String name;
	private List<OfficeRoom> officeRooms;
	private int[] floors;

	public Company(String name, List<OfficeRoom> officeRooms) {
		this.name = name;
		this.officeRooms = officeRooms;
	}

	public int[] numberOfRooms() {
		floors = new int[20];
		int index;
		for (int i = 0; i < officeRooms.size(); i++) {
			index = officeRooms.get(i).getFloor();
			floors[index]++;
		}
		return floors;
	}

	public int roomsInFloor(int[] floors, int floor) {
		return floors[floor];
	}

	public List<Integer> allFloors(int[] floors) {
		List<Integer> allFloors = new ArrayList<>();
		for (int i = 0; i < floors.length; i++) {
			if (floors[i] != 0) {
				allFloors.add(i);
			}
		}
		return allFloors;
	}

	public int[] addFloor(int[] floors, int newFloor) {
		floors[newFloor]++;
		return floors;
	}

	public int[] removeFloor(int[] floors, int newFloor) {
		floors[newFloor]--;
		return floors;
	}

	public void addMergedRoom(OfficeRoom roomOne, OfficeRoom roomTwo, int floor) {
		String name = roomOne.getName() + " " + roomTwo.getName();
		boolean meetingRoom = false;
		int numberOfPeople = 0;
		addRoom(floor, name, meetingRoom, numberOfPeople);
		this.officeRooms.remove(roomOne);
		this.officeRooms.remove(roomTwo);
	}

	public boolean hasEquipmentInMeeting(OfficeRoom room) {
		if (room.isMeetingRoom() == true) {
			MeetingRoom meeting = new MeetingRoom(getName(), true);
			return meeting.getHasEquipment();
		}
		return false;
	}

	public void addRoom(int floor, String name, boolean meetingRoom,
			int numberOfPeople) {
		officeRooms.add(new OfficeRoom(floor, name, meetingRoom, numberOfPeople));
		addFloor(numberOfRooms(), floor);
		allFloors(numberOfRooms());
	}
	

	public String getName() {
		return name;
	}

	public List<OfficeRoom> getOfficeRooms() {
		return officeRooms;
	}

	public void setOfficeRooms(List<OfficeRoom> officeRooms) {
		this.officeRooms = officeRooms;
	}
}
