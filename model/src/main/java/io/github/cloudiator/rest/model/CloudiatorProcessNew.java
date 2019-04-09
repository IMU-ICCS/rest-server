package io.github.cloudiator.rest.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A process represents a task running on a node
 */
@ApiModel(description = "A process represents a task running on a node")
@Validated

public class CloudiatorProcessNew   {
  @JsonProperty("schedule")
  private String schedule = null;

  @JsonProperty("task")
  private String task = null;

  @JsonProperty("lifecycleInterface")
  private String lifecycleInterface = null;

  public CloudiatorProcessNew schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * The id of the schedule this process belongs to.
   * @return schedule
  **/
  @ApiModelProperty(required = true, value = "The id of the schedule this process belongs to.")
  @NotNull


  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public CloudiatorProcessNew task(String task) {
    this.task = task;
    return this;
  }

  /**
   * The id of the task that is instantiated by this process.
   * @return task
  **/
  @ApiModelProperty(required = true, value = "The id of the task that is instantiated by this process.")
  @NotNull


  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public CloudiatorProcessNew lifecycleInterface(String lifecycleInterface) {
    this.lifecycleInterface = lifecycleInterface;
    return this;
  }

  /**
   * The lifecycle interface used for running the process.
   * @return lifecycleInterface
  **/
  @ApiModelProperty(required = true, value = "The lifecycle interface used for running the process.")
  @NotNull


  public String getLifecycleInterface() {
    return lifecycleInterface;
  }

  public void setLifecycleInterface(String lifecycleInterface) {
    this.lifecycleInterface = lifecycleInterface;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudiatorProcessNew cloudiatorProcessNew = (CloudiatorProcessNew) o;
    return Objects.equals(this.schedule, cloudiatorProcessNew.schedule) &&
        Objects.equals(this.task, cloudiatorProcessNew.task) &&
        Objects.equals(this.lifecycleInterface, cloudiatorProcessNew.lifecycleInterface);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule, task, lifecycleInterface);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudiatorProcessNew {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    lifecycleInterface: ").append(toIndentedString(lifecycleInterface)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

