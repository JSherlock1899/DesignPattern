package ChainOfResponsibility;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/6/10 21:37
 */
public class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("996", "955");
        msg.setMsg(r);
        return false;
    }
}
