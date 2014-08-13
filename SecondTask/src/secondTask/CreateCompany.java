package secondTask;

import java.util.ArrayList;
import java.util.List;

public class CreateCompany {

	Company myCompany;

	public CreateCompany(Company myCompany) {
		this.myCompany = myCompany;
	}

	public void create() {

		List<OfficeRoom> officeRooms = new ArrayList<OfficeRoom>();
		officeRooms.add(new OfficeRoom(3, "zone1", true, 30));
		officeRooms.add(new OfficeRoom(12, "zone2", false, 20));
		officeRooms.add(new OfficeRoom(2, "ibm", true, 40));
		officeRooms.add(new OfficeRoom(7, "IC", true, 30));

		this.myCompany = new Company(myCompany.getName(), officeRooms);

	}

	public void addRoom(int newFloor, String name, boolean meetingRoom,
			int numberOfPeople) {
		myCompany.addRoom(newFloor, name, meetingRoom, numberOfPeople);
		myCompany.addFloor(myCompany.numberOfRooms(), newFloor);
		System.out.println("The room " + name + " is add.");
	}

	public void mergeRooms(OfficeRoom roomOne, OfficeRoom roomTwo, int floor) {
		myCompany.addMergedRoom(roomOne, roomTwo, floor);
		myCompany.addFloor(myCompany.numberOfRooms(), myCompany
				.getOfficeRooms().get(myCompany.getOfficeRooms().size() - 1)
				.getFloor());
		myCompany.removeFloor(myCompany.numberOfRooms(), roomOne.getFloor());
		myCompany.removeFloor(myCompany.numberOfRooms(), roomTwo.getFloor());
		System.out.println(roomOne.getName() + " and " + roomTwo.getName()
				+ " are merge.");

	}

	public void printRooms() {
		System.out.println("Rooms now are: ");
		for (int i = 0; i < this.myCompany.getOfficeRooms().size(); i++) {
			if (myCompany.getOfficeRooms().get(i) != null)
				System.out.println(myCompany.getOfficeRooms().get(i).getName());
		}
	}

	public void roomsInFloor(int floor) {
		System.out.print("Rooms in " + floor + " floor are: ");
		System.out.println(myCompany.roomsInFloor(myCompany.numberOfRooms(),
				floor));
	}

	public void outputAllFloors() {
		System.out.print("The floors are: ");
		System.out.println(myCompany.allFloors(myCompany.numberOfRooms()));
	}

	public List<OfficeRoom> getOfficeRooms() {
		return myCompany.getOfficeRooms();
	}

	public String getName() {
		return myCompany.getName();
	}
}
