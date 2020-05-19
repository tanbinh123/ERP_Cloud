package cc.mrbird.febs.common.core.entity.common;

public class Constant implements Serializable{

    /**
     * 用户类型
     */
    public static final Integer USER_TYPE_SUPER = 0;
    public static final Integer USER_TYPE_NORMAL = 1;

    /**
     * 可用类型
     */
    public static final Integer AVAILABLE_TRUE = 1;
    public static final Integer AVAILABLE_FALSE = 0;

    /**
     * 权限类型
     */
    public static final String MENU_TYPE_TOP = "topmenu";
    public static final String MENU_TYPE_LEFT = "leftmenu";
    public static final String MENU_TYPE_PERMISSION = "permission";

    /**
     * 是否展开
     */
    public static final Integer SPREAD_TRUE = 1;
    public static final Integer SPREAD_FALSE = 0;

    /**
     * 默认信息
     */
    public static final String DEFAULT_PWD = "123456";
    public static final String DEFAULT_TITLE_IMAGE = "group1/M00/00/00/rBGuPl6XAZiATNasAAAnSW-kclA511.jpg";

    /**
     * 请假单的状态
     */
    public static final String STATE_LEAVEBILL_ZORO = "0";//未提交
    public static final String STATE_LEAVEBILL_ONE = "1";//审批中
    public static final String STATE_LEAVEBILL_TWO = "2";//审批完成
    public static final String STATE_LEAVEBILL_THREE = "3";//已放弃
}
