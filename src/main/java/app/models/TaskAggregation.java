package app.models;

public class TaskAggregation {

	public TaskAggregation(String uName, String taskId, Long hoursSpent) {
		super();
		this.uName = uName;
		this.taskId = taskId;
		this.hoursSpent = hoursSpent;
	}

	@Override
	public String toString() {
		return "TaskAggregation [uName=" + uName + ", taskId=" + taskId + ", hoursSpent=" + hoursSpent + "]";
	}

	private String uName;
	private String taskId;
	private Long hoursSpent;

	public Long getHoursSpent() {
		return hoursSpent;
	}

	public void setHoursSpent(Long hoursSpent) {
		this.hoursSpent = hoursSpent;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

}
