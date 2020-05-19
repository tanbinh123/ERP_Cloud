package cc.mrbird.febs.common.core.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj implements Serializable{

    public static final ResultObj IS_LOGIN = new ResultObj(200, "已登录");
    public static final ResultObj UN_LOGIN = new ResultObj(-1, "未登录");

    public static final ResultObj DELETE_SUCCESS = new ResultObj(200, "删除成功");
    public static final ResultObj DELETE_ERROR = new ResultObj(-1, "删除失败");

    public static final ResultObj ADD_SUCCESS = new ResultObj(200, "添加成功");
    public static final ResultObj ADD_ERROR = new ResultObj(-1, "添加失败");

    public static final ResultObj UPDATE_SUCCESS = new ResultObj(200, "修改成功");
    public static final ResultObj UPDATE_ERROR = new ResultObj(-1, "修改失败");

    public static final ResultObj DISPATCH_SUCCESS = new ResultObj(200, "分配成功");
    public static final ResultObj DISPATCH_ERROR = new ResultObj(-1, "分配失败");

    public static final ResultObj RESET_SUCCESS = new ResultObj(200, "重置成功");
    public static final ResultObj RESET_ERROR = new ResultObj(-1, "重置失败");

    /**
     * 部署信息
     */
    public static final ResultObj DEPLOYMENT_SUCCESS = new ResultObj(200, "部署成功");
    public static final ResultObj DEPLOYMENT_ERROR = new ResultObj(-1, "部署失败");

    /**
     * 启动信息
     */
    public static final ResultObj START_SUCCESS = new ResultObj(200, "启动成功");
    public static final ResultObj START_ERROR = new ResultObj(-1, "启动失败");

    /**
     * 任务信息
     */
    public static final ResultObj TASK_START_SUCCESS = new ResultObj(200, "任务完成成功");
    public static final ResultObj TASK_START_ERROR = new ResultObj(-1, "任务完成失败");

    /**
     * 审核信息
     */
    public static final ResultObj AUDIT_SUCCESS = new ResultObj(200, "审核成功");
    public static final ResultObj AUDIT_ERROR = new ResultObj(-1, "审核失败");

    /**
     * 指派信息
     */
    public static final ResultObj ASSIGNED_SUCCESS = new ResultObj(200,"指派成功");
    public static final ResultObj ASSIGNED_ERROR = new ResultObj(-1,"指派失败");

    /**
     * 取货信息
     */
    public static final ResultObj PICKCARGO_SUCCESS = new ResultObj(200,"确认成功");
    public static final ResultObj PICKCARGO_ERROR = new ResultObj(-1,"确认失败");

    /**
     * 结单信息
     */
    public static final ResultObj TRANORDER_SUCCESS = new ResultObj(200,"结单成功");
    public static final ResultObj TRANORDER_ERROR = new ResultObj(-1,"结单失败");

    private Integer code = 200;
    private String msg = "";
    private Object token = "";

    public ResultObj(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
