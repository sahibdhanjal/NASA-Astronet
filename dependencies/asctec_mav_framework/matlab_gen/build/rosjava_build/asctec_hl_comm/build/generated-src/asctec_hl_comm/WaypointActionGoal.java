package asctec_hl_comm;

public interface WaypointActionGoal extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "asctec_hl_comm/WaypointActionGoal";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalID goal_id\nasctec_hl_comm/WaypointGoal goal\n";
  static final boolean _IS_SERVICE = false;
  static final boolean _IS_ACTION = true;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalID getGoalId();
  void setGoalId(actionlib_msgs.GoalID value);
  asctec_hl_comm.WaypointGoal getGoal();
  void setGoal(asctec_hl_comm.WaypointGoal value);
}
