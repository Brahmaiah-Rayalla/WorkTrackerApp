package app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import app.models.Userwork;

public interface WorkRepository extends CrudRepository<Userwork, Long> {

	@Query("Select count(distinct taskId) from Userwork where uName = :userName")
	Long getTaskCount(@Param("userName") String userName);

	@Query(value = "select hoursCount, submissionCount from  (select u_name, sum(hours_Worked) hoursCount, count(1) submissionCount from USERWORK group by u_Name having u_Name = :userName)", nativeQuery = true)
	List<Object[]> getHoursAndSubmissionCount(@Param("userName") String userName);

	@Query(value = "select task_id, hoursSpent from (select u_name, task_id, sum(hours_worked) hoursSpent from USERWORK  group by u_name, task_id having u_name = :userName)", nativeQuery = true)
	List<Object[]> getTaskInfo(@Param("userName") String userName);

	List<Userwork> findTop10ByUNameOrderByCurrDateDesc(String uName);

}
