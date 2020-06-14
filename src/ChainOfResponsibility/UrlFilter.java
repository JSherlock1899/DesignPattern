package ChainOfResponsibility;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/6/10 21:58
 */
public class UrlFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("sherlock.com", "https://www.sherlock.com");
        msg.setMsg(r);
        return true;
    }
}
