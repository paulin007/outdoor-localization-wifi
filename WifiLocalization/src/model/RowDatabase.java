package model;

public class RowDatabase {
	
	private int id;
	
	private float x;

	private float y;

	private String bssid;

	private int frequency ;

	private int level;

	private Long timestamp;

	private int channel ;

	
	public RowDatabase (){
		
	}
	
	
	public RowDatabase(int id, float x, float y, String bssid, int level) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.bssid = bssid;
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public String getBssid() {
		return bssid;
	}

	public void setBssid(String bssid) {
		this.bssid = bssid;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		
		return " x : "+ x+" y : "+y+" "+"bssid : "+bssid+"  potenza : "+level;
	}

}
