package seasonchecker.homework;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("seasonchecker/fizz_or_buzz_game.feature")
public class TestFizzBuzzGameRunner {
}
