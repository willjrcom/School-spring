package com.gazaltech.core.domain.room;

public class RoomClassService {
	
	
	public RoomClassService() {

	}

	public Boolean changeNameRoomClass(RoomClass roomclass, String newName) throws Exception {
		if (roomclass.getNameRoom().equals(newName)) {
			throw new Exception("O novo nome é igual ao anterior");
		}
		roomclass.setNameRoom(newName);
		return Boolean.TRUE;
	}
}
