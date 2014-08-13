package secondTask;

public class ManageCompany {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Company myCompany = new Company("Musala", null);
		CreateCompany newComp = new CreateCompany(myCompany);
		newComp.create();
		newComp.outputAllFloors();
		newComp.printRooms();
		newComp.roomsInFloor(5);
		newComp.addRoom(5, "lqlq", true, 20);
		newComp.mergeRooms(newComp.getOfficeRooms().get(0), newComp.getOfficeRooms().get(1), 19);
		newComp.printRooms();
		newComp.outputAllFloors();
		newComp.roomsInFloor(5);

		// List<OfficeRoom> officeRooms = new ArrayList<OfficeRoom>();
		// officeRooms.add(new OfficeRoom(3, "zone1", true, 30));
		// officeRooms.add(new OfficeRoom(12, "zone2", false, 20));
		// officeRooms.add(new OfficeRoom(2, "ibm", true, 40));
		// officeRooms.add(new OfficeRoom(7, "IC", true, 30));

		// Company myCompany = new Company("Musala", officeRooms);
		// int[] floors = myCompany.numberOfRooms();
		//
		// System.out.println(myCompany.roomsInFloor(floors, 3));
		//
		// //System.out.println(myCompany.hasEquipmentInMeeting(officeRooms.get(3)));
		// System.out.println(myCompany.allFloors(floors));
		// for (int i = 0; i < officeRooms.size(); i++) {
		// if(officeRooms.get(i) != null)
		// System.out.println(officeRooms.get(i).getName());
		// }
		//
		// //System.out.println(officeRooms.get(0).isMeetingRoom());
		// int newFloor = 5;
		// myCompany.addRoom(newFloor, "lqlq", true, 20);
		// myCompany.addFloor(floors, newFloor);
		//
		// myCompany.mergeRooms(officeRooms.get(0), officeRooms.get(1), 19);
		// //myCompany.addFloor(floors, officeRooms.get(5).getFloor());
		// myCompany.addFloor(floors, officeRooms.get(officeRooms.size() -
		// 1).getFloor());
		// myCompany.removeFloor(floors, officeRooms.get(0).getFloor());
		// myCompany.removeFloor(floors, officeRooms.get(1).getFloor());
		//
		// System.out.println(officeRooms.get(4).getFloor());
		// for (int i = 0; i < officeRooms.size(); i++) {
		// System.out.println(officeRooms.get(i).getName());
		// }
		// System.out.println(myCompany.allFloors(floors));//tyk vzema stariq
		// masiv

	}

}
