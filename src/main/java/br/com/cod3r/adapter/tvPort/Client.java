package br.com.cod3r.adapter.tvPort;

import br.com.cod3r.adapter.tvPort.adapters.HDMIToOldMonitorAdapter;
import br.com.cod3r.adapter.tvPort.adapters.HDMIToVGAAdapter;
import br.com.cod3r.adapter.tvPort.devices.Computer;
import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Action movie", "Explosions and fire");
		
		System.out.println("------ Monitor ----------");
		
		// Adapter using Object
		Computer pc2 = new Computer();
		OldMonitor monitor = new OldMonitor();
//		pc2.connectPort(monitor); // Don't work because need the type HDMI
		pc2.connectPort(new HDMIToVGAAdapter(monitor));
		pc2.sendImageAndSound("Action movie", "Explosions and fire");

		// Adapter using Class
		System.out.println("------ Monitor Class Adapter ----------");
		Computer pc3 = new Computer();
		HDMIToOldMonitorAdapter monitorAdapter = new HDMIToOldMonitorAdapter();
		pc3.connectPort(monitorAdapter);
		pc3.sendImageAndSound("Fantasy movie", "Ring sound and magic");
	}
}
