package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {
	
	public HDMIToOldMonitorAdapter() {
		System.out.println("Wrapping the VGA OldMonitor interface with a HDMI adapter");
	}

//	@Override
//	public void setImage(String image) {
//		System.out.println("Converting the image from HDMI to VGA");
//		super.setImage(image);
//	}

	@Override
	public void setSound(String sound) {
		System.out.println("Sorry but this device don't support sound");
	}

	
	
}
