package com.tms.modal;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Plan {
	@Id
	int pid;
	@Column
	String pname;
	int validity;
	int data;
	int voice;
	int sms;
	int price;
	public Plan() {
		
	}
	public Plan(int pid, String pname, int validity, int data, int voice, int sms, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.validity = validity;
		this.data = data;
		this.voice = voice;
		this.sms = sms;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getVoice() {
		return voice;
	}
	public void setVoice(int voice) {
		this.voice = voice;
	}
	public int getSms() {
		return sms;
	}
	public void setSms(int sms) {
		this.sms = sms;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Plan [pid=" + pid + ", pname=" + pname + ", validity=" + validity + ", data=" + data + ", voice="
				+ voice + ", sms=" + sms + ", price=" + price + "]";
	}
	

}
