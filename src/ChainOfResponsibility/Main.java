package ChainOfResponsibility;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/6/10 21:20
 */
public class Main {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("Hello:)<script> sherlock.com 996");
        FilterChain filterChain = new FilterChain();
        FilterChain filterChain2 = new FilterChain();
        filterChain2.add(new FaceFilter()).add(new UrlFilter());
        filterChain.add(new SensitiveFilter()).add(new HtmlFilter()).add(filterChain2);
        filterChain.doFilter(msg);
        System.out.println(msg);
    }
}




