import org.junit.Test;
import org.junit.runner.RunWith;
import redis.clients.jedis.Jedis;

/**
 * Created by tl on 2019/3/3.
 */


public class redisTest {


    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6378);
        jedis.set("deer","fuck");

        String deer = jedis.get("deer");
        System.out.println(deer.hashCode());


    }
}
