package vav.codility.tree;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class CriticalConnectionsInNetworkTest {

    @Test
    public void test() {
        List<List<Integer>> in = asList(asList(0,1),asList(1,2),asList(2,0),asList(1,3));
        List<List<Integer>> exp = asList(asList(1,3));
        assertThat(exp).isEqualTo(new CriticalConnectionsInNetwork().criticalConnections(4, in));
    }

    @Test
    public void test2() {
        List<List<Integer>> in = asList(asList(0,1),asList(1,2),asList(2,0),asList(1,3),asList(3,4),asList(4,5),asList(5,3));
        List<List<Integer>> exp = asList(asList(1,3));
        assertThat(exp).isEqualTo(new CriticalConnectionsInNetwork().criticalConnections(6, in));
    }

    @Test
    public void test3() {
        List<List<Integer>> in = asList(asList(1,0),asList(2,0),asList(3,2),asList(4,2),asList(4,3),asList(3,0),asList(4,0));
        List<List<Integer>> exp = asList(asList(0,1));
        assertThat(exp).isEqualTo(new CriticalConnectionsInNetwork().criticalConnections(5, in));
    }

}
