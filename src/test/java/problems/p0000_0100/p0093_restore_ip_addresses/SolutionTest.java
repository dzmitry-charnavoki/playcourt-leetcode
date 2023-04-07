package problems.p0000_0100.p0093_restore_ip_addresses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void restoreIpAddresses1() {
        List<String> ips = List.of("255.255.11.135", "255.255.111.35");
        assertEquals(ips, new Solution().restoreIpAddresses("25525511135"));
    }

    @Test
    void restoreIpAddresses2() {
        List<String> ips = List.of("0.0.0.0");
        assertEquals(ips, new Solution().restoreIpAddresses("0000"));
    }

    @Test
    void restoreIpAddresses3() {
        List<String> ips = List.of("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
        assertEquals(ips, new Solution().restoreIpAddresses("101023"));
    }
    @Test
    void restoreIpAddresses4() {
        List<String> ips = List.of();
        assertEquals(ips, new Solution().restoreIpAddresses("123456789101112"));
    }

}