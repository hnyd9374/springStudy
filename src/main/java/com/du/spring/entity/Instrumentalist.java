package com.du.spring.entity;

import com.du.spring.controller.PerformanceController;

public class Instrumentalist implements PerformanceController {

	private String song;
	
	private Instrument instrument;
	
	public Instrumentalist() {
	}

	@Override
	public void perform() {
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}

	public String screamSong() {
		return song;
	}
	
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	
}
