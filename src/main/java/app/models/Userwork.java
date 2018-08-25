package app.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Userwork {

	@GeneratedValue
	@Id
	private Long id;

	@Size(min = 3, max = 100, message = "Username must at least 3 characters.")
	private String uName;

	private LocalDateTime currDate;

	@NotNull
	private String taskId;

	@NotNull
	private String taskDescription;

	@NotNull
	private String phase;

	@NotNull
	private Long hoursWorked;

	/*
	 * @NotNull private String status;
	 */

	@NotNull
	private String comments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return uName;
	}

	public void setUserName(String userName) {
		this.uName = userName;
	}

	public LocalDateTime getCurrentDate() {
		return currDate;
	}

	public void setCurrentDate(LocalDateTime currentDate) {
		this.currDate = currentDate;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public Long getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(Long hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	/*
	 * public String getStatus() { return status; }
	 * 
	 * public void setStatus(String status) { this.status = status; }
	 */

}
