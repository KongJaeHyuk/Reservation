package com.reservation.book;

import java.sql.Date;

public class ReservationDTO {

	int resv_id;
	int room_id;
	int user_id;
	Date date_in;
	Date date_out;
	String str_date_in;
	String str_date_out;
	int price;
	int head_count;
	String memo;
	int status_code;
	
	String name;
	String tel;
	String email;
	int point;
	
	public int getResv_id() {
		return resv_id;
	}
	public void setResv_id(int resv_id) {
		this.resv_id = resv_id;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getDate_in() {
		return date_in;
	}
	public void setDate_in(Date date_in) {
		this.date_in = date_in;
	}
	public Date getDate_out() {
		return date_out;
	}
	public void setDate_out(Date date_out) {
		this.date_out = date_out;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getHead_count() {
		return head_count;
	}
	public void setHead_count(int head_count) {
		this.head_count = head_count;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	
	public String getStr_date_in() {
		return str_date_in;
	}
	public void setStr_date_in(String str_date_in) {
		this.str_date_in = str_date_in;
	}
	public String getStr_date_out() {
		return str_date_out;
	}
	public void setStr_date_out(String str_date_out) {
		this.str_date_out = str_date_out;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "ReservationDTO [resv_id=" + resv_id + ", room_id=" + room_id + ", user_id=" + user_id + ", date_in="
				+ date_in + ", date_out=" + date_out + ", str_date_in=" + str_date_in + ", str_date_out=" + str_date_out
				+ ", price=" + price + ", head_count=" + head_count + ", memo=" + memo + ", status_code=" + status_code
				+ "]";
	}
	
	
}
