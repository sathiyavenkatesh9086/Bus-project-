package model;

public class Bus {
	private int bus_id;
	public int getBus_id() {
		return bus_id;
	}
	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}
	public String getBus_type() {
		return bus_type;
	}
	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}
	public String getBus_starting() {
		return bus_starting;
	}
	public void setBus_starting(String bus_starting) {
		this.bus_starting = bus_starting;
	}
	public String getBus_destination() {
		return bus_destination;
	}
	public void setBus_destination(String bus_destination) {
		this.bus_destination = bus_destination;
	}
	public Bus(int bus_id, String bus_type, String bus_starting,
			String bus_destination) {
		this.bus_id = bus_id;
		this.bus_type = bus_type;
		this.bus_starting = bus_starting;
		this.bus_destination = bus_destination;
	}
	private String bus_type;
	private String bus_starting;
	private String bus_destination;

}
