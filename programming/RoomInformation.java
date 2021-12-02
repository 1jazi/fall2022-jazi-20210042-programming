package programming;

public class RoomInformation {
public static void main(String[] args) {
	Room room = new Room();
	
	room.roomnNmber=23;
	room.roomBulding="Iman";
    room.roomType="2 offices and 2 labs";
    System.out.println("room number -> "+room.roomnNmber+"\n"+"room bulding in -> "+room.roomBulding+"\n"+"room type -> "+ room.roomType+"\n");
    
    Room room2 = new Room();
    
    room2.roomnNmber=21;
	room2.roomBulding="It department";
    room2.roomType="1 office and 1 lab";
    
    System.out.println("room number -> "+room2.roomnNmber+"\n"+"room bulding in -> "+room2.roomBulding+"\n"+"room type -> "+ room2.roomType+"\n");
    
}
}
