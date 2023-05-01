package com.gazaltech.core.usecases.classroom;

import com.gazaltech.core.domain.classroom.ClassRoom;

public class ClassRoomService {
	
	
	public ClassRoomService() {

	}

	public Boolean changeNameRoomClass(ClassRoom roomclass, String newName) throws Exception {
		if (roomclass.getNameRoom().equals(newName)) {
			throw new Exception("O novo nome é igual ao anterior");
		}
		roomclass.setNameRoom(newName);
		return Boolean.TRUE;
	}
}
