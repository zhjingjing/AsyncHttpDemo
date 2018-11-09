package com.zj.asynchttp.bean;

import java.util.List;

/**
 * create by zj on 2018/11/9
 */
public class CourierBean {
//    {
//        "code": "OK",
//            "no": "780098068058",
//            "type": "ZTO",
//            "list": [{
//        "content": "【石家庄市】 快件已在 【长安三部】 签收,签收人: 本人, 感谢使用中通快递,期待再次为您服务!",
//                "time": "2018-03-09 11:59:26"
//    },  {
//        "content": "【广州市】 【广州花都】（020-37738523） 的 马溪 （18998345739） 已揽收",
//                "time": "2018-03-07 00:01:55"
//    }],
//        "state": "3",  /* -1：单号或代码错误；0：暂无轨迹；1:快递收件；2：在途中；3：签收；4：问题件 */
//            "msg": "查询成功",
//            "name": "中通快递",
//            "site": "www.zto.com",
//            "phone": "95311",
//            "logo": "http://img3.fegine.com/express/zto.jpg"      /*  快递Logo  */
//    }
    public String code;
    public String no;
    public String type;
    public String msg;
    public String name;
    public String site;
    public String phone;
    public String logo;
    public List<RouteBean> list;

    public class RouteBean{
        public String content;
        public String time;
    }



}
