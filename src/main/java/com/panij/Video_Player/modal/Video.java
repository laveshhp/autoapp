package com.panij.Video_Player.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String videoname;
	private String description;
	@ManyToOne
	private Channel channel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVideoname() {
		return videoname;
	}
	public void setVideoname(String videoname) {
		this.videoname = videoname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Video(int id, String videoname, String description) {
		super();
		this.id = id;
		this.videoname = videoname;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Video [id=" + id + ", videoname=" + videoname + ", description=" + description + "]";
	}
	
	

}
