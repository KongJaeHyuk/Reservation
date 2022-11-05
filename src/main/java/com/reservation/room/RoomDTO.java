package com.reservation.room;

public class RoomDTO {
	int room_id;
	String name;
	int price;
	String description;
	String thumbnail_path;
	int default_head;
	
	@Override
	public String toString() {
		return "RoomDTO [room_id=" + room_id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", thumbnail_path=" + thumbnail_path + ", default_head=" + default_head + "]";
	}
	
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getThumbnail_path() {
		return thumbnail_path;
	}
	public void setThumbnail_path(String thumbnail_path) {
		this.thumbnail_path = thumbnail_path;
	}
	public int getDefault_head() {
		return default_head;
	}
	public void setDefault_head(int default_head) {
		this.default_head = default_head;
	}
	
	
}
