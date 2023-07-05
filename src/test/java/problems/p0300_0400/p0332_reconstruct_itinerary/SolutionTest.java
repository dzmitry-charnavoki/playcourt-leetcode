package problems.p0300_0400.p0332_reconstruct_itinerary;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void findItinerary1() {
        List<List<String>> act = List.of(
            List.of("MUC", "LHR"),
            List.of("JFK", "MUC"),
            List.of("SFO", "SJC"),
            List.of("LHR", "SFO"));

        List<String> exp = List.of("JFK", "MUC", "LHR", "SFO", "SJC");
        Assertions.assertThat(exp)
            .containsExactlyInAnyOrderElementsOf(new Solution()
                .findItinerary(act));
    }

    @Test
    void findItinerary2() {
        List<List<String>> act = List.of(
            List.of("JFK", "SFO"),
            List.of("JFK", "ATL"),
            List.of("SFO", "ATL"),
            List.of("ATL", "JFK"),
            List.of("ATL", "SFO"));

        List<String> exp = List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
        Assertions.assertThat(exp)
            .containsExactlyInAnyOrderElementsOf(new Solution()
                .findItinerary(act));
    }

}