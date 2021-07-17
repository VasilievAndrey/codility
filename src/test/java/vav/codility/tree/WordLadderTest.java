package vav.codility.tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordLadderTest {

    @Test
    public void findWordLadderPath() {
        List<String> wordList = Arrays.asList("hot","dog","cog","pot","dot");
        int path = WordLadder.ladderLength("hot", "dog", wordList);
        System.out.println("path: " + path);
    }

    @Test
    public void findWordLadderPath2() {
        List<String> wordList = Arrays.asList("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye");
        int path = WordLadder.ladderLength("qa", "sq", wordList);
        System.out.println("path: " + path);
    }

    @Test
    public void findWordLadderPath3() {
        List<String> wordList = Arrays.asList("hot", "dog", "dot");
        int path = WordLadder.ladderLength("hot", "dog", wordList);
        System.out.println("path: " + path);
    }

}
