package objlongconsumer;

public class Transaction {

	private String description;

	private long timestamp;

	public Transaction(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

}
