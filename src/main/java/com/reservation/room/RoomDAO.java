package com.reservation.room;

import java.util.List;

public interface RoomDAO {
	public int insertRoom(RoomDTO roomDTO);
	public List selectRoom();
	public RoomDTO selectRoomInfo(int room_id);
	public int updateRoom(RoomDTO roomDTO);
}
